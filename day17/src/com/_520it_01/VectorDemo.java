package com._520it_01;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//1.��������
		Vector v = new Vector();
		
		//2.ʹ�÷���  ���
		v.addElement("����");
		v.add("����");
		/*
		 * add �� addElement��û�������,ֻ�ǰ汾��ԭ��������
		 */
		v.addElement(123);
		v.add("����");
		
		//3.�鿴�ж���Ԫ��\
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v);
		
//		v.removeElement(123);
		v.remove(Integer.valueOf(123));
		System.out.println(v.size());
		System.out.println(v);
		
		v.setElementAt("���¼�", 0);
		System.out.println(v.size());
		System.out.println(v);
		
	}
}
