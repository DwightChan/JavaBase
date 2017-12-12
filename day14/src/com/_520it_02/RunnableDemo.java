package com._520it_02;

public class RunnableDemo {
	public static void main(String[] args) {
		//创建Runnable接口实现类的对象
		Runnable r = new MyRunnable();
		
		// 创建线程对象,使用Thread的带参的构造方法  接收Runnable接口的实例
		Thread my = new Thread(r);
		// my.run();//不是调用run方法,而是调用start
		my.start();

		for (int i = 0; i < 1000; i++) {
			System.out.println("...查找中...");
		}
		System.out.println("杀毒完毕");
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		//任务代码
		for (int i = 0; i < 1000; i++) {
			System.out.println("...清理中...");
		}
		System.out.println("清理完毕");
	}
}
