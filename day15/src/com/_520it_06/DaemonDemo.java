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
		
		Thread.sleep(1000);//线程的睡眠
		
		t.setDaemon(true);
		t.start();
		//java.lang.IllegalThreadStateException,这步是必须在开启线程之前完成
//		t.setDaemon(true);
	}
}
