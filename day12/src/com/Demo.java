package com;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		String ext = "jpg;jpeg;png;gif;bmp;ico";
		String[] data = ext.split(";");
		System.out.println(Arrays.toString(data));
		
		String fileName = "aaaa.png";
		
		boolean check = check(fileName,data);
		System.out.println("ͼƬ?" +  check);
	}

	private static boolean check(String fileName, String... data) {
		for (String s : data) {
			if (fileName.endsWith(s)) {
				return true;
			}
		}
		return false;
	}
}
