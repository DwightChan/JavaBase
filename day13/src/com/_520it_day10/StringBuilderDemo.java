package com._520it_day10;

import java.util.Date;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();//Ĭ�ϳ�����16
		//����һ����20�����ȵ��ַ���������
//		new StringBuilder(20);
		
		//���������������   append(Object obj);
		sb.append("123").append(new Date());
		
		//���ش����������ݵ��ַ�����ʾ��ʽ
		System.out.println(sb.toString());
		/*
 		StringBuidler/StringBuffer:
		------����-------------------
		StringBuffer  :�ص�: �̰߳�ȫ�Խϸ�,�������ܽϵ�.  ���߳�ʹ��StringBuffer.
		StringBuilder :�ص�: �̰߳�ȫ�Խϵ�,��ʱ���ܽϸ�. �Ƽ�        ���߳�ʹ��StringBuilder.
		 */
		
	}
}
