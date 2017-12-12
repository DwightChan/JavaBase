package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyLineBufferedReader extends BufferedReader {
	private int lineNum;
	private BufferedReader reader;
	
	public MyLineBufferedReader(BufferedReader in) {
		super(in);
		this.reader = in;
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
		String name = "E:/逍遥/1125/day02/code/com_520it_04/AssigningDemo.java";
		MyLineBufferedReader reader = new MyLineBufferedReader(new BufferedReader(new FileReader(name)));
		
		String data;
		while ((data = reader.readLine()) != null) {
			System.out.println(data);
		}
		
		reader.close();
	}
}
