package com._520it_03;

import java.util.Date;

public class App {
	public static void main(String[] args) {
		MyList list = new MyList();
		
		list.add("Sss..");
		list.add(123);//自动装箱
		list.add(new Date());
		
		System.out.println(list.isEmpty());
		System.out.println(list);
		System.out.println(list.size());
		
		list.clear();//删除所有元素
		System.out.println(list.isEmpty());
		System.out.println(list);
		System.out.println(list.size());
	}
}
