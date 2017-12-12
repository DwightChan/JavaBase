package com._520it_04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			// 先定义1000张票
			int tick = 1000;
			//1.创建锁对象
			Lock lock = new ReentrantLock();
			
			public void run() { 
				while (true) {
					if (work()) {
						return;
					}
				}
			}
			
			private boolean work() {//使用同步方法
				//同步的方法他的同步监听对象是this
				
				//2.获取锁对象
				lock.lock();
				if (tick > 0) {
					Thread thread = Thread.currentThread();
					tick--;
					System.out.println(thread.getName() + "买出了1张票,剩下" + tick);
					
					//3.释放锁对象
					lock.unlock();
				} else {
					return true;
				}
				return false;
			}
		};

		new Thread(r, "王尼玛").start();
		new Thread(r, "唐马儒").start();
		new Thread(r, "易叫兽").start();
		new Thread(r, "左大湿").start();
		new Thread(r, "王蜜桃").start();

	}
}
