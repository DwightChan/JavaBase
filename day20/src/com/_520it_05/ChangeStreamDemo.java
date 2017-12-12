package com._520it_05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ChangeStreamDemo {
	public static void main(String[] args) throws Exception {
		work2();
	}

	private static void work2() throws Exception {
		//输入
		Reader reader = new InputStreamReader(new FileInputStream("e:/1.txt"));
		char[] c = new char[1024];
		int len;
		while ((len = reader.read(c)) != -1) {
			System.out.println(new String(c, 0, len));
		}
		
		reader.close();
	}
	
	private static void work1() throws Exception {
		//输出
		OutputStream out = new FileOutputStream("e:/1.txt");
		Writer writer = new OutputStreamWriter(out);
		
		writer.write("万万没想到,完全是浮云");
		
		writer.close();
	}
}
