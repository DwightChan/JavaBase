package com._520it_01;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		
		//压栈
		s.push("123");
		s.push("王尼玛");
		s.push("王蜜桃");
		s.push("123");
		System.out.println(s);
		
		Object obj = s.pop();//弹栈
		System.out.println(obj);
		System.out.println(s);
		
		obj = s.peek();//查看栈顶的元素,不删除
		System.out.println(obj);
		System.out.println(s);
	}
}
