package com._520it_01;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//�޲ι���    ��Ȼ˳��
		Set set = new TreeSet();
		
		Person p1 = new Person(1,"�˰���");
		Person p2 = new Person(2,"Ѱ����");
		Person p3 = new Person(-2,"Ѱ����");
		Person p4 = new Person(10,"����һ");
		Person p5 = new Person(7,"������");
		Person p6 = new Person(5,"������");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		
		System.out.println(set);
		
		/*//���Ԫ��
		set.add(10);
		set.add(5);
		set.add(8);
		set.add(new Integer(8));
		set.add(1);
		
		//����ʹ��ʹ�õ��Ǵ�С�����˳�����洢��
		System.out.println(set);
		
		for (Object obj : set) {
			System.out.println(obj);
		}*/
	}
}
