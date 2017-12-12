package com._520it_02;

//try-catch
public class TryDemo {
	public static void main(String[] args) {
		System.out.println("程序开始");
		System.out.println(".....");
		work3();
		System.out.println(".....");
		System.out.println("程序结束");
	}

	private static void work3() {
		//捕获多个异常
		try {
			String s = "a0";
			int by = Integer.parseInt(s);//NumberFormatException
			int num = 10 / by;//ArithmeticException
			//只有发生了异常并且被捕获才能进入catch,没有异常try结束就结束try-catch结构
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
/*		try {
			String s = "0";
			int by = Integer.parseInt(s);//NumberFormatException
			int num = 10 / by;//ArithmeticException
			//只有发生了异常并且被捕获才能进入catch,没有异常try结束就结束try-catch结构
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}*/
	}
	
	private static void work2() {
		//使用try-catch语句    try中写可能出现异常的代码 catch中写的是可能出现异常的类型 catch中的代码块写的是处理异常的方案
		try {
			System.out.println("*****");
			int num = 10 / 0;
			System.out.println("*****");
//		} catch (Error e) {  //catch中的类型必须能使用接收实际产生的异常对象
		} catch (Exception e) {  //catch中的类型必须能使用接收实际产生的异常对象
//			e.printStackTrace();
			System.out.println("除数不能为0");
		}
		
	}
	
	private static void work1() {
		//模拟核心
//		int num = 10 / 2;
		int num = 10 / 2;//ArithmeticException/com._520it_02.TryDemo.main(TryDemo.java:11)/ by zero
	}
}
