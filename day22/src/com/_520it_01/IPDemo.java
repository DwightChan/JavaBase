package com._520it_01;

import java.net.InetAddress;

public class IPDemo {
	public static void main(String[] args) throws Exception {
		//�����������ֻ�ȡ����IP  ������������/IP��ַ/����
		funcLocal();
		funcIp();
		//funcMacName();
	}
	public static void funcLocal() throws Exception {
		InetAddress address = InetAddress.getByName("localhost");
		
		//��ȡ����������
		String name = address.getHostName();
		System.out.println(name);
		
		//��ȡ������IP
		String ip = address.getHostAddress();
		System.out.println(ip);

	}
	public static void funcIp() throws Exception {
		InetAddress address = InetAddress.getByName("192.168.6.28");
		
		//��ȡ����������
		String name = address.getHostName();
		System.out.println(name);
		
		//��ȡ������IP
		String ip = address.getHostAddress();
		System.out.println(ip);
	}
	// DwightMac
	public static void funcMacName() throws Exception {
		InetAddress address = InetAddress.getByName("DwightMac");
		
		//��ȡ����������
		String name = address.getHostName();
		System.out.println(name);
		
		//��ȡ������IP
		String ip = address.getHostAddress();
		System.out.println(ip);
	}
}
