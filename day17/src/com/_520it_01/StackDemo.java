package com._520it_01;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		
		//ѹջ
		s.push("123");
		s.push("������");
		s.push("������");
		s.push("123");
		System.out.println(s);
		
		Object obj = s.pop();//��ջ
		System.out.println(obj);
		System.out.println(s);
		
		obj = s.peek();//�鿴ջ����Ԫ��,��ɾ��
		System.out.println(obj);
		System.out.println(s);
	}
}
