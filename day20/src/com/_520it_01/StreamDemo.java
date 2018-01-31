package com._520it_01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamDemo {
	public static void main(String[] args) throws Exception {
		String name = "/Users/dwight/Desktop/java/test/1.txt";
		
		InputStream in = new FileInputStream(name);
		
		work1(in);
		
		in.close();
	}

	private static void work1(InputStream in) throws IOException {
		byte[] b = new byte[4];
		
		int len;
		while ((len = in.read(b)) != -1) {
			System.out.println(new String(b, 0, len));
		}
	}
}
