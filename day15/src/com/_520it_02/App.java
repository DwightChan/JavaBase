package com._520it_02;

public class App {
	public static void main(String[] args) {
		ShareData sd = new ShareData();
		//���������������߳�
		new Thread(new Producer(sd)).start();
		//new Thread(new Producer(sd)).start();
		//���������������߳�
		new Thread(new Consumer(sd)).start();
		//new Thread(new Consumer(sd)).start();
	}
}
