package com._520it_02;

/*
  �����߳�,�̳еķ�ʽ
1.�Զ�����̳���Thread�࣬��ô���Զ���������߳��ࣻ
2����дrun���������߳����еĴ�������run�У�
3�������Զ�����Ķ��󣬼��̶߳���
4�������̶߳����start�����������̡߳� 
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// �����̶߳���
		MyThread my = new MyThread();
		// my.run();//���ǵ���run����,���ǵ���start
		my.start();

		for (int i = 0; i < 1000; i++) {
			System.out.println("...������...");
		}
		System.out.println("ɱ�����");

	}

}

class MyThread extends Thread {
	@Override
	public void run() {
		// �߳�Ҫִ�еĴ���
		for (int i = 0; i < 1000; i++) {
			System.out.println("...������...");
		}
		System.out.println("�������");
	}
}
