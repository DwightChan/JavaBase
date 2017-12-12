package com._520it_01;

import java.io.Serializable;

//字符串能写出去是因为实现了序列化接口,而我的User不能写出去,就是没有实现序列化接口
public class User implements Serializable {//实现序列化接口,启动序列化功能
	//显示声明序列化ID
	
	private static final long serialVersionUID = 2021784452294265990L;
	
	int id;
	String username;
	transient String password;
	
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
}
