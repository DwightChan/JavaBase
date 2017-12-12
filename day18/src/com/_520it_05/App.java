package com._520it_05;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
	public static void main(String[] args) {
		//泛型  使用泛型就是规定该集合只能存储固定的类型
		List<String> list = new ArrayList<String>();
		
		//使用泛型-->String所有此时该集合只能存储String类型的数据
		list.add("String");
		list.add("123");
		list.add("111");
//		list.add(123);
//		list.add(new Date());
		
		work1(list);
		
		List<Integer> l1 = null; 
		List<Double> l2 = null;
		List<Number> l3 = null;
		List<Object> l4 = null;
		work2(l1);
		work2(l2);
		work2(l3);
		
		work3(l3);
		work3(l4);
		
		List<?> l5 = null;//单独使用?会有问题
		l5.add(e);
	}
	
	//泛型不存在多态
	public static void work2(List<? extends Number> list) {
	}

	public static void work3(List<? super Number> list) {
	}

	private static void work1(List<String> list) {
		for (String s : list) {
			System.out.println(s.length());
		}
		/*for (Object obj : list) {
			//此时我要调用对象特有的方法
			String s = (String) obj;
			System.out.println(s.length());
			//使用instanceof判断集合中所有的类型.不现实
		}*/
	}
}
