package com._520it_day8;

public class AbstractDemo {
	public static void main(String[] args) {
//		Ani a = new Ani();//�����಻�ܴ�������
		Ani a = new Dog();//��̬
	}
}
//��һ�������ķ�����û�������ʹ��ʹ�ó���������,����û�з�����
/*
 	�����г��󷽷�,��������ǳ�����
 	�������п���û�г���ķ���
 	
 	abstract���ܺ�final/static/privateһ��ʹ��
 */
abstract class Ani {
	abstract void eat();
	//����û�г��󷽷�
	static void work() {
		System.out.println(111);
	}
}

class Dog extends Ani {
	//����û����д����ķ���,����Ҳ���붨��ɳ�����
	void eat() {
		System.out.println("chi ����");
	}
	
	static void work() {}//�Ƿ������η����
} 
