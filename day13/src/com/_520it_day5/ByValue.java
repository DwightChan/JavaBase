package com._520it_day5;

public class ByValue {
	public static void main(String[] args) {
		int i = 0;
		//�������� 
		change(i);//���ݵ��Ǹ���
		System.out.println(i);
		int[] arr = {1,2};
		//��������
		change(arr);
		System.out.println(arr[0]);//���ݵ������õ�ַ
	}
	
	public static void change(int i) {
		i = 10;
	}

	public static void change(int[] arr) {
		arr[0] = 10;
	}
}
