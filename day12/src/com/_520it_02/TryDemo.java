package com._520it_02;

//try-catch
public class TryDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ");
		System.out.println(".....");
		work3();
		System.out.println(".....");
		System.out.println("�������");
	}

	private static void work3() {
		//�������쳣
		try {
			String s = "a0";
			int by = Integer.parseInt(s);//NumberFormatException
			int num = 10 / by;//ArithmeticException
			//ֻ�з������쳣���ұ�������ܽ���catch,û���쳣try�����ͽ���try-catch�ṹ
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
/*		try {
			String s = "0";
			int by = Integer.parseInt(s);//NumberFormatException
			int num = 10 / by;//ArithmeticException
			//ֻ�з������쳣���ұ�������ܽ���catch,û���쳣try�����ͽ���try-catch�ṹ
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}*/
	}
	
	private static void work2() {
		//ʹ��try-catch���    try��д���ܳ����쳣�Ĵ��� catch��д���ǿ��ܳ����쳣������ catch�еĴ����д���Ǵ����쳣�ķ���
		try {
			System.out.println("*****");
			int num = 10 / 0;
			System.out.println("*****");
//		} catch (Error e) {  //catch�е����ͱ�����ʹ�ý���ʵ�ʲ������쳣����
		} catch (Exception e) {  //catch�е����ͱ�����ʹ�ý���ʵ�ʲ������쳣����
//			e.printStackTrace();
			System.out.println("��������Ϊ0");
		}
		
	}
	
	private static void work1() {
		//ģ�����
//		int num = 10 / 2;
		int num = 10 / 2;//ArithmeticException/com._520it_02.TryDemo.main(TryDemo.java:11)/ by zero
	}
}
