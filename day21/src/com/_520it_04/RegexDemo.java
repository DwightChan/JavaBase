package com._520it_04;

import java.util.Arrays;

public class RegexDemo {
	public static void main(String[] args) {
		//验证
		String telNo = "13345371901";
		System.out.println("是手机号吗?" + check(telNo));
		//匹配
//		boolean flag = work1(telNo);
//		System.out.println(flag);
		//work4(); 
	}
	
	private static void work4() { 
		String data = "我我我今天吃吃吃吃吃吃了好好多的好好吃的";
		String s = data.replaceAll("(.)\\1+", "$1");
		System.out.println(s);
	}
	
	//替换操作
	private static void work3() {
		String data = "aaaaabba";
		//把所有的a替换出z
		//定义一个正则
		String regex = "a+";
		//参数1:正则表达式   参数2:用来替换的内容
		String s = data.replaceAll(regex, "a");
		System.out.println(s);
	}
	
	//切割
	private static void work2() {
		String data = ".png$.jpg$.jpeg$.bmp$.gif";
		
		//定义一个正则
		String regex = "\\$";
		String[] arr = data.split(regex);
		System.out.println(Arrays.toString(arr));
		
		String fileName = "1.png";
		for (String s : arr) {
			if (fileName.endsWith(s)) {
				System.out.println("是图片");
				return;
			}
		}
		
		System.out.println("不是图片");
	}
	
//	匹配
	private static boolean work1(String telNo) {
		//定义正则
		String regex = "1[3578]\\d{9}";
		
		return telNo.matches(regex);
	}

	//定义一个方法来识别是否是手机号码
	public static boolean check(String no) {
		boolean flag = false;
		//1.有11个数字  2.1开头  3.第二个数字必须是3|5|7|8
		if (no.length() == 11) {
			if (no.startsWith("1")) {
				char c = no.charAt(1);
				if (c == '3' || c == '5' || c == '7' || c == '8') {
					flag = true;
				}
			}
		}
		
		return flag;
	}
}
