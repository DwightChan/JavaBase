package com._520it_01;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		//�жϲ���
		File file = new File("e:/cjk.txt");
		
		//�ж�·���Ƿ����   true:����  false:������
		System.out.println(file.exists());
		
		//�ж��Ƿ��ļ�  ����true��ǰ��������  ����
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
	}
}