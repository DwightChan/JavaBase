package com._520it_02;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//自定义比较器的方式
		Set set = new TreeSet(new MyComparator());
		
		Person p1 = new Person(100, "胡八一");
		Person p2 = new Person(200, "王尼玛");
		Person p3 = new Person(250, "王大锤");
		Person p4 = new Person(150, "易叫兽");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set);
	}
}
