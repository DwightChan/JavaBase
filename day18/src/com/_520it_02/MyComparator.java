package com._520it_02;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		//o1��o2���Ǵ���������Ƚϵ���������
		//��������ID����
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		
		return p2.getId() - p1.getId();//>0��ʾ���ұ�, <0�������   =0�ظ�
	}

}
