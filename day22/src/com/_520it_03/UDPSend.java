package com._520it_03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
	public static void main(String[] args) throws Exception {
//		1������DatagramSocket����
		DatagramSocket ds = new DatagramSocket();
		
//		2��׼�����ݣ�������ݰ�
		String data = "����2B";
		byte[] buf = data.getBytes();
		InetAddress address = InetAddress.getLocalHost();
		//����1:�����ֽ�����   ����2:���ݳ���   ����3:Ŀ��IP ����4:Ŀ��˿ں�
		DatagramPacket p = new DatagramPacket(buf, buf.length, address, 10086);
		
//		3�����÷����������ݰ�
		ds.send(p);
		
//		4���ر���Դ
		ds.close();
	}

	public static void sendAndFun() throws Exception {
		// 1. ���� datagramsocket ����
		DatagramSocket ds = new DatagramSocket();
		// 2. ׼������ ������ݰ�
		String data = "����ɵ����?";
		byte[] buf = data.getBytes();
		InetAddress address = InetAddress.getLocalHost();
		//����1:�����ֽ�����   ����2:���ݳ���   ����3:Ŀ��IP ����4:Ŀ��˿ں�
		DatagramPacket p = new DatagramPacket(buf, buf.length, address, 10086);
		// 3. ���÷����������ݰ�
		ds.send(p);
		// 4. �ر���Դ
		ds.close();
	}
}
