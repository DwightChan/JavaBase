package com._520it_03;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShareData {
	private String name;
	private String taste;
	
	//ʹ��������
	private Lock lock = new ReentrantLock();
	
	//��ȡ��Condition,���������wait/notify/notifyAll
	private Condition con = lock.newCondition();
	
	private boolean flag;//Ĭ��false ��ʾû������

	public void add(String name, String taste) {
		try {
			lock.lock();
			if (flag) {//û�����ݵ�ʹ�þ����,�о͵ȴ�    falseû�в���
				con.await();//�̵߳ȴ�
			}
			
			this.name = name;
			Thread.sleep(10);
			this.taste = taste;
			System.out.println("--������--:" + name + ",��ζ��:" + taste);
			
			flag = true;//�ı���
			
			con.signal();//�����߳�
		} catch (Exception e) {
			//throw new RuntimeException(e);
		} finally {
			lock.unlock();
		}
	} 
	
	public void take() {
		try {
			lock.lock();
			if (!flag) {//û�����ݾ͵ȴ�
				con.await();
			}
			
			Thread.sleep(10);
			System.out.println("������:" + name + ",��ζ��:" + taste);
			
			flag = false;

			con.signal();
		} catch (Exception e) {
			//throw new RuntimeException(e);
		} finally {
			lock.unlock();
		}
	} 
}
