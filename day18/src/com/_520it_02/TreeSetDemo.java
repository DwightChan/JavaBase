package com._520it_02;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//�Զ���Ƚ����ķ�ʽ
		Set set = new TreeSet(new MyComparator());
		
		Person p1 = new Person(100, "����һ");
		Person p2 = new Person(200, "������");
		Person p3 = new Person(250, "����");
		Person p4 = new Person(150, "�׽���");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set);
	}
}
