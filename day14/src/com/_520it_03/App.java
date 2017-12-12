package com._520it_03;

//楼下有1000箱苹果，有5个同学去把苹果搬上来
public class App {
	public static void main(String[] args) {
		//创建带名字的线程
		/*new ExtendsDemo("王尼玛").start();
		new ExtendsDemo("唐马儒").start();
		new ExtendsDemo("王大锤").start();
		new ExtendsDemo("叫兽").start();
		new ExtendsDemo("大湿").start();*/
		
		Runnable target = new ImplementsDemo();
		
//		new Thread(target,"王尼玛").start();
//		new Thread(target,"唐马儒").start();
//		new Thread(target,"王大锤").start();
//		new Thread(target,"易叫兽").start();
		Thread thread = new Thread(target,"左大湿");//?
		thread.start();//?必须要调用start方法才有线程
	}
}
