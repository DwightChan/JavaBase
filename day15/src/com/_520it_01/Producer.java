package com._520it_01;

public class Producer implements Runnable {
	
	private ShareData sd;

	public Producer(ShareData sd) {
		super();
		this.sd = sd;
	}

	@Override
	public void run() {
		//�����Ĺ���
		for (int i = 0; i < 500; i++) {
			if (i % 2 == 0) {
				sd.add("$$������ţ$$", "$$����$$");
			} else {
				sd.add("����С��Ϻ", "��������");
			}
		}
	}
}
