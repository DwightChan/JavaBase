package com._520it_03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UPDReceive {
	public static void main(String[] args) throws Exception {
//		1������DatagramSocket����   ����:�����Ķ˿ں�
		DatagramSocket ds = new DatagramSocket(10086);
		
//		2������һ�����ݰ�
		byte[] buf = new byte[1024];
		DatagramPacket p = new DatagramPacket(buf, buf.length);
		
		while (true) {
	//		3�����÷����������ݰ�
			ds.receive(p);//����
					
	//		4���������ݰ�
			String hostName = p.getAddress().getHostName();
			buf = p.getData();
			int len = p.getLength();
			int port = p.getPort();
			System.out.println(hostName + ":" + port + "-->" + new String(buf, 0, len));
		}
//		5���ر���Դ�����ն�һ�㲻�رգ�
//		ds.close();
	}
}
