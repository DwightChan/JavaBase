package com._520it_05;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
	public static void main(String[] args) {
		//����  ʹ�÷��;��ǹ涨�ü���ֻ�ܴ洢�̶�������
		List<String> list = new ArrayList<String>();
		
		//ʹ�÷���-->String���д�ʱ�ü���ֻ�ܴ洢String���͵�����
		list.add("String");
		list.add("123");
		list.add("111");
//		list.add(123);
//		list.add(new Date());
		
		work1(list);
		
		List<Integer> l1 = null; 
		List<Double> l2 = null;
		List<Number> l3 = null;
		List<Object> l4 = null;
		work2(l1);
		work2(l2);
		work2(l3);
		
		work3(l3);
		work3(l4);
		
		List<?> l5 = null;//����ʹ��?��������
		l5.add(e);
	}
	
	//���Ͳ����ڶ�̬
	public static void work2(List<? extends Number> list) {
	}

	public static void work3(List<? super Number> list) {
	}

	private static void work1(List<String> list) {
		for (String s : list) {
			System.out.println(s.length());
		}
		/*for (Object obj : list) {
			//��ʱ��Ҫ���ö������еķ���
			String s = (String) obj;
			System.out.println(s.length());
			//ʹ��instanceof�жϼ��������е�����.����ʵ
		}*/
	}
}
