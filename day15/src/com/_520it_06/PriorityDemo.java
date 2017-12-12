package com._520it_06;

public class PriorityDemo {
	public static void main(String[] args) {
		//线程的优先级
		Thread t1 = new Thread("1") {
			@Override
			public void run() {
				int i = 0;
				while (i < 1000) {
					System.out.println(getName() + "--" + ++i);
				}
			}
		};
		Thread t2 = new Thread("2") {
			@Override
			public void run() {
				int i = 0;
				while (i < 1000) {
					System.out.println(getName() + "--"  + ++i);
				}
			}
		};
		Thread t3 = new Thread("3") {
			@Override
			public void run() {
				int i = 0;
				while (i < 1000) {
					System.out.println(getName() + "--" + ++i);
				}
			}
		};
		Thread t4 = new Thread("4") {
			@Override
			public void run() {
				int i = 0;
				while (i < 1000) {
					System.out.println(getName() + "--" + ++i);
				}
			}
		};
		
		t2.setPriority(Thread.MAX_PRIORITY);//10
		t3.setPriority(Thread.MIN_PRIORITY);//1
		t4.setPriority(Thread.NORM_PRIORITY);//5
		
		/*System.out.println(t1.getPriority());//5
		System.out.println(t2.getPriority());//10
		System.out.println(t3.getPriority());//1
		System.out.println(t4.getPriority());//5
*/	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
