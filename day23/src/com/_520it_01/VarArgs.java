package com._520it_01;

public class VarArgs {
	public static void main(String[] args) {
//		getSum(new int[] {1,2,3,4,5});
		getSum("",1,2,3,4,5);
	}
	
	//可变参数  在声明方法使用,数组的[]换成...  表示的是可变参数  作用告诉编译器把传入的参数打包成数组
	public static void getSum(String name, int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	
	//需求:要你计算一串数字的和
	/*public static void getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}*/
}
