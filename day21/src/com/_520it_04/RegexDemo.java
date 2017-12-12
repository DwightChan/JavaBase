package com._520it_04;

import java.util.Arrays;

public class RegexDemo {
	public static void main(String[] args) {
		//��֤
		String telNo = "13345371901";
		System.out.println("���ֻ�����?" + check(telNo));
		//ƥ��
//		boolean flag = work1(telNo);
//		System.out.println(flag);
		//work4(); 
	}
	
	private static void work4() { 
		String data = "�����ҽ���ԳԳԳԳԳ��˺úö�ĺúóԵ�";
		String s = data.replaceAll("(.)\\1+", "$1");
		System.out.println(s);
	}
	
	//�滻����
	private static void work3() {
		String data = "aaaaabba";
		//�����е�a�滻��z
		//����һ������
		String regex = "a+";
		//����1:������ʽ   ����2:�����滻������
		String s = data.replaceAll(regex, "a");
		System.out.println(s);
	}
	
	//�и�
	private static void work2() {
		String data = ".png$.jpg$.jpeg$.bmp$.gif";
		
		//����һ������
		String regex = "\\$";
		String[] arr = data.split(regex);
		System.out.println(Arrays.toString(arr));
		
		String fileName = "1.png";
		for (String s : arr) {
			if (fileName.endsWith(s)) {
				System.out.println("��ͼƬ");
				return;
			}
		}
		
		System.out.println("����ͼƬ");
	}
	
//	ƥ��
	private static boolean work1(String telNo) {
		//��������
		String regex = "1[3578]\\d{9}";
		
		return telNo.matches(regex);
	}

	//����һ��������ʶ���Ƿ����ֻ�����
	public static boolean check(String no) {
		boolean flag = false;
		//1.��11������  2.1��ͷ  3.�ڶ������ֱ�����3|5|7|8
		if (no.length() == 11) {
			if (no.startsWith("1")) {
				char c = no.charAt(1);
				if (c == '3' || c == '5' || c == '7' || c == '8') {
					flag = true;
				}
			}
		}
		
		return flag;
	}
}
