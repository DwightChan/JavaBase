package com._520it_day8;

//演示final
public class FinalDemo {

}

class Fu { //final修饰的类不能被继承
	public final void work() {} //修饰方法表示该方法不能被子类重写
}

class Zi extends Fu {
	final int I = 10;//修饰变量表示常量,值不能被修改
	
	public void work1() {
//		i = 0;
		final int i = 0;  //final是唯一可以修饰局部变量的修饰符
	}
}
