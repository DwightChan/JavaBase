package com._520it_01;

import java.io.File;

public class FileDemo4 {
	public static void main(String[] args) {
		//遍历文件夹
		File root = new File("/Users/dwight/Desktop/java");
		
		//千万不到递归删除文件
//		searchAllFiles(root);
		
		//获取所有的根路径
		File[] roots = File.listRoots();
		for (File f : roots) {
			System.out.println(f);
		}
		
	/*	//调用list方法可以返回该目录下所有的文件和文件夹的名字
		String[] names = root.list();
		for (String s : names) {
			System.out.println(s);
		}
		
		File[] files = root.listFiles();
		for (File f : files) {
			//System.out.println(f.toString() + "---" + f.isFile());
			if (f.isDirectory()) {
				File[] inFiles = f.listFiles();
				for (File f1 : inFiles) {
					System.out.println(f1.toString() + "---" + f1.isFile());
				}
			}
		}
		xjad Java 反编译工具
	 */
	}
	
	//递归
	public static void searchAllFiles(File root) {
		File[] files = root.listFiles();
		for (File f : files) {
			//System.out.println(f.toString() + "---" + f.isFile());
			if (f.isDirectory()) {
				//继续深入
				System.out.println(f.getAbsolutePath());
				searchAllFiles(f);
			} else {
				System.out.println(f.getAbsolutePath());
			}
		}
	}
}
