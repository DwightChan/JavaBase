package com._520it_06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String[] args) throws Exception {
		work2();
	}

	private static void work2() throws Exception {
		//字符包装流
	/*	BufferedWriter writer = new BufferedWriter(new FileWriter("e:/1.txt"));
		
		writer.write("123外卖网VS美团外卖");
		writer.newLine();//换行
		writer.write("123外卖网VS美团外卖");
		
		writer.close();*/
		
		String name = "E:/逍遥/1125/day02/code/com_520it_04/ArithmeticDemo.java";
		BufferedReader reader = new BufferedReader(new FileReader(name));
//		String data = reader.readLine();//读取一行数据 读完返回null
		String data;
		while ((data = reader.readLine()) != null) {
			System.out.println(data);
		}
		
		reader.close();
	}
	
	private static void work1() throws Exception {
		//字节包装流
		String name = "E:/逍遥/1125/eclipse-jee-mars-R-win32.zip";
		BufferedInputStream is = new BufferedInputStream(new FileInputStream(name));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("d:/1.zip"));
//		InputStream is = new FileInputStream(name);
		long s = System.currentTimeMillis();
		
		byte[] buf = new byte[1024];
		int len;
		while ((len = is.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		
		//344

		System.out.println(System.currentTimeMillis() - s);  //4126  138
		//只关闭包装流即可
		is.close();
		out.close();
	}
}
