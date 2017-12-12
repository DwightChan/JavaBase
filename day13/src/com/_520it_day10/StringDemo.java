package com._520it_day10;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "1";
		String s2 = "1";
		//引用常量池中的对象
		System.out.println(s1 == s2);
		String s3 = new String("1");//重新在堆中开辟空间
		System.out.println(s1 == s3);
		
		//比较字符串是否相同使用equals方法,String类型的equals比较的是字符串的内容
		System.out.println(s1.equals(s3));
	}
}
