package com._520it_02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//集合中取元素
public class TalkawayDemo {
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
	
	public static void work2(List list){
		//直接使用List接口上的方法,get/size
		//依赖数组索引的形式
		for (int i = 0; i < list.size(); i++) {
			//获取元素
			Object obj = list.get(i);//传入的索引i  从0-size()  size就是集合元素的个数
			System.out.println(obj);
		}
	}
	
	public static void work1(List list){
		//通过把集合中的元素,转成数组形式
		Object[] arr = list.toArray();
		//访问所有元素
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		//foreach
		for (Object obj : arr) {
			System.out.println(obj);
		}
	}
}
