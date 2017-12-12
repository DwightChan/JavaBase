package com._520it_02;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo {
	public static void main(String[] args) throws Exception {
		//定义目标
		String name = "e:/1.txt";
		
		//创建流对象
		Writer writer = new FileWriter(name);
		
		work1(writer);
		
		//关闭资源
		//先刷新该流的缓冲区,再关闭资源
		writer.close();
	}

	private static void work2(Writer writer) throws Exception {
		//写入一句话   万万没想到,啦啦啦啦
		writer.write("万万没想到,啦啦啦啦!");
	}
	
	private static void work1(Writer writer) throws Exception {
		//写出字符
		/*
		 字符流的write方法不是把数据输入文件,是写入底层的缓冲区
		 */
		writer.write('a');
		writer.write('a');
		writer.write('的');
		writer.write('的');
		//把缓冲区的数据写入文件
		writer.flush();
	}
}
