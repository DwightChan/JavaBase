package com._520it_05;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
//		1������Socket����������󴴽��ɹ�����ʾ��������֣����ӳɹ�������
		//����1:Ŀ���IP��ַ   ����2:Ŀ��˿ں�
		Socket s = new Socket("127.0.0.1", 10086);

		//��ȡ����˷����ҵ�����
		InputStream in = s.getInputStream();
		byte[] b = new byte[1024];
		int len;
		while ((len = in.read(b)) != -1) {
			String name = s.getInetAddress().getHostName();
			System.out.println(name + "-->" + new String(b, 0, len));
		}
		
//		2����ȡ�������д����
		OutputStream out = s.getOutputStream();
		String data = "hello ������";
		out.write(data.getBytes());
		s.shutdownOutput();
		
//		out.close();
		
//		Thread.sleep(10000);
//		3���ر���Դ
		s.close();
	}
}
