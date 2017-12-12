package com._520it_06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Upload {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("localhost",10086);
		
		System.out.println("请输入要上传的文件路径:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String path = reader.readLine();
		
		InputStream in = new FileInputStream(path);
		OutputStream out = s.getOutputStream();
		
		byte[] b = new byte[1024 * 1024];
		int len;
		while ((len = in.read(b)) != -1) {
			out.write(b, 0, len);
		}
//		out.flush();
		in.close();
		//告诉对面发完了
		s.shutdownOutput();
		s.close();
	}
}
