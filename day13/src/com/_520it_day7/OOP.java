package com._520it_day7;

//import java.util.*;
import java.util.Arrays; //׼ȷ��˭
//��װ  ����ʵ�ֵ�ϸ��
public class OOP {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("haha");
		
//		java.util.Arrays.toString(new int[]{});
		Arrays.toString(new int[]{});
		//java.lang��ϵͳĬ�ϵ���İ�
	}
}
/*
 1.ʹ��private���γ�Ա���� 
 2.�ṩgetter/setter����
 */
class Person {
	private String name; //��װ

	public Person() {
		this("");//ʹ��String���͵Ĳ���,��Ҫ����һ��String���͵�ֵ
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//this��ʾ��ǰ�Ķ���,˭����this����˭
		this.name = name;
//		getName();   Ĭ�Ͼ���this������
//		this.getName();
	}
	
}
