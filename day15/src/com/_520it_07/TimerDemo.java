package com._520it_07;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		//使用定时器模拟时钟  
		//创建定时器对象  
		Timer t = new Timer();
		
		//任务对象
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println(new Date());
			}
		};
		
		//安排任务
		//参数:1.任务对象    2.什么时候执行    3.重复执行的周期频率
//		t.schedule(task, new Date(), 1000);//从你设置的时间开始执行任务,每隔固定的时间重复执行
		
		//参数:1.任务对象    2.延迟时间    3.重复执行的周期频率
		t.scheduleAtFixedRate(task, 1000, 1000);//延迟固定时间后,按规律执行任务,重复执行
		//参数:1任务对象   2.执行的时间
//		t.schedule(task, new Date(System.currentTimeMillis() + 3000));//3S后执行该任务,执行1次
		//任务执行完毕后,不会退出JVM
	}
}
