package com._520it_01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();  //��ʹ�����з���ʱ,ͳͳʹ�ýӿ�����������
		
		list.add("123");
		list.add("������");
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
		
//		��an�����е�Ԫ�ش浽list��
//		list.addAll(an);
//		System.out.println(list.size());
//		System.out.println(list);
		
//		list.add(an);
//		System.out.println(list.size());//7
//		System.out.println(list);
		
//		list.add(3, "����");
//		System.out.println(list.size());//7
//		System.out.println(list);
		
//		System.out.println(list.contains("����1��"));
//		System.out.println(list.indexOf("����"));
//		System.out.println(list.get(1));
//		list.remove(4);
//		list.remove(Integer.valueOf(123));
//		System.out.println(list.size());
//		System.out.println(list);
		
		
		
//		list = new Vector();//Ӳ����   Spring --> IOC����java.util.Vector
	}
}
