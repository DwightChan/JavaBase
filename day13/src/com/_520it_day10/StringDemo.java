package com._520it_day10;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "1";
		String s2 = "1";
		//���ó������еĶ���
		System.out.println(s1 == s2);
		String s3 = new String("1");//�����ڶ��п��ٿռ�
		System.out.println(s1 == s3);
		
		//�Ƚ��ַ����Ƿ���ͬʹ��equals����,String���͵�equals�Ƚϵ����ַ���������
		System.out.println(s1.equals(s3));
	}
}
