package com._520it_06;

public class DaemonDemo {
	public static void main(String[] args) throws Exception {
		Thread thread = Thread.currentThread();
		System.out.println("main:" + thread.isDaemon());
		
		Thread t = new Thread() {
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().isDaemon());
				}
			}
		};
		
		Thread.sleep(1000);//�̵߳�˯��
		
		t.setDaemon(true);
		t.start();
		//java.lang.IllegalThreadStateException,�ⲽ�Ǳ����ڿ����߳�֮ǰ���
//		t.setDaemon(true);
	}
}
