package com._520it_02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForeachDemo {
	public static void main(String[] args) {
		//实现了Iterable接口可以成为foreach的目标
		/*
		 for (定义变量 : 目标) {
		 	循环体
		 }
		 
		 for (int i : arr) --> for (int i = 0;i < arr.length;i++) 
		 */
		List list = new ArrayList();
		
		list.add("王尼玛");
		list.add("王大锤");
		list.add(new Date());
		list.add(10);
		list.add("王蜜桃");
		list.add("大湿");
		
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
