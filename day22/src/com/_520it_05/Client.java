package com._520it_05;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
//		1：创建Socket对象（如果对象创建成功，表示完成三握手，连接成功创建）
		//参数1:目标的IP地址   参数2:目标端口号
		Socket s = new Socket("127.0.0.1", 10086);

		//读取服务端发给我的数据
		InputStream in = s.getInputStream();
		byte[] b = new byte[1024];
		int len;
		while ((len = in.read(b)) != -1) {
			String name = s.getInetAddress().getHostName();
			System.out.println(name + "-->" + new String(b, 0, len));
		}
		
//		2：获取输出流，写数据
		OutputStream out = s.getOutputStream();
		String data = "hello 服务器";
		out.write(data.getBytes());
		s.shutdownOutput();
		
//		out.close();
		
//		Thread.sleep(10000);
//		3：关闭资源
		s.close();
	}
}
