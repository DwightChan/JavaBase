package com._520it_04;

public class SynchronizedMethodDemo {
	public static void main(String[] args) {
		Runnable target = new Runnable() {
			int tick = 1000;
			@Override
			public void run() { 
				while (true) {
					if (work()) {
						return;
					}
				}
			}
			
			private synchronized boolean work() {//使用同步方法
				//同步的方法他的同步监听对象是this
				if (tick > 0) {
					Thread thread = Thread.currentThread();
					tick--;
					System.out.println(thread.getName() + "买出了1张票,剩下" + tick);
				} else {
					return true;
				}
				return false;
			}
			
		};//匿名内部类
		
		//创建线程对象,并开启
		new Thread(target , "1").start();
		new Thread(target, "2").start();
		new Thread(target, "3").start();
		new Thread(target, "4").start();
		new Thread(target, "5").start();
	}
}
