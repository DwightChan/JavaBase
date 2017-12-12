package com._520it_day9;

public class InterfaceDemo {
/*
 Java中接口是用来规定该类型有什么方法,是一种规范
   方法都是抽象
  成员变量都是public static final类型的
  接口不能实例化
 */
	public static void main(String[] args) {
//		new IWalkable();  错误,不能实例化
		Cat c = new Cat();
		IWalkable i = new Cat();//多态  以后看到的多态都是接口和实现类的形式
		System.out.println(IWalkable.I);//20
	}
}

interface IWalkable {
	int I = 20;
	void walk();
}

class Cat implements IWalkable {  //接口和实现类是像...关系
	int i = 10;
	
	@Override
	public void walk() {
		System.out.println("mmmm...zou");
	}
	
}
