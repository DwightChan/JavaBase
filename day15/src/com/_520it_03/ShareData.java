package com._520it_03;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShareData {
	private String name;
	private String taste;
	
	//使用锁机制
	private Lock lock = new ReentrantLock();
	
	//获取到Condition,作用是替代wait/notify/notifyAll
	private Condition con = lock.newCondition();
	
	private boolean flag;//默认false 表示没有数据

	public void add(String name, String taste) {
		try {
			lock.lock();
			if (flag) {//没有数据的使用就添加,有就等待    false没有不等
				con.await();//线程等待
			}
			
			this.name = name;
			Thread.sleep(10);
			this.taste = taste;
			System.out.println("--生产了--:" + name + ",口味是:" + taste);
			
			flag = true;//改变标记
			
			con.signal();//唤醒线程
		} catch (Exception e) {
			//throw new RuntimeException(e);
		} finally {
			lock.unlock();
		}
	} 
	
	public void take() {
		try {
			lock.lock();
			if (!flag) {//没有数据就等待
				con.await();
			}
			
			Thread.sleep(10);
			System.out.println("消费了:" + name + ",口味是:" + taste);
			
			flag = false;

			con.signal();
		} catch (Exception e) {
			//throw new RuntimeException(e);
		} finally {
			lock.unlock();
		}
	} 
}
