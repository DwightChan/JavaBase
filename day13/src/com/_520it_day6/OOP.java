package com._520it_day6;

public class OOP {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "����";
		p.age = 30;
		
		p.eat();
		System.out.println(p);
		p.up();
		System.out.println("lv:" + Person.lv);
		
		int i = 0;
		if (true) {
			int j;//û��Ĭ��ֵ,û�п����ڴ�ռ�
		}
		
		Person pp = new Person("������", 33);
		System.out.println(pp);
		
		System.out.println("lv:" + Person.lv);
	}
}

class Person {
	//��ж�ؾ�̬�ǳɱ�������
	static int lv;//�����ȼ�  ���������еĶ���������   
	
	//״̬  ʹ�ó�Ա����
	//����GC
	String name;  //������״̬
	int age;      //��������
	
	//��д�и�Ĭ�ϵ�   �޲οշ�����   Person(){}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		this(null,0);
	}

	//��Ϊ  ʹ�÷���
	public void eat() {
		System.out.println("...eat...");
	}

	public void up() {
		lv++;
	}
	
	@Override //alt + s
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
