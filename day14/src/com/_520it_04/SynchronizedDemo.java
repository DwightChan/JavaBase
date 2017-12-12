package com._520it_04;

public class SynchronizedDemo {
	public static void main(String[] args) {
		//���ڻؼ��ˣ����ȥ��վ��Ʊ�����г���1000����λ��Ҳ������1000��Ʊ��ģ��5��������Ʊ���龰
		Runnable r = new Runnable() {
			//�ȶ���1000��Ʊ
			int tick = 1000;
			
			@Override
			public void run() {
				while (true) {
					//ʹ��ͬ����������Խ���̵߳İ�ȫ����
					//ʹ��ͬ��������������ֻ��1���߳̿���ִ������Ĵ���,����Ҫ�ȵ����߳�ִ����,�����̲߳��ܽ���
					synchronized (Object.class) {//ͬ����������Ƕ��߳��е�ͬһ��
						if (tick > 0) {
							//��ȡ�̵߳�����   
							Thread thread = Thread.currentThread();
							tick--;
							System.out.println(thread.getName() + "�����1��Ʊ,ʣ��" + tick);
						} else {
							return;
						}
					}
				}
			}
		};
		
		new Thread(r,"������").start();
		new Thread(r,"������").start();
		new Thread(r,"�׽���").start();
		new Thread(r,"���ʪ").start();
		new Thread(r,"������").start();
	}
}
