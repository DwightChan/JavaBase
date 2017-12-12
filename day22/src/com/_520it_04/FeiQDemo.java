package com._520it_04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class FeiQDemo {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		
		String data = "1:100:隔壁家老王:super:32:到我办公室来下,交代你做的好事";
		byte[] buf = data.getBytes();
		/*
		版本号（1）
		标识包号（100）
		用户名
		主机名
		动作（32表示发送消息）
		发送的内容
		 */
//		192.168.35.173
		DatagramPacket p = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.35.255"), 2425);
	
		ds.send(p);
		
		ds.close();
	}
}
