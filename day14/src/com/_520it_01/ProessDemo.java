package com._520it_01;

//Java�д������̵ķ���
public class ProessDemo {
	public static void main(String[] args) throws Exception {
		Runtime run = Runtime.getRuntime();
		Process exec = run.exec("calc");//��������
//		exec.destroy();//ɱ������
	}
}
