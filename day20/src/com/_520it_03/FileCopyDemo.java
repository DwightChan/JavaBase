package com._520it_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileCopyDemo {
	public static void main(String[] args) {
		copy3("E:/��ң/1125/eclipse-jee-mars-R-win32.zip","d:/eclipse-jee-mars-R-win32.zip");
	}
	
	private static void tryWithResource() {
		try (	//���������ʵ����AutoCloseadble�ӿڵĶ���
				InputStream is = new FileInputStream("");
				OutputStream os = new FileOutputStream("");
			) {			
			
			//���ж�д����
			byte[] b = new byte[1024];
//			�ȶ�
			int len;
			long s = System.currentTimeMillis();
			//�߶���д
			while ((len = is.read(b)) != -1) {
				os.write(b, 0, len);
			}
			System.out.println(System.currentTimeMillis() - s);
			
			//ȥ���ùر���Դ�Ĵ���
//			is.close();
//			os.close();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
	private static void copy3(String src, String dest) {
		//��������Դ,��Դ����һ��Ҫ�ر�
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader(src);
			writer = new FileWriter(dest);
			//try�г����쳣��Դû�йر�
			String a = null;
			System.out.println(a.toCharArray());
			
			char[] c = new char[1024];
			int len;
			
			long s = System.currentTimeMillis();
			//�߶���д
			while ((len = reader.read(c)) != -1) {
				writer.write(c, 0, len);
			}
			writer.flush();
			
			System.out.println(System.currentTimeMillis() - s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (writer != null) {
						writer.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void copy2(String src, String dest) throws Exception {
//		String src = "e:/1.java";
//		String dest = "d:/bak.java";
		
		Reader reader = new FileReader(src);
		Writer writer = new FileWriter(dest);
		
		char[] c = new char[1024];
		int len;
		
		long s = System.currentTimeMillis();
		//�߶���д
		while ((len = reader.read(c)) != -1) {
			writer.write(c, 0, len);
		}
		writer.flush();
		
		System.out.println(System.currentTimeMillis() - s);
		
		reader.close();
		writer.close();
	}
	
	private static void copy1(String src, String dest) throws Exception {
		//��e:/1.txt�ļ�������d:/bak.txtx
//		String src = "e:/1.java";
//		String dest = "d:/bak.java";
		
		//�����������������
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(dest);
		
		//���ж�д����
		byte[] b = new byte[1024];
//		�ȶ�
		int len;
		long s = System.currentTimeMillis();
		//�߶���д
		while ((len = is.read(b)) != -1) {
			os.write(b, 0, len);
		}
		System.out.println(System.currentTimeMillis() - s);
		//�ر���Դ
		is.close();
		os.close();
	}
}
