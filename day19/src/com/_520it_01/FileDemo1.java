package com._520it_01;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args) throws Exception {
		// ͨ��һ���ַ���·���������ļ�����
//		String pathname = "e:/aaa1/bbb1/cc/a1/cfr";
		String pathname = "e:/a.avi";
		File file = new File(pathname);
		
		//�����ļ���
		/*
		 ���������,�ʹ���-->true
		 ����?������-->false
		 ֻ�ܴ���1��Ŀ¼
		System.out.println(file.mkdir());//true:�����ɹ�    false:����ʧ��
		//�Ƽ�,���Դ����༶Ŀ¼
		System.out.println(file.mkdirs());
		 */
		
		//�����ļ�
		/*
		 true: ok   false: no
		 �������������ļ������ļ���������õķ���������·���޹�
		System.out.println(file.createNewFile());
		 */
		
		//������
		/*
		ͬĿ¼�±�ʾ����������,��ͬĿ¼��ʾ����
		 */
		System.out.println(file.renameTo(new File("d:/a.avi")));
	}
}
