package com._520it_04;

public class SynchronizedMethodDemo {
	public static void main(String[] args) {
		Runnable target = new Runnable() {
			int tick = 1000;
			@Override
			public void run() { 
				while (true) {
					if (work()) {
						return;
					}
				}
			}
			
			private synchronized boolean work() {//ʹ��ͬ������
				//ͬ���ķ�������ͬ������������this
				if (tick > 0) {
					Thread thread = Thread.currentThread();
					tick--;
					System.out.println(thread.getName() + "�����1��Ʊ,ʣ��" + tick);
				} else {
					return true;
				}
				return false;
			}
			
		};//�����ڲ���
		
		//�����̶߳���,������
		new Thread(target , "1").start();
		new Thread(target, "2").start();
		new Thread(target, "3").start();
		new Thread(target, "4").start();
		new Thread(target, "5").start();
	}
}
