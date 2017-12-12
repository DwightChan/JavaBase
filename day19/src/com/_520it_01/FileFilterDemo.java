package com._520it_01;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo {
	public static void main(String[] args) {
		//E:\��ң\1125\day05\code\com_520it_04
		File file = new File("E:/��ң/1125/day05/code/com_520it_04");
		
		//���������ȡ�����Ǹ�Ŀ¼�����е��ļ�,��������Ҫ��ֻ�����е��ֽ����ļ�
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				/*//�����Ǵ�����ļ�����
			     	System.out.println(pathname);
				//����ֵtrue ��Ҫ����  false Ҫ����*/				
				return pathname.getName().endsWith(".class");
			}
		});
		System.out.println(files.length);
		
		for (File f : files) {
			System.out.println(f);
		}
	}
}
