package com._520it_01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();  //不使用特有方法时,统统使用接口类型来声明
		
		list.add("123");
		list.add("王尼玛");
		list.add("123");
		
		list.add(123);
		list.add(null);
		System.out.println(list.size());
		System.out.println(list);
		
		list.set(0, new Date());
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list.isEmpty());
		
		System.out.println(list.size());
		System.out.println(list);
		
//		List an = new ArrayList();
//		an.add("wang");
//		an.add("ni");
//		an.add("ma");
		
//		把an集合中的元素存到list中
//		list.addAll(an);
//		System.out.println(list.size());
//		System.out.println(list);
		
//		list.add(an);
//		System.out.println(list.size());//7
//		System.out.println(list);
		
//		list.add(3, "王大锤");
//		System.out.println(list.size());//7
//		System.out.println(list);
		
//		System.out.println(list.contains("王大1锤"));
//		System.out.println(list.indexOf("王大锤"));
//		System.out.println(list.get(1));
//		list.remove(4);
//		list.remove(Integer.valueOf(123));
//		System.out.println(list.size());
//		System.out.println(list);
		
		
		
//		list = new Vector();//硬编码   Spring --> IOC工厂java.util.Vector
	}
}
