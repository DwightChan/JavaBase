package com._520it_04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			// �ȶ���1000��Ʊ
			int tick = 1000;
			//1.����������
			Lock lock = new ReentrantLock();
			
			public void run() { 
				while (true) {
					if (work()) {
						return;
					}
				}
			}
			
			private boolean work() {//ʹ��ͬ������
				//ͬ���ķ�������ͬ������������this
				
				//2.��ȡ������
				lock.lock();
				if (tick > 0) {
					Thread thread = Thread.currentThread();
					tick--;
					System.out.println(thread.getName() + "�����1��Ʊ,ʣ��" + tick);
					
					//3.�ͷ�������
					lock.unlock();
				} else {
					return true;
				}
				return false;
			}
		};

		new Thread(r, "������").start();
		new Thread(r, "������").start();
		new Thread(r, "�׽���").start();
		new Thread(r, "���ʪ").start();
		new Thread(r, "������").start();

	}
}
