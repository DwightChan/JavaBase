package com._520it_01;

import java.io.Serializable;

//�ַ�����д��ȥ����Ϊʵ�������л��ӿ�,���ҵ�User����д��ȥ,����û��ʵ�����л��ӿ�
public class User implements Serializable {//ʵ�����л��ӿ�,�������л�����
	//��ʾ�������л�ID
	
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
