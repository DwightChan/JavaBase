package com._520it_day8;

public class WarpDemo {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);//��װ10
		i1.intValue();//��ȡ����װ��ֵ
		
		i1 = 100;//�Զ�װ��JDK1.5  valueOf
		int i2 = i1;//�Զ�����             intValue
		
		int num = Integer.parseInt("123");//ֻ���ַ�������ȫ����0-9���ܳɹ�
		System.out.println(num);
	}
}
