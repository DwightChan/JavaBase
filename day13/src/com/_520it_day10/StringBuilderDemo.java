package com._520it_day10;

import java.util.Date;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();//默认长度是16
		//创建一个有20个长度的字符串缓冲区
//		new StringBuilder(20);
		
		//往缓冲区添加内容   append(Object obj);
		sb.append("123").append(new Date());
		
		//返回此序列中数据的字符串表示形式
		System.out.println(sb.toString());
		/*
 		StringBuidler/StringBuffer:
		------面试-------------------
		StringBuffer  :特点: 线程安全性较高,但是性能较低.  多线程使用StringBuffer.
		StringBuilder :特点: 线程安全性较低,当时性能较高. 推荐        单线程使用StringBuilder.
		 */
		
	}
}
