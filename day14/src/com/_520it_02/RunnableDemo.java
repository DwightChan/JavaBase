package com._520it_02;

public class RunnableDemo {
	public static void main(String[] args) {
		//����Runnable�ӿ�ʵ����Ķ���
		Runnable r = new MyRunnable();
		
		// �����̶߳���,ʹ��Thread�Ĵ��εĹ��췽��  ����Runnable�ӿڵ�ʵ��
		Thread my = new Thread(r);
		// my.run();//���ǵ���run����,���ǵ���start
		my.start();

		for (int i = 0; i < 1000; i++) {
			System.out.println("...������...");
		}
		System.out.println("ɱ�����");
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		//�������
		for (int i = 0; i < 1000; i++) {
			System.out.println("...������...");
		}
		System.out.println("�������");
	}
}
