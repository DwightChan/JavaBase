package com._520it_03;

import java.util.Iterator;

public class MyList implements Iterable {

	@Override
	public Iterator iterator() {
		return new Iterator() {
			int cur; //µ±«∞Œª÷√
			int total = 10;
			
			@Override
			public boolean hasNext() {
				return cur != total;
			}

			@Override
			public Object next() {
				cur++;
				return "haha";
			}
		};
	}
	
	public static void main(String[] args) {
		MyList list = new MyList();
		for (Object obj: list) {
			System.out.println(obj);
		}
	}
}
