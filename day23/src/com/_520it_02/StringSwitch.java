package com._520it_02;

import java.util.ArrayList;
import java.util.List;

public class StringSwitch {
	public static void main(String[] args) {
		String key = "123";
		System.out.println(key.hashCode());
		//switch只支持byte/short/char/int
		switch (key) {
			case "123":
				break;
	
			default:
		}
	}
	
	public static void work() {
		//jdk1.7出现菱形语法  创建对象的时候,不指定对象的泛型,它会直接引用声明变量的泛型
		List<String> list = new ArrayList<>();
//		list.add
	}
}
