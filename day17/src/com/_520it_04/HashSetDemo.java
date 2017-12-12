package com._520it_04;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		//1创建对象
		Set set = new HashSet();
		
		//2添加元素
		/*set.add("Z");
		set.add("f");
		//添加成功返回true,否则返回false
		System.out.println(set.add("a"));
		System.out.println(set.add("a"));
		System.out.println(set.add("a"));
		set.add("q");
		set.add("W");
		
		System.out.println(set.size());
		System.out.println(set);*/
		
		Person p1 = new Person(250, "王尼玛");
		Person p2 = new Person(250, "王尼玛");
		
		set.add(p1);
		set.add(p2);
		
		System.out.println(set.size());
		System.out.println(set);
		
	}
}
