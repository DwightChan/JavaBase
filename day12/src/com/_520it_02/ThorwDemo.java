package com._520it_02;

public class ThorwDemo {
	public static void main(String[] args) //throws Exception  
	{
		System.out.println("...");
		//因为这个方法抛出了编译时期异常,所有必须要处理.  1再抛出异常   2try-catch
//		try {
//			div(1,0);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		div(1,0);
		
		Integer.parseInt("");//NumberFormatException是RuntimeException的子类
		System.out.println("...");
	}
	
	/*
	 throw 表示的是要抛出怎么的异常对象,在方法中使用的 
	 throws 表示的是该方法可能抛出异常的类型,在声明方法使用说明,可以抛出多个异常类型
	 */
	public static void div(int a, int b) {
		if (b == 0) { //我们这里做法有问题,应该抛出异常
//			throw new Exception("除数为0");
			throw new RuntimeException("除数为0");
		} else {
			System.out.println(a / b);
		}
		
		/*if (b == 0) { //我们这里做法有问题,应该抛出异常
			System.out.println("除数不能为0");
		} else {
			System.out.println(a / b);
		}*/
	}
}
