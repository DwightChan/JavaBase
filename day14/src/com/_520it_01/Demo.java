package com._520it_01;

public class Demo {
	public static void main(String[] args) {
		//1.����ɱ������
		kill();
		//2.����������
		clean();
	}
	
	public static void kill() {
		for (int i = 0 ; i < 100 ; i++) {
			System.out.println("...������...");
		}
		System.out.println("ɱ�����");
	}
	
	public static void clean() {
		for (int i = 0 ; i < 100 ; i++) {
			System.out.println("...������...");
		}
		System.out.println("�������");
	} 
}
