package com._520it_01;

import java.util.ArrayList;
import java.util.List;

public class GenericType {
	public static void main(String[] args) {
		//���ڸ�����֪�������������ʲô����,�����ش�İ�ȫ����
		//����JDK1.5��ʼ���˷���,��������Ͳ���ȷ������
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("123");
		list.add("new Date()");
		
		List l1 = null;
		l1 = new ArrayList<Integer>();
		l1.add(123);
		
		//����û�ж�̬����
//		work1(new ArrayList<Object>());
		list = l1;
		
		work1(list);
	}

	private static void work1(List<String> list) {
		String s = list.get(0);
	}
}
