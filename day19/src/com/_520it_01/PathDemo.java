package com._520it_01;

import java.io.File;

public class PathDemo {
	public static void main(String[] args) {
		//��ʾһ��·��   d���µ���ң�µ�day01
		String path = "d:\\��ң\\day01";
		System.out.println(path);
		//Java������,��ʹ�� / ����ʾ�ļ�·���ķָ���
		path = "d:/��ң/day01";
		System.out.println(path);
		
//		Java�����ǿ�ƽ̨��
//		path = "d:" + File.separatorChar + "��ң" + File.separatorChar + "day01";
		System.out.println(path);
	}
}
