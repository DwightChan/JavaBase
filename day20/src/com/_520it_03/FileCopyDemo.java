package com._520it_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileCopyDemo {
	public static void main(String[] args) {
		copy3("E:/逍遥/1125/eclipse-jee-mars-R-win32.zip","d:/eclipse-jee-mars-R-win32.zip");
	}
	
	private static void tryWithResource() {
		try (	//这里必须是实现了AutoCloseadble接口的对象
				InputStream is = new FileInputStream("");
				OutputStream os = new FileOutputStream("");
			) {			
			
			//进行读写操作
			byte[] b = new byte[1024];
//			先读
			int len;
			long s = System.currentTimeMillis();
			//边读边写
			while ((len = is.read(b)) != -1) {
				os.write(b, 0, len);
			}
			System.out.println(System.currentTimeMillis() - s);
			
			//去掉用关闭资源的代码
//			is.close();
//			os.close();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
	private static void copy3(String src, String dest) {
		//流都是资源,资源用完一定要关闭
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader(src);
			writer = new FileWriter(dest);
			//try中出现异常资源没有关闭
			String a = null;
			System.out.println(a.toCharArray());
			
			char[] c = new char[1024];
			int len;
			
			long s = System.currentTimeMillis();
			//边读边写
			while ((len = reader.read(c)) != -1) {
				writer.write(c, 0, len);
			}
			writer.flush();
			
			System.out.println(System.currentTimeMillis() - s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (writer != null) {
						writer.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void copy2(String src, String dest) throws Exception {
//		String src = "e:/1.java";
//		String dest = "d:/bak.java";
		
		Reader reader = new FileReader(src);
		Writer writer = new FileWriter(dest);
		
		char[] c = new char[1024];
		int len;
		
		long s = System.currentTimeMillis();
		//边读边写
		while ((len = reader.read(c)) != -1) {
			writer.write(c, 0, len);
		}
		writer.flush();
		
		System.out.println(System.currentTimeMillis() - s);
		
		reader.close();
		writer.close();
	}
	
	private static void copy1(String src, String dest) throws Exception {
		//把e:/1.txt文件拷贝到d:/bak.txtx
//		String src = "e:/1.java";
//		String dest = "d:/bak.java";
		
		//创建输入输出流对象
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(dest);
		
		//进行读写操作
		byte[] b = new byte[1024];
//		先读
		int len;
		long s = System.currentTimeMillis();
		//边读边写
		while ((len = is.read(b)) != -1) {
			os.write(b, 0, len);
		}
		System.out.println(System.currentTimeMillis() - s);
		//关闭资源
		is.close();
		os.close();
	}
}
