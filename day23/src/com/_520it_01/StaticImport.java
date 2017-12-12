package com._520it_01;

//表示导入该类的所有静态的成员
import static java.lang.Math.E;
import static java.util.Arrays.sort;//静态导入导入的是静态的成员
//静态导入不能使用与Object类中同名的方法

public class StaticImport {
	public static void main(String[] args) {
//		Date d = new Date();//默认去java.lang中找类,这个类在java.util中  肯定报错
		
		//使用不在java.lang包中的类,使用类的全限定名
		/*java.util.Date d1 = new java.util.Date();
		java.util.Date d2 = new java.util.Date();
		java.util.Date d3 = new java.util.Date();
		java.util.Date d4 = new java.util.Date();
		java.util.Date d5 = new java.util.Date();*/
		
//		Date d = new Date();
		
		sort(new int[]{1,2,3,4});
		
		System.out.println(Math.PI);
		System.out.println(E);
	}

}
