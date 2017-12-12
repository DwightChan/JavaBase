package com._520it_03;

//使用继承的方式
public class ExtendsDemo extends Thread {
	static int appNum = 1000; //设计成静态为了让类的对象共享这1000箱
	
	public ExtendsDemo(String name) {
		super(name);
	}

	@Override
	public void run() {
		while (appNum > 0) {
//			System.out.println(--appNum);//加入哪个线程搬走的,剩下的数量
			System.out.println(getName() + "搬走了1箱,剩下" + --appNum);
		}
	}
}
