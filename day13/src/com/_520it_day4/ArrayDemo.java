package com._520it_day4;

public class ArrayDemo {
	public static void main(String[] args) {
		//数组的初始化
		int[] arr = {1,2};//静态初始化
		arr = new int[5];//动态初始化  默认值是? 数值0, boolean false
		
//		访问数组的元素  索引      [索引]  索引用0开始
		System.out.println(arr[1]);//0
		
		arr[3] = 10;//给数组元素赋值
		
		System.out.println(arr);  //类名@哈希码
	}
}
