package com._520it_01;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		//添加到首位
		list.offerFirst("王尼玛");
		list.offerFirst("王蜜桃");
		
		list.offerLast("木子");
		list.offerLast("女票");
		
		System.out.println(list);//[王蜜桃, 王尼玛]
		
////		获取操作
//		Object obj = list.peekFirst();//查看第一个元素
//		System.out.println(obj);
//		obj = list.peekLast();
//		System.out.println(obj);
//		
//		obj = list.pollFirst();//删除第一个元素
//		System.out.println(obj);
//		System.out.println(list);
		
		Object obj = list.pollLast();
		list.offerFirst(obj);
		System.out.println(list);
		
	}
}
