package com._520it_day8;

public class AbstractDemo {
	public static void main(String[] args) {
//		Ani a = new Ani();//抽象类不能创建对象
		Ani a = new Dog();//多态
	}
}
//当一个方法的方法体没有意义的使用使用抽象来修饰,可以没有方法体
/*
 	类中有抽象方法,该类必须是抽象类
 	抽象类中可以没有抽象的方法
 	
 	abstract不能和final/static/private一起使用
 */
abstract class Ani {
	abstract void eat();
	//可以没有抽象方法
	static void work() {
		System.out.println(111);
	}
}

class Dog extends Ani {
	//子类没有重写抽象的方法,子类也必须定义成抽象类
	void eat() {
		System.out.println("chi 狗粮");
	}
	
	static void work() {}//非法的修饰符组合
} 
