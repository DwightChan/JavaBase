package com._520it_03;

//¥����1000��ƻ������5��ͬѧȥ��ƻ��������
public class App {
	public static void main(String[] args) {
		//���������ֵ��߳�
		/*new ExtendsDemo("������").start();
		new ExtendsDemo("������").start();
		new ExtendsDemo("����").start();
		new ExtendsDemo("����").start();
		new ExtendsDemo("��ʪ").start();*/
		
		Runnable target = new ImplementsDemo();
		
//		new Thread(target,"������").start();
//		new Thread(target,"������").start();
//		new Thread(target,"����").start();
//		new Thread(target,"�׽���").start();
		Thread thread = new Thread(target,"���ʪ");//?
		thread.start();//?����Ҫ����start���������߳�
	}
}
