package com._520it_day2;

//变量
public class VarDemo {
//	成员变量
	int i;//默认值是0
	
	public static void main(String[] args) {
		/*//定义变量的规则     类型  变量名
		int num; //局部变量没有初始化,实际上是没有分配内存空间的
		//局部变量在使用前必须先赋值
		num = 10;
		System.out.println(num);
		
		//基本类型的最大值/最小值去包装类找静态常量
		//double的最大值
		System.out.println(Double.MAX_VALUE);
		
		//二进制/八进制/十六进制
		System.out.println(0b11);//表示二进制数  0b开头
		System.out.println(010);//表示八进制数  0开头
		System.out.println(0x10);//表示十六进制数  0x开头
		
		//类型转换中 ,为什么boolean类型不能参与     因为不是数值
		int a = 10;
		byte num2 = 10;//判断常量是否在此变量的范围,在隐式转换
		num2 = (byte)a;//大转小   ->  强转
		
		a = num2;  //小转大  --> 自动转换
		
		double num1 = 10;
		byte num2 = 10;
		int num3 = 10;
		short num4 = 10;
		
		int res = num2 + num4;
		float f = res + 1.0F;
		double num5 = num1 + num4;
		//1.低于int类型转为int.   2.以表达式中最高的类型就是结果的类型
		 
		int i = 1;
		int z = i--;//后++表示式的值就是i的原值
		i = z;//i = i
		System.out.println(i);
		
		int i = 10;
		i += i++;
		System.out.println(i);
		
		int i = 0;//-1 < i < 10
		System.out.println(-1 < i && i < 10);
		//&& || 是带有短路功能,效率高些*/
		
		//位运算   ~ & | ^ <<  >>  >>>
		int num1 = 0b0000_0000_0000_0000_0000_0000_0000_0101; //5
		int num2 = 0b1000_0000_0000_0000_0000_0000_0000_0010; //2
		System.out.println(num1 & num2);//0
		System.out.println(num1 | num2);//7
		System.out.println(num1 ^ num2);//
		System.out.println(~num2);//-3
		
		System.out.println(num1 << 34);//
		System.out.println(num1 >> 2);//
		//0b0100_0000_0000_0000_0000_0000_0000_0001;
		System.out.println(num2 >>> 1);//
 	}
}
