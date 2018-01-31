package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyLineBufferedReader extends BufferedReader {
	private int lineNum;
	private BufferedReader reader; // 自己也要维护一份
	
	public MyLineBufferedReader(BufferedReader in) {
		super(in);			// 传给父类
		this.reader = in; 	// 自己维护的一份
	}
	
	//觉得readLine方法没有行号,不爽
	@Override
	public String readLine() throws IOException {
		String data = reader.readLine();
		if (data == null) {
			return null;
		}
		return ++lineNum + "-->" + data;
	}
	
	public static void main(String[] args) throws Exception {
		String name = "/Users/dwight/Desktop/github/JavaBase/day17/src/com/_520it_02/ForeachDemo.java";
		MyLineBufferedReader reader = new MyLineBufferedReader(new BufferedReader(new FileReader(name)));
		
		String data;
		while ((data = reader.readLine()) != null) {
			System.out.println(data);
		}
		
		reader.close();
	}
}
