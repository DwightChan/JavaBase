package com._520it_04;

import java.io.Console;

public class App {
	//ע�᰸��
	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("������ע���û���:");
		String username = console.readLine();
		System.out.println("������ע������:");
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
			//1try-catch  2��
			throw new RegistException("�û������Ϸ�" + username);
		}
		
		System.out.println("...ע��ɹ�...");
	}
}
