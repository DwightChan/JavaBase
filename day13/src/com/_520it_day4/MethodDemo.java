package com._520it_day4;

public class MethodDemo {
	public static void main(String[] args) {
		
	}
	
	/*[修饰符] 返回值类型 方法名([形参列表]) {
		[return 值;]
		返回值类型不是void时,必须使用return 返回对应类型的一个值
		返回值类型不是void时,方法最后执行的语句必须是return 值;
		}*/
	public static int work() {
		boolean flag = false;
		if (flag) {
			return 0;
		}
		return 0;//保证有值返回
	}
	
	//方法的重载   二同一不同  跟返回值类型无关,参数的名字无关
	public static void work(int i) {}
}
