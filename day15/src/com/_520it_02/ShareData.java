package com._520it_02;

public class ShareData {
	private String name;
	private String taste;
	
	private boolean flag;//默认false 表示没有数据

	public synchronized void add(String name, String taste) {
		try {
			if (flag) {//没有数据的使用就添加,有就等待    false没有不等
				this.wait();//由同步监听对象来调用
			}
			
			this.name = name;
			Thread.sleep(10);
			this.taste = taste;
			System.out.println("--生产了--:" + name + ",口味是:" + taste);
			
			flag = true;//改变标记
			this.notify();//唤醒消费者线程来消费
		} catch (Exception e) {
		}
	} 
	
	public synchronized void take() {
		try {
			if (!flag) {//没有数据就等待
				this.wait();
			}
			
			Thread.sleep(10);
			System.out.println("消费了:" + name + ",口味是:" + taste);
			
			flag = false;
			this.notify();//告诉生产者线程来生产
		} catch (Exception e) {
		}
	} 
}
