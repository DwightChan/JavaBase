package com._520it_03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UPDReceive {
	public static void main(String[] args) throws Exception {
//		1：创建DatagramSocket对象   参数:监听的端口号
		DatagramSocket ds = new DatagramSocket(10086);
		
//		2：创建一个数据包
		byte[] buf = new byte[1024];
		DatagramPacket p = new DatagramPacket(buf, buf.length);
		
		while (true) {
	//		3：调用方法接收数据包
			ds.receive(p);//阻塞
					
	//		4：解析数据包
			String hostName = p.getAddress().getHostName();
			buf = p.getData();
			int len = p.getLength();
			int port = p.getPort();
			System.out.println(hostName + ":" + port + "-->" + new String(buf, 0, len));
		}
//		5：关闭资源（接收端一般不关闭）
//		ds.close();
	}
}
