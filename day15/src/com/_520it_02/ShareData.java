package com._520it_02;

public class ShareData {
	private String name;
	private String taste;
	
	private boolean flag;//Ĭ��false ��ʾû������

	public synchronized void add(String name, String taste) {
		try {
			if (flag) {//û�����ݵ�ʹ�þ����,�о͵ȴ�    falseû�в���
				this.wait();//��ͬ����������������
			}
			
			this.name = name;
			Thread.sleep(10);
			this.taste = taste;
			System.out.println("--������--:" + name + ",��ζ��:" + taste);
			
			flag = true;//�ı���
			this.notify();//�����������߳�������
		} catch (Exception e) {
		}
	} 
	
	public synchronized void take() {
		try {
			if (!flag) {//û�����ݾ͵ȴ�
				this.wait();
			}
			
			Thread.sleep(10);
			System.out.println("������:" + name + ",��ζ��:" + taste);
			
			flag = false;
			this.notify();//�����������߳�������
		} catch (Exception e) {
		}
	} 
}
