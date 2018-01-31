package com._520it_06;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUploadServer {
	public static void main(String[] args) throws Exception {
		/// 服务端口
		ServerSocket ss = new ServerSocket(10086);
		
		while (true) {
			Socket s = ss.accept();
			
			InputStream in = s.getInputStream();
			OutputStream out = new FileOutputStream("e:/upload/1.bmp");
			
			int data;
			while ((data = in.read()) != -1) {
				out.write(data);
			}
			
			out.close();
			s.close();
		}
		
		//服务器不关闭
	}
}
