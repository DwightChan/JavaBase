package com._520it_04;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Date;

public class SystemStreamDemo {
	public static void main(String[] args) throws Exception {
		
		work();
		
		//带有缓存的打印流
		PrintStream ps = System.out;
		ps.println("aaaa");
		ps.println("aaaa");
		ps.println("aaaa");
		ps.print(new Date());
		
		//这个err的打印流是用来打印错误信息,立即打印出来
		ps = System.err;
		ps.println("aaaa");
		ps.println("aaaa");
		ps.println("aaaa");
		
		/*//获取默认输入流
		InputStream in = System.in;
		System.out.println(in.read());*/
	}

	private static void work() throws Exception {
		InputStream in = new FileInputStream("e:/1.txt");
		//重新分配输入流
		System.setIn(in);
		
		//重新分配默认输出流
		PrintStream out = new PrintStream("e:/2.txt");
		System.setOut(out);
	}
}
