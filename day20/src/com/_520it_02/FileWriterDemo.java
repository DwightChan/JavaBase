package com._520it_02;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo {
	public static void main(String[] args) throws Exception {
		//����Ŀ��
		String name = "e:/1.txt";
		
		//����������
		Writer writer = new FileWriter(name);
		
		work1(writer);
		
		//�ر���Դ
		//��ˢ�¸����Ļ�����,�ٹر���Դ
		writer.close();
	}

	private static void work2(Writer writer) throws Exception {
		//д��һ�仰   ����û�뵽,��������
		writer.write("����û�뵽,��������!");
	}
	
	private static void work1(Writer writer) throws Exception {
		//д���ַ�
		/*
		 �ַ�����write�������ǰ����������ļ�,��д��ײ�Ļ�����
		 */
		writer.write('a');
		writer.write('a');
		writer.write('��');
		writer.write('��');
		//�ѻ�����������д���ļ�
		writer.flush();
	}
}
