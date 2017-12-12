package com._520it_01;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo {
	public static void main(String[] args) {
		//E:\逍遥\1125\day05\code\com_520it_04
		File file = new File("E:/逍遥/1125/day05/code/com_520it_04");
		
		//这个方法获取到的是该目录下所有的文件,但是我们要是只是所有的字节码文件
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				/*//参数是传入的文件对象
			     	System.out.println(pathname);
				//返回值true 不要过滤  false 要过滤*/				
				return pathname.getName().endsWith(".class");
			}
		});
		System.out.println(files.length);
		
		for (File f : files) {
			System.out.println(f);
		}
	}
}
