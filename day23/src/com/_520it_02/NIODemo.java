package com._520it_02;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIODemo {
	public static void main(String[] args) throws Exception {
		//�����ļ�
		Path source = Paths.get("E:/��ң/1125/day23/ö��switch.bmp");
		OutputStream out = new FileOutputStream("d:/1.bmp");
		long data = Files.copy(source, out);
		System.out.println(data);
		out.close();
	}
}
