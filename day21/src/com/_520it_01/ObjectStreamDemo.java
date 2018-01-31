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
		//定义源
		InputStream is = new FileInputStream("dwight.txt");
		
		//创建对象输入流对象
		ObjectInputStream in = new ObjectInputStream(is);
		 
		//读取对象
		User u = (User) in.readObject();
		System.out.println(u);
		Object obj;
		while((obj = in.readObject()) != null){
			User u1 = (User)obj;
			System.out.println(u1);
		}
		
		//关闭资源
		in.close();
	}
	
	public static void write() throws Exception {
		//使用对象流往外写对象
		//确定目标
		OutputStream os = new FileOutputStream("dwight.txt");
		
		//创建对象输出流对象
		ObjectOutputStream out = new ObjectOutputStream(os);
		
		//往外写对象
//		out.writeObject("万万没想到,想到个广告");
		//写出自定义对象
		User user = new User(10, "王胖子1", "123");
		out.writeObject(user);
		
		User user1 = new User(10, "王胖子", "123");
		out.writeObject(user1);
		
		//关闭资源
		out.close();
	}
}
