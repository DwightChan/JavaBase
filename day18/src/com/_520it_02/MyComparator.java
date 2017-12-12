package com._520it_02;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		//o1和o2就是传进来参与比较的两个对象
		//期望按照ID排序
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		
		return p2.getId() - p1.getId();//>0表示在右边, <0表在左边   =0重复
	}

}
