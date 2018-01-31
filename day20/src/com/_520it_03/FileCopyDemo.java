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
	public static void main(String[] args) throws Exception {
		copy3("/Users/dwight/Desktop/ioshtml5.rar","/Users/dwight/Desktop/java/ioshtml5.rar");
//		copy4("/Users/dwight/Desktop/ioshtml5.rar","/Users/dwight/Desktop/java/ioshtml5.rar");
	}
	
	private static void copy4(String src, String dest) throws Exception {
		
		try {
			// 这些流都是资源, 资源用完都要关闭
			Reader reader = new FileReader(src);
			Writer writer = new FileWriter(dest);
			
			char[] c = new char[1024];
			int len;
			long s = System.currentTimeMillis();
			
			// 边读边写
			while ((len = reader.read(c)) != -1) {
				writer.write(c, 0, len);
			}
			
			writer.flush();
			
			// try 中出现异常 资源么有关闭
			String a = null;
			System.out.println(a.toCharArray());
			
			
			System.out.println(System.currentTimeMillis() - s);
			
			reader.close();
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
			
			//去掉用关闭资源的代码 不需要手动关闭了, 自动关闭代码
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
				if (reader != null) { // 先判断是否为空 如果
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally { /// 这样可以保证一定可以关闭 所有的流接口
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
