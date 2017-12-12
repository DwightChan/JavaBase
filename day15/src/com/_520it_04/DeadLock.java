package com._520it_04;

public class DeadLock {
	public static void main(String[] args) throws Exception {
		Object o1 = new Object();
		Object o2 = new Object();
		
		new Thread() {
			@Override
			public void run() {
				synchronized (o1) {
					System.out.println("11");
					while (true) {
						synchronized (o2) {
							System.out.println("22");
						}
					}
				}
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				synchronized (o2) {
					System.out.println("2222");
					while (true) {
						synchronized (o1) {
							System.out.println("1111");
						}
					}
				}
			}
		}.start();
		
	}
}
