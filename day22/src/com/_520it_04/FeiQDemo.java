package com._520it_04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class FeiQDemo {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		
		String data = "1:100:���ڼ�����:super:32:���Ұ칫������,���������ĺ���";
		byte[] buf = data.getBytes();
		/*
		�汾�ţ�1��
		��ʶ���ţ�100��
		�û���
		������
		������32��ʾ������Ϣ��
		���͵�����
		 */
//		192.168.35.173
		DatagramPacket p = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.35.255"), 2425);
	
		ds.send(p);
		
		ds.close();
	}
}
