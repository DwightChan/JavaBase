package com._520it_01;

public class ShareData {
	private String name;
	private String taste;

	public void add(String name, String taste) {
		try {
			this.name = name;
			Thread.sleep(10);
			this.taste = taste;
			System.out.println("--������--:" + name + ",��ζ��:" + taste);
		} catch (Exception e) {
		}
	} 
	
	public void take() {
		try {
			Thread.sleep(10);
			System.out.println("������:" + name + ",��ζ��:" + taste);
		} catch (Exception e) {
		}
	} 
}
