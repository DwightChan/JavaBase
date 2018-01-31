package com._520it_02;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) throws Exception {
		//定义源
		String path = "/Users/dwight/Desktop/java/test/1.txt";
		
		//创建文件字节输入流对象
		InputStream in = new FileInputStream(path);
		
		//进行读取操作
		work3(in);
		
		//关闭资源
		in.close();
		
//		in.read();
	}

	private static void work3(InputStream in) throws Exception {
		//读取文件的所有信息
		byte[] b = new byte[1024];
		int len;
		
		while ((len = in.read(b)) != -1) {
			System.out.println(new String(b,0,len));
		}
	}
	
	private static void work2(InputStream in) throws Exception {
		//读取到byte数组中
		byte[] data = new byte[4];
		int len = in.read(data);
		System.out.println(len + "-->" + new String(data));
		len = in.read(data);
		System.out.println(len + "-->" + new String(data, 0, len));
		//读到文件的末尾返回-1
		System.out.println(in.read(data));
	}
	
	private static void work1(InputStream in) throws Exception {
		//读回来的是编码表中字符对应的值,一次只读1个字节,如果读到了文件的末尾返回-1
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
