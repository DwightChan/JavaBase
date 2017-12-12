package com._520it_03;

//实现方式
public class ImplementsDemo implements Runnable {
	int appNum = 1000;//可以,但是不建议,这里我们只创建一个本类对象,所有这里不适用static
	
	public void run() {
		while (appNum > 0) {
			//获取当前线程
			Thread thread = Thread.currentThread();
			System.out.println(thread.getName() + "搬走了1箱,剩下" + --appNum);
		}
	}
}
