package com._520it_04;

public class Single {
	//3步
	private Single() {}
	
	private static Single s;//懒汉式
	
//	public static synchronized Single getInstance() {//1.使用同步的方法
	public static Single getInstance() {//1.使用同步的方法
		if (s == null) {
			synchronized (Single.class) {
				if (s == null) {
//					System.out.println(s);
					s = new Single();
				}
			}
		}
		return s;
	}
	
	/*private static Single s = new Single();//饿汉式
	
	public static Single getInstance() {
		System.out.println(s.hashCode());
		return s;
	}*/
	
	public static void main(String[] args) {
		new Thread() { 
			public void run() {
				int i = 0;
				while (i < 10) {
					Single s = Single.getInstance();
					i++;
				}
			};
		}.start();
		
		int i = 0;
		while (++i < 10) {
			Single s = Single.getInstance();
		}
	}
}
