package com._520it_01;

import java.util.ArrayList;
import java.util.List;

public class GenericType {
	public static void main(String[] args) {
		//由于根本不知道里面的数据是什么类型,所有重大的安全隐患
		//所有JDK1.5开始有了泛型,来解决类型不明确的问题
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("123");
		list.add("new Date()");
		
		List l1 = null;
		l1 = new ArrayList<Integer>();
		l1.add(123);
		
		//泛型没有多态性质
//		work1(new ArrayList<Object>());
		list = l1;
		
		work1(list);
	}

	private static void work1(List<String> list) {
		String s = list.get(0);
	}
}
