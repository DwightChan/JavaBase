package com._520it_04;

public class MyStack {
	private Object[] eles;
	private int index;

	public MyStack() {
		super();
		eles = new Object[10];
	}
	
	//��ջ
	public Object pop() {
		Object object = eles[--index];
		eles[index] = null;
		return object;
	}
	
	//ѹջ
	public void push(Object ele) {
		eles[index++] = ele;
	}
}
