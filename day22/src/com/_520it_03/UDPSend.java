package com._520it_03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
	public static void main(String[] args) throws Exception {
//		1：创建DatagramSocket对象
		DatagramSocket ds = new DatagramSocket();
		
//		2：准备数据，打成数据包
		String data = "你是2B";
		byte[] buf = data.getBytes();
		InetAddress address = InetAddress.getLocalHost();
		//参数1:数据字节数组   参数2:数据长度   参数3:目标IP 参数4:目标端口号
		DatagramPacket p = new DatagramPacket(buf, buf.length, address, 10086);
		
//		3：调用方法发送数据包
		ds.send(p);
		
//		4：关闭资源
		ds.close();
	}

	public static void sendAndFun() throws Exception {
		// 1. 创建 datagramsocket 对象
		DatagramSocket ds = new DatagramSocket();
		// 2. 准备数据 打成数据包
		String data = "你是傻逼吗?";
		byte[] buf = data.getBytes();
		InetAddress address = InetAddress.getLocalHost();
		//参数1:数据字节数组   参数2:数据长度   参数3:目标IP 参数4:目标端口号
		DatagramPacket p = new DatagramPacket(buf, buf.length, address, 10086);
		// 3. 调用方法发送数据包
		ds.send(p);
		// 4. 关闭资源
		ds.close();
	}
}
