package com._520it_01;

import java.net.InetAddress;

public class IPDemo {
	public static void main(String[] args) throws Exception {
		//�����������ֻ�ȡ����IP  ������������/IP��ַ/����
		InetAddress address = InetAddress.getByName("192.168.35.162");
		
		//��ȡ����������
		String name = address.getHostName();
		System.out.println(name);
		
		//��ȡ������IP
		String ip = address.getHostAddress();
		System.out.println(ip);
	}
}
