package com._520it_01;

public class Demo {
	public static void main(String[] args) {
		//1.调用杀毒功能
		kill();
		//2.调用清理功能
		clean();
	}
	
	public static void kill() {
		for (int i = 0 ; i < 100 ; i++) {
			System.out.println("...查找中...");
		}
		System.out.println("杀毒完毕");
	}
	
	public static void clean() {
		for (int i = 0 ; i < 100 ; i++) {
			System.out.println("...清理中...");
		}
		System.out.println("清理完毕");
	} 
}
