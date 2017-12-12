package com._520it_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Fei2 {
	public static void main(String[] args) {
		//专门负责发送
		new Thread(new Runnable() {
			@Override
			public void run() {
				try (	DatagramSocket ds= new DatagramSocket();
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
					while (true) {
						String data = br.readLine();
						if ("88".equals(data)) {
							System.exit(0);
						}
						
						byte[] buf = data.getBytes();
						DatagramPacket p = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10010);
					
						ds.send(p);
					}
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		}).start();
		
		//负责接收数据
		new Thread(new Runnable() {
			@Override
			public void run() {
				try (DatagramSocket ds = new DatagramSocket(10086)) {
					while (true) {
						DatagramPacket p = new DatagramPacket(new byte[1024], 1024);
						
						ds.receive(p);
						
						String name = p.getAddress().getHostName();
						byte[] data = p.getData();
						int len = p.getLength();
						
						System.out.println(name + "-->" + new String(data, 0, len));
					}
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		}).start();
	}
}
