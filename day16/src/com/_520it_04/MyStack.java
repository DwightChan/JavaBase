package com._520it_04;

public class MyStack {
	private Object[] eles;
	private int index;

	public MyStack() {
		super();
		eles = new Object[10];
	}
	
	//µ¯Õ»
	public Object pop() {
		Object object = eles[--index];
		eles[index] = null;
		return object;
	}
	
	//Ñ¹Õ»
	public void push(Object ele) {
		eles[index++] = ele;
	}
}
