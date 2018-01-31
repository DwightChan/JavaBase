package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyLineBufferedReader extends BufferedReader {
	private int lineNum;
	private BufferedReader reader; // �Լ�ҲҪά��һ��
	
	public MyLineBufferedReader(BufferedReader in) {
		super(in);			// ��������
		this.reader = in; 	// �Լ�ά����һ��
	}
	
	//����readLine����û���к�,��ˬ
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
