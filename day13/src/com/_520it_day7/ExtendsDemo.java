package com._520it_day7;

public class ExtendsDemo {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.sleep();
		System.out.println(c);
	}
}

class Animal {
	int i;
	
	public Animal(int i) {
		System.out.println("fu" + i);
		this.i = i;
	}
	
	public void sleep() {
		System.out.println("Zz...");
	}
}

class Cat extends Animal {
	int i = 0;
	//˽�еĲ��ܻ�ȡ   public/protected�Ŀ��Ի�ȡ  Ĭ�ϵ���ͬ��������¿��Ի�ȡ
	Cat() {
		//û��дsuperҲ����ø�����޲ι���
		//��������ڳ�ʼ��ʱ,����ø���Ĺ��췽��
		super(10);//����û���޲ι���,����ʹ��super���ø�����вι���
		System.out.println("zi" + super.i);
	}
	/*
	  һͬ��Сһ��
	  ��������ͬ
	 ����ֵ�����Ǹ��෽���з���ֵ���͵��������      �쳣(�ȸ��෽�����쳣����ҪС, ���ܳ����µ��쳣)
	 �������η���Ȩ�޸�����߱���
	 //��д���ڼ̳еĻ�����
	 */
	@Override
	public void sleep() {
		System.out.println("mmmmm.....");
		super.sleep();//super��ʾ���ø���ĳ�Ա
	}
	
	@Override
	public String toString() {
		return "[Cat] i=" + i;
	}
}
