package com._520it_04;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Date;

public class SystemStreamDemo {
	public static void main(String[] args) throws Exception {
		
		work();
		
		//���л���Ĵ�ӡ��
		PrintStream ps = System.out;
		ps.println("aaaa");
		ps.println("aaaa");
		ps.println("aaaa");
		ps.print(new Date());
		
		//���err�Ĵ�ӡ����������ӡ������Ϣ,������ӡ����
		ps = System.err;
		ps.println("aaaa");
		ps.println("aaaa");
		ps.println("aaaa");
		
		/*//��ȡĬ��������
		InputStream in = System.in;
		System.out.println(in.read());*/
	}

	private static void work() throws Exception {
		InputStream in = new FileInputStream("e:/1.txt");
		//���·���������
		System.setIn(in);
		
		//���·���Ĭ�������
		PrintStream out = new PrintStream("e:/2.txt");
		System.setOut(out);
	}
}
