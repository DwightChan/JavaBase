package com._520it_01;

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args) {
		//获取文件属性信息
		File file = new File("e:/1.txt");
		
		//获取绝对路径   从根路径开始表示的路径就是绝对路径
		String path = file.getAbsolutePath();
		System.out.println(path);
		//获取相对路径
		path = file.getPath();
		System.out.println(path);
		
		//获取文件的大小  单位的B
		long len = file.length();
		System.out.println(len);
		
		//获取文件名字
		String name = file.getName();
		System.out.println(name);
		System.out.println(file.isHidden());
		
		//马上删除
//		file.delete();
		//在JVM退出的时候删除
		file.deleteOnExit();
		System.out.println(111);
	}
}
