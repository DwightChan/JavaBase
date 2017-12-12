package com._520it_02;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("������");
		list.add("����");
		list.add(new Date());
		list.add(10);
		list.add("������");
		list.add("��ʪ");
		
		work2(list);
	}
	
	public static void work2(List list) { 
		ListIterator it = list.listIterator();
		
		//1.��ͷ��β����
		while (it.hasNext()) {
			//ע��:ÿ�ε���next�������������ƶ�1��λ��
//			Object object = it.next();
			System.out.println(it.next());
		}
		System.out.println("----------");
		//2.��β��ͷ
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		it.add("ddd");
		System.out.println(list);
		it.previous();
		it.set("xxx");
		System.out.println(list);
	}
	
	public static void work1(List list) { 
		//��ȡ������
		Iterator it = list.iterator();
		
//		it.next();
//		it.remove();
		//hasNext()  �ж��Ƿ���Ԫ��
		while (it.hasNext()) {
			//remove  ɾ����һ��Ԫ��
//			it.remove();
//			//next()  ȡ����һ��Ԫ��
			Object obj = it.next();
			/*
			 * ʹ�õ������������ϵĹ����в��ܸĶ�Դ���ϵ�Ԫ��
			 */
//			list.add("321");
			System.out.println(obj);
		}
		System.out.println(list);
		
	}
}
