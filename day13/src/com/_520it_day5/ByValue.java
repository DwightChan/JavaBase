package com._520it_day5;

public class ByValue {
	public static void main(String[] args) {
		int i = 0;
		//基本类型 
		change(i);//传递的是副本
		System.out.println(i);
		int[] arr = {1,2};
		//引用类型
		change(arr);
		System.out.println(arr[0]);//传递的是引用地址
	}
	
	public static void change(int i) {
		i = 10;
	}

	public static void change(int[] arr) {
		arr[0] = 10;
	}
}
