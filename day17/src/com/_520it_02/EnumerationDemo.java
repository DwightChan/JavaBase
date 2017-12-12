package com._520it_02;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.addElement("123");
		v.addElement("王尼玛");
		v.addElement("王大锤");
		v.addElement("易叫兽");
		
		work(v);
	}
	
	public static void work(Vector v) {
		//
		Enumeration elements = v.elements();
//		hasMoreElements();    判断是否有更多的元素
//		nextElement();        取出下一个元素\
		while (elements.hasMoreElements()) {
			Object obj = elements.nextElement();
			System.out.println(obj);
		}
		
	/*	obj = elements.nextElement();
		System.out.println(obj);

		obj = elements.nextElement();
		System.out.println(obj);
		System.out.println(elements.hasMoreElements());
		
		obj = elements.nextElement();
		System.out.println(obj);
		
		System.out.println(elements.hasMoreElements());*/
		
//		obj = elements.nextElement();//我只有4个元素,但是我取了5次   报错
//		System.out.println(obj);
	}

}
