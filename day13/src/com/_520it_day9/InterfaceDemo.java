package com._520it_day9;

public class InterfaceDemo {
/*
 Java�нӿ��������涨��������ʲô����,��һ�ֹ淶
   �������ǳ���
  ��Ա��������public static final���͵�
  �ӿڲ���ʵ����
 */
	public static void main(String[] args) {
//		new IWalkable();  ����,����ʵ����
		Cat c = new Cat();
		IWalkable i = new Cat();//��̬  �Ժ󿴵��Ķ�̬���ǽӿں�ʵ�������ʽ
		System.out.println(IWalkable.I);//20
	}
}

interface IWalkable {
	int I = 20;
	void walk();
}

class Cat implements IWalkable {  //�ӿں�ʵ��������...��ϵ
	int i = 10;
	
	@Override
	public void walk() {
		System.out.println("mmmm...zou");
	}
	
}
