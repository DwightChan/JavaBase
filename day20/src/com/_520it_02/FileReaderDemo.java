package com._520it_02;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo {
	public static void main(String[] args) throws Exception {
		//ȷ��Դ
		String name = "e:/1.txt";
		
		//����������
		Reader reader = new FileReader(name);
		
		work2(reader);
		
		//�ر���Դ
		reader.close();
	}

	private static void work2(Reader reader) throws Exception {
		//���建����
		char[] c = new char[2];
		//��ȡ����
		int len; 
		while ((len = reader.read(c)) != -1) {
			System.out.print(new String(c, 0, len));
		}
	}
	
	private static void work1(Reader reader) throws Exception {
		//��ȡ����
		int data = reader.read();
		System.out.print((char)data);
		data = reader.read();
		System.out.print((char)data);
		data = reader.read();
		System.out.print((char)data);
		data = reader.read();
		System.out.print((char)data);
		data = reader.read();
		System.out.print(data);
	}
}
