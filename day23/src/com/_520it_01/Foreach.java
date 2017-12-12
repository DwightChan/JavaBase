package com._520it_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		//为什么要使用foreach
		/*int[] arr = {1,2,3,4,5,6};
		work1(arr);*/
		
		List c = new ArrayList();
		c.add("11");
		c.add(new Date());
		c.add('a');
		c.add("aaaa");
		c.add("zzz");
		
		work2(c);
	}
	
	private static void work2(Collection c) {
		//实现Iterable接口可以成为foreach的目标
		//使用foreach迭代集合的过程中,同样也是不能改变集合中的元素
		/*for (Object o : c) {
			if (o.equals('a')) {
				o = null;
			}
			System.out.println(o);
//			c.add("1111"); 遍历的过程中,不能改动源集合的元素
		}*/
		
		Iterator it = c.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
			it.remove();
			c.add("11");
		}
		
		System.out.println(c);
	}

	private static void work1(int[] arr) {
		//遍历所有的元素
		//数组的索引从0开始到length-1 索引不精通容易越界
		/*for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		//因为我们要的只是数组的元素,不关心索引,在JDK5开始提供了foreach循环
		/*
		 for (元素类型 : 目标)  
		 */
		for (int i : arr) {
			System.out.println(i);
		}
		
		int[] dest = arr;
		int i;
		for (int j = 0; j < dest.length; j++) {
			i = dest[j];
			System.out.println(i);
		}
	}
}
