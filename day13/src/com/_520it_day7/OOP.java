package com._520it_day7;

//import java.util.*;
import java.util.Arrays; //准确叫谁
//封装  隐藏实现的细节
public class OOP {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("haha");
		
//		java.util.Arrays.toString(new int[]{});
		Arrays.toString(new int[]{});
		//java.lang是系统默认导入的包
	}
}
/*
 1.使用private修饰成员变量 
 2.提供getter/setter方法
 */
class Person {
	private String name; //封装

	public Person() {
		this("");//使用String类型的参数,就要传入一个String类型的值
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//this表示当前的对象,谁调用this就是谁
		this.name = name;
//		getName();   默认就是this来调用
//		this.getName();
	}
	
}
