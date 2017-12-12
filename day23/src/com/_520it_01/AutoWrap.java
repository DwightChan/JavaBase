package com._520it_01;

public class AutoWrap {
	public static void main(String[] args) {
		int a = 10;//基本类型
		Integer i = Integer.valueOf(a);//使用包装类的方法,对基本类型包装
		
		i = 10;//为什么?Integer是一个类,存储的是内存地址,由于基本类型的值不是内存的地址
		//自动装箱   把我们的基本类型的值直接付给对应的包装类,自动调用包装类上的valueOf方法来包装
		
		//自动拆箱
		a = i;//等价于  a = i.intValue();
	}
}
