package com._520it_day7;

public class ExtendsDemo {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.sleep();
		System.out.println(c);
	}
}

class Animal {
	int i;
	
	public Animal(int i) {
		System.out.println("fu" + i);
		this.i = i;
	}
	
	public void sleep() {
		System.out.println("Zz...");
	}
}

class Cat extends Animal {
	int i = 0;
	//私有的不能获取   public/protected的可以获取  默认的在同包的情况下可以获取
	Cat() {
		//没有写super也会调用父类的无参构造
		//子类对象在初始化时,会调用父类的构造方法
		super(10);//父类没有无参构造,必须使用super调用父类的有参构造
		System.out.println("zi" + super.i);
	}
	/*
	  一同两小一大
	  方法名相同
	 返回值类型是父类方法中返回值类型的子类或者      异常(比父类方法的异常类型要小, 不能出现新的异常)
	 访问修饰符的权限更大或者本身
	 //重写是在继承的基础上
	 */
	@Override
	public void sleep() {
		System.out.println("mmmmm.....");
		super.sleep();//super表示调用父类的成员
	}
	
	@Override
	public String toString() {
		return "[Cat] i=" + i;
	}
}
