package com._520it_02;

public class App {
	public static void main(String[] args) {
		ShareData sd = new ShareData();
		//开启两个生产者线程
		new Thread(new Producer(sd)).start();
		//new Thread(new Producer(sd)).start();
		//开启两个消费者线程
		new Thread(new Consumer(sd)).start();
		//new Thread(new Consumer(sd)).start();
	}
}
