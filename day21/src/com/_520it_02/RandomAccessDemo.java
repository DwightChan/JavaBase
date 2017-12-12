package com._520it_02;

import java.io.RandomAccessFile;

public class RandomAccessDemo {
	public static void main(String[] args) throws Exception {
		//创建对象
		RandomAccessFile acc = new RandomAccessFile("1.txt", "rw");
		
		//获取文件指针的位置
		long index = acc.getFilePointer();
		System.out.println("index:" + index);
		
		//读写操作
		acc.writeInt(10);
		index = acc.getFilePointer();
		System.out.println("index:" + index);
		
		acc.seek(0);//设置文件指针的位置
		
		int i = acc.readInt();
		System.out.println(i);

		index = acc.getFilePointer();
		System.out.println("index:" + index);

		acc.writeChar('小');
		index = acc.getFilePointer();
		System.out.println("index:" + index);

		acc.seek(2);
		char c = acc.readChar();
		System.out.println(c);

		//关闭资源
		acc.close();
	}
}
