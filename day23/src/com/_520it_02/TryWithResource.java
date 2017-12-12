package com._520it_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramSocket;

public class TryWithResource {
	public static void main(String[] args) {
		
	}

	private static void work2() {
		//try-with-resource   �Զ��ر���Դ
		try (
		//����д����AutoCloseable��������
			InputStream in = new FileInputStream("");
//				String a = "";
		) {
			//���ܳ����쳣�Ĵ���
		} catch (Exception e) {
			//����ô������ô����
			throw new RuntimeException(e);
		}
		//������������ֶ��ر���Դ
	}
	
	private static void work1() {
		InputStream in = null;
		try {
			int a = 1 / 0;
			in = new FileInputStream("");
			a = 1 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
}
