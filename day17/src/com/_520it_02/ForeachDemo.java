package com._520it_02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForeachDemo {
	public static void main(String[] args) {
		//ʵ����Iterable�ӿڿ��Գ�Ϊforeach��Ŀ��
		/*
		 for (������� : Ŀ��) {
		 	ѭ����
		 }
		 
		 for (int i : arr) --> for (int i = 0;i < arr.length;i++) 
		 */
		List list = new ArrayList();
		
		list.add("������");
		list.add("����");
		list.add(new Date());
		list.add(10);
		list.add("������");
		list.add("��ʪ");
		
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
