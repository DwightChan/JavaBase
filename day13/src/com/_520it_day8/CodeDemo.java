package com._520it_day8;

public class CodeDemo {
	
	String name = "000";
	
	public CodeDemo() {
		System.out.println(222);
	}
	
	//��������
	{
		System.out.println(111);
	}//ʵ�� ���ǰ�����Ĵ�����ڹ��췽��ǰ
	
	//��̬�����    ����ص�ʱ��ִ��,ִֻ��1��
	static {
		System.out.println("...static...");
	}
	
	public static void main(String[] args) {
		//ÿ�δ������󶼻���ù��췽���͹�������
		new CodeDemo();
		new CodeDemo();
		//��Ա��������-->��������-->���췽��
		
	}
}
