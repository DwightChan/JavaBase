package com._520it_01;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args) throws Exception {
		// 通过一个字符串路径来创建文件对象
//		String pathname = "e:/aaa1/bbb1/cc/a1/cfr";
		String pathname = "e:/a.avi";
		File file = new File(pathname);
		
		//创建文件夹
		/*
		 如果不存在,就创建-->true
		 存在?不创建-->false
		 只能创建1级目录
		System.out.println(file.mkdir());//true:创建成功    false:创建失败
		//推荐,可以创建多级目录
		System.out.println(file.mkdirs());
		 */
		
		//创建文件
		/*
		 true: ok   false: no
		 创建出来的是文件还是文件夹由你调用的方法决定跟路径无关
		System.out.println(file.createNewFile());
		 */
		
		//重命名
		/*
		同目录下表示的是重命名,不同目录表示剪切
		 */
		System.out.println(file.renameTo(new File("d:/a.avi")));
	}
}
