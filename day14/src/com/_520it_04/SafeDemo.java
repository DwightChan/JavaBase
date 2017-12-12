package com._520it_04;

public class SafeDemo {
	public static void main(String[] args) {
		//春节回家了，大家去火车站买票，该列车有1000个座位，也就是有1000张票，模拟5个窗口卖票的情景
		Runnable r = new Runnable() {
			//先定义1000张票
			int tick = 1000;
			
			@Override
			public void run() {
				while (tick > 0) {
					//获取线程的名字
					Thread thread = Thread.currentThread();
					tick--;
					System.out.println(thread.getName() + "买出了1张票,剩下" + tick);
				}
			}
		};
		
		new Thread(r,"王尼玛").start();
		new Thread(r,"唐马儒").start();
		new Thread(r,"易叫兽").start();
		new Thread(r,"左大湿").start();
		new Thread(r,"王蜜桃").start();
	}
}
