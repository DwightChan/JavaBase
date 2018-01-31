package com._520it_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectStreamDemo {
	public static void main(String[] args) throws Exception {
//		write();
		read();
	}
	
	public static void read() throws Exception {
		//����Դ
		InputStream is = new FileInputStream("dwight.txt");
		
		//������������������
		ObjectInputStream in = new ObjectInputStream(is);
		 
		//��ȡ����
		User u = (User) in.readObject();
		System.out.println(u);
		Object obj;
		while((obj = in.readObject()) != null){
			User u1 = (User)obj;
			System.out.println(u1);
		}
		
		//�ر���Դ
		in.close();
	}
	
	public static void write() throws Exception {
		//ʹ�ö���������д����
		//ȷ��Ŀ��
		OutputStream os = new FileOutputStream("dwight.txt");
		
		//�����������������
		ObjectOutputStream out = new ObjectOutputStream(os);
		
		//����д����
//		out.writeObject("����û�뵽,�뵽�����");
		//д���Զ������
		User user = new User(10, "������1", "123");
		out.writeObject(user);
		
		User user1 = new User(10, "������", "123");
		out.writeObject(user1);
		
		//�ر���Դ
		out.close();
	}
}
