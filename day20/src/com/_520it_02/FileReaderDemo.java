package com._520it_02;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo {
	public static void main(String[] args) throws Exception {
		//确定源
		String name = "e:/1.txt";
		
		//创建流对象
		Reader reader = new FileReader(name);
		
		work2(reader);
		
		//关闭资源
		reader.close();
	}

	private static void work2(Reader reader) throws Exception {
		//定义缓冲区
		char[] c = new char[2];
		//读取操作
		int len; 
		while ((len = reader.read(c)) != -1) {
			System.out.print(new String(c, 0, len));
		}
	}
	
	private static void work1(Reader reader) throws Exception {
		//读取操作
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
