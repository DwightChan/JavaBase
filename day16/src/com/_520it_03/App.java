package com._520it_03;

import java.util.Date;

public class App {
	public static void main(String[] args) {
		MyList list = new MyList();
		
		list.add("Sss..");
		list.add(123);//�Զ�װ��
		list.add(new Date());
		
		System.out.println(list.isEmpty());
		System.out.println(list);
		System.out.println(list.size());
		
		list.clear();//ɾ������Ԫ��
		System.out.println(list.isEmpty());
		System.out.println(list);
		System.out.println(list.size());
	}
}
