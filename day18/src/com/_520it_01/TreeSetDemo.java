package com._520it_01;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//无参构造    自然顺序
		Set set = new TreeSet();
		
		Person p1 = new Person(1,"彼岸花");
		Person p2 = new Person(2,"寻龙诀");
		Person p3 = new Person(-2,"寻龙诀");
		Person p4 = new Person(10,"胡八一");
		Person p5 = new Person(7,"王尼玛");
		Person p6 = new Person(5,"王蜜桃");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		
		System.out.println(set);
		
		/*//添加元素
		set.add(10);
		set.add(5);
		set.add(8);
		set.add(new Integer(8));
		set.add(1);
		
		//存入使用使用的是从小到大的顺序来存储的
		System.out.println(set);
		
		for (Object obj : set) {
			System.out.println(obj);
		}*/
	}
}
