package com._520it_02;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) throws Exception {
		//����Դ
		String path = "/Users/dwight/Desktop/java/test/1.txt";
		
		//�����ļ��ֽ�����������
		InputStream in = new FileInputStream(path);
		
		//���ж�ȡ����
		work3(in);
		
		//�ر���Դ
		in.close();
		
//		in.read();
	}

	private static void work3(InputStream in) throws Exception {
		//��ȡ�ļ���������Ϣ
		byte[] b = new byte[1024];
		int len;
		
		while ((len = in.read(b)) != -1) {
			System.out.println(new String(b,0,len));
		}
	}
	
	private static void work2(InputStream in) throws Exception {
		//��ȡ��byte������
		byte[] data = new byte[4];
		int len = in.read(data);
		System.out.println(len + "-->" + new String(data));
		len = in.read(data);
		System.out.println(len + "-->" + new String(data, 0, len));
		//�����ļ���ĩβ����-1
		System.out.println(in.read(data));
	}
	
	private static void work1(InputStream in) throws Exception {
		//���������Ǳ�������ַ���Ӧ��ֵ,һ��ֻ��1���ֽ�,����������ļ���ĩβ����-1
		int data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println((char)data);
		data = in.read();
		System.out.println(data);
	}
}
