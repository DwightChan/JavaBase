package com._520it_01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//1��������
		Set set = new LinkedHashSet();
		
		set.add("�˰���");
		set.add("������");
		set.add("������");
		set.add("����һ");
		
		System.out.println(set);
		
		for (Object o : set) {
			System.out.println(o);
		}
		
		set = new HashSet();
		set.add("323");
		set.add("111");
		set.add("222");
		
		System.out.println(set);
	}
}
