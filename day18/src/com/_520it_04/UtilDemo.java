package com._520it_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//��ʾ������
public class UtilDemo {
	public static void main(String[] args) {
//		List list = Arrays.asList("w","a","z");
		
//		list.add("aaaa");
//		System.out.println(list);
		
		List list = new ArrayList();
		list.add("123");
		list.add("123");
		list.add("222");
		list.add("333");
		list.add("222");
		list.add("333");
		
		System.out.println(list);
		//����list������Ԫ�ص�˳��
		Collections.shuffle(list);
		System.out.println(list);
		
		//��Ȼ˳������
//		Collections.sort(list);
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				//��д�ȽϹ���
				//...
				return 0;
			}
		});
		System.out.println(list);
	}
}
