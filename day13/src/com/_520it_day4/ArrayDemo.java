package com._520it_day4;

public class ArrayDemo {
	public static void main(String[] args) {
		//����ĳ�ʼ��
		int[] arr = {1,2};//��̬��ʼ��
		arr = new int[5];//��̬��ʼ��  Ĭ��ֵ��? ��ֵ0, boolean false
		
//		���������Ԫ��  ����      [����]  ������0��ʼ
		System.out.println(arr[1]);//0
		
		arr[3] = 10;//������Ԫ�ظ�ֵ
		
		System.out.println(arr);  //����@��ϣ��
	}
}
