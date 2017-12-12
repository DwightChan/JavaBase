package com._520it_01;

import java.net.InetAddress;

public class IPDemo {
	public static void main(String[] args) throws Exception {
		//根据主机名字获取主机IP  参数是主机名/IP地址/域名
		InetAddress address = InetAddress.getByName("192.168.35.162");
		
		//获取主机的名称
		String name = address.getHostName();
		System.out.println(name);
		
		//获取主机的IP
		String ip = address.getHostAddress();
		System.out.println(ip);
	}
}
