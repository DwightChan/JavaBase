package com._520it_03;

//ʵ�ַ�ʽ
public class ImplementsDemo implements Runnable {
	int appNum = 1000;//����,���ǲ�����,��������ֻ����һ���������,�������ﲻ����static
	
	public void run() {
		while (appNum > 0) {
			//��ȡ��ǰ�߳�
			Thread thread = Thread.currentThread();
			System.out.println(thread.getName() + "������1��,ʣ��" + --appNum);
		}
	}
}
