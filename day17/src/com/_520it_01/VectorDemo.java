package com._520it_01;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//1.创建对象
		Vector v = new Vector();
		
		//2.使用方法  添加
		v.addElement("张三");
		v.add("张三");
		/*
		 * add 和 addElement是没有区别的,只是版本的原因保留下来
		 */
		v.addElement(123);
		v.add("张三");
		
		//3.查看有多少元素\
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v);
		
//		v.removeElement(123);
		v.remove(Integer.valueOf(123));
		System.out.println(v.size());
		System.out.println(v);
		
		v.setElementAt("大事件", 0);
		System.out.println(v.size());
		System.out.println(v);
		
	}
}
