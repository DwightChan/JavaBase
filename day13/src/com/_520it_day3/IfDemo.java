package com._520it_day3;

//if-switch
public class IfDemo {
	public static void main(String[] args) {
		//if if-else if-[else if]*-[else]
		boolean flag = false;
		/*if (flag) { //true执行代码块  //false不执行
			System.out.println("true");
		}
		
		if (flag) {  //true
			System.out.println("true");
		} else { //false
			System.out.println("false");
		}
		
		//多个条件选择1个条件
		if (flag) {//true
			System.out.println("条件1");
		} else if (!flag) {//false 继续判断
			System.out.println("条件2");
		} else {
			System.out.println("条件n");
		}*/
//		long i = 3L;
		int i = 3;
		switch (i) {//没有long,只有小于等于int的类型
			case 1:
				System.out.println("条件1");
				break;
			case 2:
				System.out.println("条件2");
				break;
			case 3:
				System.out.println("条件3");
				break;
			case 4:
				System.out.println("条件4");
				break;
			default:
				break;
		}
	}
}
