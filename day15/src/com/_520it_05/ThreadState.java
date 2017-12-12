package com._520it_05;

public class ThreadState {
	public static void main(String[] args) throws Exception {
		Thread t = new Thread() {
			@Override
			public void run() {
				try {
					System.in.read();
				} catch (Exception e) {
				}
//				for (int i = 0; i < 100; i++) {
//					System.out.println(i);
//					try {
//						System.in.read();
//					} catch (Exception e) {
//					}
//					try {
//						Thread.sleep(3000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
			}
		};  //此时该线程就是处于新建的状态
		
		t.start();//开启线程running
		System.out.println(t.getState());
		Thread.sleep(1000);
		System.out.println(t.getState());
		
		//什么使用处于退出状态? run方法执行完毕,线程就终止
		//
//		t.start();
	}
}
