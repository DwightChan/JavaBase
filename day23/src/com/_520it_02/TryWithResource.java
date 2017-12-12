package com._520it_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramSocket;

public class TryWithResource {
	public static void main(String[] args) {
		
	}

	private static void work2() {
		//try-with-resource   自动关闭资源
		try (
		//这里写创建AutoCloseable对象的语句
			InputStream in = new FileInputStream("");
//				String a = "";
		) {
			//可能出现异常的代码
		} catch (Exception e) {
			//该怎么处理怎么处理
			throw new RuntimeException(e);
		}
		//最后不用我们来手动关闭资源
	}
	
	private static void work1() {
		InputStream in = null;
		try {
			int a = 1 / 0;
			in = new FileInputStream("");
			a = 1 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
}
