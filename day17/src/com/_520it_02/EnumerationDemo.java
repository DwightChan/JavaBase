package com._520it_02;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.addElement("123");
		v.addElement("������");
		v.addElement("����");
		v.addElement("�׽���");
		
		work(v);
	}
	
	public static void work(Vector v) {
		//
		Enumeration elements = v.elements();
//		hasMoreElements();    �ж��Ƿ��и����Ԫ��
//		nextElement();        ȡ����һ��Ԫ��\
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
		
//		obj = elements.nextElement();//��ֻ��4��Ԫ��,������ȡ��5��   ����
//		System.out.println(obj);
	}

}
