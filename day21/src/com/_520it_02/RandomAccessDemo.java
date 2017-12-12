package com._520it_02;

import java.io.RandomAccessFile;

public class RandomAccessDemo {
	public static void main(String[] args) throws Exception {
		//��������
		RandomAccessFile acc = new RandomAccessFile("1.txt", "rw");
		
		//��ȡ�ļ�ָ���λ��
		long index = acc.getFilePointer();
		System.out.println("index:" + index);
		
		//��д����
		acc.writeInt(10);
		index = acc.getFilePointer();
		System.out.println("index:" + index);
		
		acc.seek(0);//�����ļ�ָ���λ��
		
		int i = acc.readInt();
		System.out.println(i);

		index = acc.getFilePointer();
		System.out.println("index:" + index);

		acc.writeChar('С');
		index = acc.getFilePointer();
		System.out.println("index:" + index);

		acc.seek(2);
		char c = acc.readChar();
		System.out.println(c);

		//�ر���Դ
		acc.close();
	}
}
