package com._520it_01;

public class Consumer implements Runnable {

	private ShareData sd;
	
	public Consumer(ShareData sd) {
		super();
		this.sd = sd;
	}

	@Override
	public void run() {
		//���ѵĹ���
		for (int i = 0; i < 500; i++) {
			sd.take();
		}
	}
}
