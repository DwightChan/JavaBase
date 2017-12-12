package com._520it_01;

//Java中创建进程的方法
public class ProessDemo {
	public static void main(String[] args) throws Exception {
		Runtime run = Runtime.getRuntime();
		Process exec = run.exec("calc");//创建进程
//		exec.destroy();//杀掉进程
	}
}
