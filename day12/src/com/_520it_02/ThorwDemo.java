package com._520it_02;

public class ThorwDemo {
	public static void main(String[] args) //throws Exception  
	{
		System.out.println("...");
		//��Ϊ��������׳��˱���ʱ���쳣,���б���Ҫ����.  1���׳��쳣   2try-catch
//		try {
//			div(1,0);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		div(1,0);
		
		Integer.parseInt("");//NumberFormatException��RuntimeException������
		System.out.println("...");
	}
	
	/*
	 throw ��ʾ����Ҫ�׳���ô���쳣����,�ڷ�����ʹ�õ� 
	 throws ��ʾ���Ǹ÷��������׳��쳣������,����������ʹ��˵��,�����׳�����쳣����
	 */
	public static void div(int a, int b) {
		if (b == 0) { //������������������,Ӧ���׳��쳣
//			throw new Exception("����Ϊ0");
			throw new RuntimeException("����Ϊ0");
		} else {
			System.out.println(a / b);
		}
		
		/*if (b == 0) { //������������������,Ӧ���׳��쳣
			System.out.println("��������Ϊ0");
		} else {
			System.out.println(a / b);
		}*/
	}
}
