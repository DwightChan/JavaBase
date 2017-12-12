package com._520it_day8;

//多态  父类类型的变量指向了子类对象的引用
public class App {
	public static void main(String[] args) {
		Cat c = new Cat();
		Animal a = new Cat();// 多态
		/*
		 * 编译类型:左边 运行类型:右边 该对象的实际类型
		 */
		// a.work(); 该方法不在编译类型中
		c.work();
		a.getI();
		c.getI();// 子类继承过来

		// System.out.println(a.getI());//100 多态在运行是表示出来的是子类的特征
		System.out.println(a.getI());// 10

		((Cat) a).work(); //父类转子类   -> 强转
	}
}

class Animal {
	int i = 10;

	public int getI() {
		return i; // 就是当前类的变量
	}
}

class Cat extends Animal {
	int i = 100;

	public void work() {
	}

	// @Override
	// public int getI() {
	// return 100;
	// }
}