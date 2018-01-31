package com._520it_02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//ȷ��Ŀ��
//		File file = new File("/Users/dwight/Desktop/java/test/1.txt"); 
		String path = "/Users/dwight/Desktop/java/test/1.txt";
		
		//����һ���ļ�����ֽ�������  �ļ�Ҫ�ǲ����ڻᴴ������
//		OutputStream out = new FileOutputStream(file);
		OutputStream out = new FileOutputStream(path, true);
		
		//����д������  ֻ��д��1���ֽڻ��ֽ�����
		work1(out);
		
		//�ر���Դ
		out.close();
	}

	private static void work2(OutputStream out) throws Exception {
		//д�ֽ�����
		byte[] data = {'a','b','c','d'};
		out.write(data);
		//����1,д��������.����2,���ĸ��ط���ʼд.����3,д���ٸ�
		out.write(data, 1, 2);
	}
	
	private static void work1(OutputStream out) throws Exception {
		int data = '��';
		out.write(data);
		data = 'z';
		out.write(data);
	}
}
