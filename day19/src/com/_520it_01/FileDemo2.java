package com._520it_01;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		//判断操作
		File file = new File("/Users/dwight/Desktop/java/test/test2.plist");
		
		//判断路径是否存在   true:存在  false:不存在
		System.out.println(file.exists());
		
		//判断是否文件  返回true有前提条件的  存在
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
	}
}
