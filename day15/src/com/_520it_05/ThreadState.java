package com._520it_05;

public class ThreadState {
	public static void main(String[] args) throws Exception {
		Thread t = new Thread() {
			@Override
			public void run() {
				try {
					System.in.read();
				} catch (Exception e) {
				}
//				for (int i = 0; i < 100; i++) {
//					System.out.println(i);
//					try {
//						System.in.read();
//					} catch (Exception e) {
//					}
//					try {
//						Thread.sleep(3000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
			}
		};  //��ʱ���߳̾��Ǵ����½���״̬
		
		t.start();//�����߳�running
		System.out.println(t.getState());
		Thread.sleep(1000);
		System.out.println(t.getState());
		
		//ʲôʹ�ô����˳�״̬? run����ִ�����,�߳̾���ֹ
		//
//		t.start();
	}
}
