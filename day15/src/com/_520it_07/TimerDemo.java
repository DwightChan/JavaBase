package com._520it_07;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		//ʹ�ö�ʱ��ģ��ʱ��  
		//������ʱ������  
		Timer t = new Timer();
		
		//�������
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println(new Date());
			}
		};
		
		//��������
		//����:1.�������    2.ʲôʱ��ִ��    3.�ظ�ִ�е�����Ƶ��
//		t.schedule(task, new Date(), 1000);//�������õ�ʱ�俪ʼִ������,ÿ���̶���ʱ���ظ�ִ��
		
		//����:1.�������    2.�ӳ�ʱ��    3.�ظ�ִ�е�����Ƶ��
		t.scheduleAtFixedRate(task, 1000, 1000);//�ӳٹ̶�ʱ���,������ִ������,�ظ�ִ��
		//����:1�������   2.ִ�е�ʱ��
//		t.schedule(task, new Date(System.currentTimeMillis() + 3000));//3S��ִ�и�����,ִ��1��
		//����ִ����Ϻ�,�����˳�JVM
	}
}
