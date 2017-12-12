package com._520it_day8;

public class CodeDemo {
	
	String name = "000";
	
	public CodeDemo() {
		System.out.println(222);
	}
	
	//构造代码块
	{
		System.out.println(111);
	}//实质 就是把里面的代码放在构造方法前
	
	//静态代码块    类加载的时候执行,只执行1次
	static {
		System.out.println("...static...");
	}
	
	public static void main(String[] args) {
		//每次创建对象都会调用构造方法和构造代码块
		new CodeDemo();
		new CodeDemo();
		//成员变量最早-->构造代码块-->构造方法
		
	}
}
