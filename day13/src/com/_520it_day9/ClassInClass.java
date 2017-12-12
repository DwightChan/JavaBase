package com._520it_day9;

public class ClassInClass {
	private int i = 10;
	//内部类   内部类是可以访问外部类的所有成员
	class In {//破坏封装
		int a = i;
	}
	
	public static void main(String[] args) {
		IWalkable i = new IWalkable() {
			@Override
			public void walk() {
				/*匿名内部类只能使用1次
				匿名内部类只能访问final修饰的局部变量/常量
				局部变量的声明周期是方法执行结束
				对象-->GC
				*/
			}
		};//类名/接口名(){}  匿名内部类          new 匿名内部类  创建匿名内部类对象    必须同时创建匿名内部类对象
	}
	
	/*
	 需要什么功能就在类中留具有什么功能的接口
	 继承是用来表示家族体系的  组合关系
	 */
}
