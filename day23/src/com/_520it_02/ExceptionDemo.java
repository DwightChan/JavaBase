package com._520it_02;

import java.io.FileInputStream;
import java.io.InputStream;

public class ExceptionDemo {
	public static void main(String[] args) {
		//在jdk7中可以同时捕获多个异常
		work();
	}

	private static void work1() {
		InputStream in = null;
		int j = 0;
		try {
			int i = j/0; 
			in = new FileInputStream("");
			j = in.read();
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		} catch (ArithmeticException | IOException e) {
//			e.printStackTrace();
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
	}
	
	//为了方便我们捕获异常通常都会捕获Exception,但是如果这个异常不能处理,只能抛
	//这样就会参数连锁反应
	public static void work() {
		//增强throw语句
		try {
			int a = 1/0;
		} catch (Exception e) {
			//jdk1.7后对throw语句增强,可以识别出异常的真实类型
			throw e;
		}
	}
}
