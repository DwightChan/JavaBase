package com._520it_05;

//E表示泛型的占位符,默认是Object类型
public class Point<E> {//泛型类,在类上定义的泛型,在整个类中有效
//	String x;
	E x;
	E y;
	
	//在方法中定义的泛型,只在当前方法中有效
	public static <T> void name() {//方法上定义泛型,必须定义在返回值类型前
		
	}
	
	public static void main(String[] args) {
		
		Point<Integer> p1 = new Point<>();
	}
}
