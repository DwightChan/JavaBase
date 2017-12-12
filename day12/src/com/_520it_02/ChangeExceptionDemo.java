package com._520it_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChangeExceptionDemo {
//	public static void work() throws FileNotFoundException {
	public static void work() {
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			//异常的转型    
			//以后要是遇到不能处理的异常,就必须做转型    编译时期异常 --> 运行时期异常
			//RuntimeException(Throwable cause)
			throw new RuntimeException(e);//把e中的异常信息传递给RuntimeException
		}
	}
	
	public static void main(String[] args) {
		work();
	}
}
