package com._520it_02;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("王尼玛");
		list.add("王大锤");
		list.add(new Date());
		list.add(10);
		list.add("王蜜桃");
		list.add("大湿");
		
		work2(list);
	}
	
	public static void work2(List list) { 
		ListIterator it = list.listIterator();
		
		//1.从头到尾迭代
		while (it.hasNext()) {
			//注意:每次调用next方法都会往下移动1个位置
//			Object object = it.next();
			System.out.println(it.next());
		}
		System.out.println("----------");
		//2.从尾到头
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
		//获取迭代器
		Iterator it = list.iterator();
		
//		it.next();
//		it.remove();
		//hasNext()  判断是否还有元素
		while (it.hasNext()) {
			//remove  删除下一个元素
//			it.remove();
//			//next()  取出下一个元素
			Object obj = it.next();
			/*
			 * 使用迭代器操作集合的过程中不能改动源集合的元素
			 */
//			list.add("321");
			System.out.println(obj);
		}
		System.out.println(list);
		
	}
}
