package com._520it_01;

import java.io.File;

public class FileDemo4 {
	public static void main(String[] args) {
		//�����ļ���
		File root = new File("/Users/dwight/Desktop/java");
		
		//ǧ�򲻵��ݹ�ɾ���ļ�
//		searchAllFiles(root);
		
		//��ȡ���еĸ�·��
		File[] roots = File.listRoots();
		for (File f : roots) {
			System.out.println(f);
		}
		
	/*	//����list�������Է��ظ�Ŀ¼�����е��ļ����ļ��е�����
		String[] names = root.list();
		for (String s : names) {
			System.out.println(s);
		}
		
		File[] files = root.listFiles();
		for (File f : files) {
			//System.out.println(f.toString() + "---" + f.isFile());
			if (f.isDirectory()) {
				File[] inFiles = f.listFiles();
				for (File f1 : inFiles) {
					System.out.println(f1.toString() + "---" + f1.isFile());
				}
			}
		}
		xjad Java �����빤��
	 */
	}
	
	//�ݹ�
	public static void searchAllFiles(File root) {
		File[] files = root.listFiles();
		for (File f : files) {
			//System.out.println(f.toString() + "---" + f.isFile());
			if (f.isDirectory()) {
				//��������
				System.out.println(f.getAbsolutePath());
				searchAllFiles(f);
			} else {
				System.out.println(f.getAbsolutePath());
			}
		}
	}
}
