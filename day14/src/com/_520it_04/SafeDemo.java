package com._520it_04;

public class SafeDemo {
	public static void main(String[] args) {
		//���ڻؼ��ˣ����ȥ��վ��Ʊ�����г���1000����λ��Ҳ������1000��Ʊ��ģ��5��������Ʊ���龰
		Runnable r = new Runnable() {
			//�ȶ���1000��Ʊ
			int tick = 1000;
			
			@Override
			public void run() {
				while (tick > 0) {
					//��ȡ�̵߳�����
					Thread thread = Thread.currentThread();
					tick--;
					System.out.println(thread.getName() + "�����1��Ʊ,ʣ��" + tick);
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
