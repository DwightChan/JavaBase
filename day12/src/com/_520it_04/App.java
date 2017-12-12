package com._520it_04;

import java.io.Console;

public class App {
	//注册案例
	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("请输入注册用户名:");
		String username = console.readLine();
		System.out.println("请输入注册密码:");
		char[] pass = console.readPassword();
//		try {
//			regist(username, new String(pass));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		regist(username, new String(pass));
	}
	
	public static void regist(String username, String password) {
		if (username == null || "admin".equals(username) || "".equals(username.trim())) {
			//1try-catch  2抛
			throw new RegistException("用户名不合法" + username);
		}
		
		System.out.println("...注册成功...");
	}
}
