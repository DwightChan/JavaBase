package com._520it_day8;

//��̬  �������͵ı���ָ����������������
public class App {
	public static void main(String[] args) {
		Cat c = new Cat();
		Animal a = new Cat();// ��̬
		/*
		 * ��������:��� ��������:�ұ� �ö����ʵ������
		 */
		// a.work(); �÷������ڱ���������
		c.work();
		a.getI();
		c.getI();// ����̳й���

		// System.out.println(a.getI());//100 ��̬�������Ǳ�ʾ�����������������
		System.out.println(a.getI());// 10

		((Cat) a).work(); //����ת����   -> ǿת
	}
}

class Animal {
	int i = 10;

	public int getI() {
		return i; // ���ǵ�ǰ��ı���
	}
}

class Cat extends Animal {
	int i = 100;

	public void work() {
	}

	// @Override
	// public int getI() {
	// return 100;
	// }
}