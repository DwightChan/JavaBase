package com._520it_01;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		//��ӵ���λ
		list.offerFirst("������");
		list.offerFirst("������");
		
		list.offerLast("ľ��");
		list.offerLast("ŮƱ");
		
		System.out.println(list);//[������, ������]
		
////		��ȡ����
//		Object obj = list.peekFirst();//�鿴��һ��Ԫ��
//		System.out.println(obj);
//		obj = list.peekLast();
//		System.out.println(obj);
//		
//		obj = list.pollFirst();//ɾ����һ��Ԫ��
//		System.out.println(obj);
//		System.out.println(list);
		
		Object obj = list.pollLast();
		list.offerFirst(obj);
		System.out.println(list);
		
	}
}
