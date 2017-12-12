package com._520it_day8;

public class WarpDemo {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);//包装10
		i1.intValue();//获取被包装的值
		
		i1 = 100;//自动装箱JDK1.5  valueOf
		int i2 = i1;//自动拆箱             intValue
		
		int num = Integer.parseInt("123");//只有字符串内容全部是0-9才能成功
		System.out.println(num);
	}
}
