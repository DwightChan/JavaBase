package com._520it_04;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Date;

public class SystemStreamDemo {
	public static void main(String[] args) throws Exception {
		
		work();
		
		//带有缓存的打印流 不是立即执行的
		PrintStream ps = System.out;
		ps.println("aaaa");
		ps.println("aa2983479823489aa");
		ps.println("aaaa");
		ps.print(new Date());
		System.out.println("23jsdalf");
		
		//这个err的打印流是用来打印错误信息,立即打印出来
		ps = System.err;
		ps.println("aaaa");
		ps.println("aaaa");
		ps.println("aaaa");
		
		//获取默认输入流
		InputStream in = System.in;
		System.out.println(in.read());
	}

	private static void work() throws Exception {
		InputStream in = new FileInputStream("/Users/dwight/Desktop/java/test/1.txt");
		//重新分配输入流
		System.setIn(in);
		
		//重新分配默认输出流
//		PrintStream out = new PrintStream("/Users/dwight/Desktop/java/test/2.txt");
//		System.setOut(out);
	}
}
