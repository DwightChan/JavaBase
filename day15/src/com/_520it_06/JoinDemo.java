package com._520it_06;

public class JoinDemo {
	public static void main(String[] args) throws Exception {
		//做饭
		//1.买菜
		System.out.println("买菜");
		//2.洗菜
		System.out.println("洗菜");
		//3.下锅
		System.out.println("下锅");
		//4.调味
		System.out.println("调味没有了"); 
//		模拟叫儿子买调料
		Thread son = new Thread() {
			public void run() {
				System.out.println("下楼");
				System.out.println("找店");
				System.out.println("选购");
				System.out.println("付钱");
				System.out.println("回来");
			};
		};
		son.start();//必须是开启线程后再调用join方法
		
		son.join();//加入主线程,等待该线程执行完毕,再执行主线程
		
		System.out.println("继续炒菜");
		//5.吃饭
		System.out.println("吃饭");
	}
}
