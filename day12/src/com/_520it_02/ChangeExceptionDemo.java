package com._520it_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChangeExceptionDemo {
//	public static void work() throws FileNotFoundException {
	public static void work() {
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			//�쳣��ת��    
			//�Ժ�Ҫ���������ܴ�����쳣,�ͱ�����ת��    ����ʱ���쳣 --> ����ʱ���쳣
			//RuntimeException(Throwable cause)
			throw new RuntimeException(e);//��e�е��쳣��Ϣ���ݸ�RuntimeException
		}
	}
	
	public static void main(String[] args) {
		work();
	}
}
