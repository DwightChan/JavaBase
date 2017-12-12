package com._520it_02;

public class FianllyDemo {
	public static void main(String[] args) {
		int i = todo2();
		System.out.println(i);
//		InputStream is = new FileInputStream("d:/1.txt");
//		is.read();
//		is.read();
//		is.close();
	}

	private static int todo2() {
		int i = 0;
		try {
			System.out.println("程序开始,创建资源");
			System.exit(0);
			return i;
		} finally {
			i++;
			System.out.println("程序结束,释放资源");
		}
	}
	
	private static void todo1() {
		try {
			System.out.println("程序开始,创建资源");
			System.out.println("......");
			//核心
			work1("12");
			System.out.println("......");
//			System.out.println("程序结束,释放资源");
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			System.out.println("程序结束,释放资源");
		} finally {//用于释放资源  finally的特点是无论是否有异常都会执行的代码块
			System.out.println("程序结束,释放资源");
		}
	}

	private static void work1(String s) {
		Integer.parseInt(s);
	}
}
