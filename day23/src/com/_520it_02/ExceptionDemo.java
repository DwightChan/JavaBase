package com._520it_02;

import java.io.FileInputStream;
import java.io.InputStream;

public class ExceptionDemo {
	public static void main(String[] args) {
		//��jdk7�п���ͬʱ�������쳣
		work();
	}

	private static void work1() {
		InputStream in = null;
		int j = 0;
		try {
			int i = j/0; 
			in = new FileInputStream("");
			j = in.read();
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		} catch (ArithmeticException | IOException e) {
//			e.printStackTrace();
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
	}
	
	//Ϊ�˷������ǲ����쳣ͨ�����Ჶ��Exception,�����������쳣���ܴ���,ֻ����
	//�����ͻ����������Ӧ
	public static void work() {
		//��ǿthrow���
		try {
			int a = 1/0;
		} catch (Exception e) {
			//jdk1.7���throw�����ǿ,����ʶ����쳣����ʵ����
			throw e;
		}
	}
}
