package com._520it_03;

//ʹ�ü̳еķ�ʽ
public class ExtendsDemo extends Thread {
	static int appNum = 1000; //��Ƴɾ�̬Ϊ������Ķ�������1000��
	
	public ExtendsDemo(String name) {
		super(name);
	}

	@Override
	public void run() {
		while (appNum > 0) {
//			System.out.println(--appNum);//�����ĸ��̰߳��ߵ�,ʣ�µ�����
			System.out.println(getName() + "������1��,ʣ��" + --appNum);
		}
	}
}
