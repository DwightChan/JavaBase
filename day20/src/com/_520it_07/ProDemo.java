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
		//读取属性文件
		pro.load(new FileReader("e:/my.properties"));
		
//		System.out.println(pro);
//		获取文件中的内容  根据Key来获取
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		
//		System.out.println(username+"--"+password);
		
		//从键盘录入信息
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("请输入账号:");
		String name = reader.readLine(); 
		System.out.println("请输入密码:");
		String pass = reader.readLine();
		
		if (username.equals(name) && password.equals(pass)) {
			System.out.println("登陆成功");
			System.out.println("输入新的密码");
			pass = reader.readLine();
			pro.setProperty("password", pass);
			
			//保存新的内容
			pro.store(new FileWriter("e:/my.properties"), null);
		} else {
			System.out.println("登陆失败");
		}
	}
}
