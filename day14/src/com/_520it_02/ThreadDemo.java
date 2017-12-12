package com._520it_02;

/*
  创建线程,继承的方式
1.自定义类继承于Thread类，那么该自定义类就是线程类；
2．覆写run方法，将线程运行的代码存放在run中；
3．创建自定义类的对象，即线程对象；
4．调用线程对象的start方法，启动线程。 
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// 创建线程对象
		MyThread my = new MyThread();
		// my.run();//不是调用run方法,而是调用start
		my.start();

		for (int i = 0; i < 1000; i++) {
			System.out.println("...查找中...");
		}
		System.out.println("杀毒完毕");

	}

}

class MyThread extends Thread {
	@Override
	public void run() {
		// 线程要执行的代码
		for (int i = 0; i < 1000; i++) {
			System.out.println("...清理中...");
		}
		System.out.println("清理完毕");
	}
}
