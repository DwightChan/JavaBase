package com._520it_03;

public class Producer implements Runnable {
	
	private ShareData sd;

	public Producer(ShareData sd) {
		super();
		this.sd = sd;
	}

	@Override
	public void run() {
		//生产的功能
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				sd.add("$$酸汤肥牛$$", "$$无辣$$");
			} else {
				sd.add("麻辣小龙虾", "重麻重辣");
			}
		}
	}
}
