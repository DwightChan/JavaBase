package com._520it_01;

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args) {
		//��ȡ�ļ�������Ϣ
		File file = new File("e:/1.txt");
		
		//��ȡ����·��   �Ӹ�·����ʼ��ʾ��·�����Ǿ���·��
		String path = file.getAbsolutePath();
		System.out.println(path);
		//��ȡ���·��
		path = file.getPath();
		System.out.println(path);
		
		//��ȡ�ļ��Ĵ�С  ��λ��B
		long len = file.length();
		System.out.println(len);
		
		//��ȡ�ļ�����
		String name = file.getName();
		System.out.println(name);
		System.out.println(file.isHidden());
		
		//����ɾ��
//		file.delete();
		//��JVM�˳���ʱ��ɾ��
		file.deleteOnExit();
		System.out.println(111);
	}
}
