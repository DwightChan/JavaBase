package com._520it_04;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		//1��������
		Set set = new HashSet();
		
		//2���Ԫ��
		/*set.add("Z");
		set.add("f");
		//��ӳɹ�����true,���򷵻�false
		System.out.println(set.add("a"));
		System.out.println(set.add("a"));
		System.out.println(set.add("a"));
		set.add("q");
		set.add("W");
		
		System.out.println(set.size());
		System.out.println(set);*/
		
		Person p1 = new Person(250, "������");
		Person p2 = new Person(250, "������");
		
		set.add(p1);
		set.add(p2);
		
		System.out.println(set.size());
		System.out.println(set);
		
	}
}
