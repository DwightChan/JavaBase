package com._520it_06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileDownloadServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(10086);
		
		while (true) {
			Socket s = ss.accept();

			BufferedInputStream in = new BufferedInputStream(new FileInputStream("E:/upload/1.bmp"));
			BufferedOutputStream out = new BufferedOutputStream(s.getOutputStream());
			
			byte[] b = new byte[1024];
			int len;
			while ((len = in.read(b)) != -1) {
				out.write(b, 0, len);
			}
			in.close();
			s.shutdownOutput();
			
			s.close();
		}
	}
}
