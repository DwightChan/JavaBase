package com._520it_02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//������ȡԪ��
public class TalkawayDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("������");
		list.add("����");
		list.add(new Date());
		list.add(10);
		list.add("������");
		list.add("��ʪ");
		
		work2(list);
	}
	
	public static void work2(List list){
		//ֱ��ʹ��List�ӿ��ϵķ���,get/size
		//����������������ʽ
		for (int i = 0; i < list.size(); i++) {
			//��ȡԪ��
			Object obj = list.get(i);//���������i  ��0-size()  size���Ǽ���Ԫ�صĸ���
			System.out.println(obj);
		}
	}
	
	public static void work1(List list){
		//ͨ���Ѽ����е�Ԫ��,ת��������ʽ
		Object[] arr = list.toArray();
		//��������Ԫ��
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		//foreach
		for (Object obj : arr) {
			System.out.println(obj);
		}
	}
}
