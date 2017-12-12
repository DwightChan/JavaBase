package com._520it_02;

public class Consumer implements Runnable {

	private ShareData sd;
	
	public Consumer(ShareData sd) {
		super();
		this.sd = sd;
	}

	@Override
	public void run() {
		//消费的功能
		for (int i = 0; i < 100; i++) {
			sd.take();
		}
	}
}
