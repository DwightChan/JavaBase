package com._520it_05;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		// 1.创建ServerSocket 参数:绑定的端口号
		ServerSocket ss = new ServerSocket(10086);

		// 2：侦听客户端的链接
		Socket s = ss.accept();// 阻塞

		// 回复客户端
		OutputStream out = s.getOutputStream();
		String data = "你也好客户端";
		out.write(data.getBytes());
	
		//告诉对面数据发完了
		s.shutdownOutput();
//		out.close();
		
		// 3：获取输入流读取数据
		InputStream in = s.getInputStream();
		byte[] b = new byte[1024];
		int len;
		while ((len = in.read(b)) != -1) {
			String name = s.getInetAddress().getHostName();
			System.out.println(name + "-->" + new String(b, 0, len));
		}
		
		// 4：关闭资源（服务端一般不关闭）
		s.close();
		ss.close();
	}
}
