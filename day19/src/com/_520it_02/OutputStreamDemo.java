package com._520it_02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//确定目标
//		File file = new File("/Users/dwight/Desktop/java/test/1.txt"); 
		String path = "/Users/dwight/Desktop/java/test/1.txt";
		
		//创建一个文件输出字节流对象  文件要是不存在会创建出来
//		OutputStream out = new FileOutputStream(file);
		OutputStream out = new FileOutputStream(path, true);
		
		//进入写出操作  只能写出1个字节或字节数组
		work1(out);
		
		//关闭资源
		out.close();
	}

	private static void work2(OutputStream out) throws Exception {
		//写字节数组
		byte[] data = {'a','b','c','d'};
		out.write(data);
		//参数1,写出的数据.参数2,从哪个地方开始写.参数3,写多少个
		out.write(data, 1, 2);
	}
	
	private static void work1(OutputStream out) throws Exception {
		int data = '我';
		out.write(data);
		data = 'z';
		out.write(data);
	}
}
