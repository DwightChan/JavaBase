package com._520it_07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ProDemo {
	public static void main(String[] args) throws Exception {
		work1();
	}

	private static void work1() throws IOException {
		Properties pro = new  Properties();
		//��ȡ�����ļ�
		pro.load(new FileReader("e:/my.properties"));
		
//		System.out.println(pro);
//		��ȡ�ļ��е�����  ����Key����ȡ
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		
//		System.out.println(username+"--"+password);
		
		//�Ӽ���¼����Ϣ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("�������˺�:");
		String name = reader.readLine(); 
		System.out.println("����������:");
		String pass = reader.readLine();
		
		if (username.equals(name) && password.equals(pass)) {
			System.out.println("��½�ɹ�");
			System.out.println("�����µ�����");
			pass = reader.readLine();
			pro.setProperty("password", pass);
			
			//�����µ�����
			pro.store(new FileWriter("e:/my.properties"), null);
		} else {
			System.out.println("��½ʧ��");
		}
	}
}
