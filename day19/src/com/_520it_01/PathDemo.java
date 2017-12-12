package com._520it_01;

import java.io.File;

public class PathDemo {
	public static void main(String[] args) {
		//表示一个路径   d盘下的逍遥下的day01
		String path = "d:\\逍遥\\day01";
		System.out.println(path);
		//Java开发中,会使用 / 来表示文件路径的分隔符
		path = "d:/逍遥/day01";
		System.out.println(path);
		
//		Java语言是跨平台的
//		path = "d:" + File.separatorChar + "逍遥" + File.separatorChar + "day01";
		System.out.println(path);
	}
}
