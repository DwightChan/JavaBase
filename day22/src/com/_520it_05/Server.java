package com._520it_05;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		// 1.����ServerSocket ����:�󶨵Ķ˿ں�
		ServerSocket ss = new ServerSocket(10086);

		// 2�������ͻ��˵�����
		Socket s = ss.accept();// ����

		// �ظ��ͻ���
		OutputStream out = s.getOutputStream();
		String data = "��Ҳ�ÿͻ���";
		out.write(data.getBytes());
	
		//���߶������ݷ�����
		s.shutdownOutput();
//		out.close();
		
		// 3����ȡ��������ȡ����
		InputStream in = s.getInputStream();
		byte[] b = new byte[1024];
		int len;
		while ((len = in.read(b)) != -1) {
			String name = s.getInetAddress().getHostName();
			System.out.println(name + "-->" + new String(b, 0, len));
		}
		
		// 4���ر���Դ�������һ�㲻�رգ�
		s.close();
		ss.close();
	}
}
