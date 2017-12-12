package com._520it_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		//ΪʲôҪʹ��foreach
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
		//ʵ��Iterable�ӿڿ��Գ�Ϊforeach��Ŀ��
		//ʹ��foreach�������ϵĹ�����,ͬ��Ҳ�ǲ��ܸı伯���е�Ԫ��
		/*for (Object o : c) {
			if (o.equals('a')) {
				o = null;
			}
			System.out.println(o);
//			c.add("1111"); �����Ĺ�����,���ܸĶ�Դ���ϵ�Ԫ��
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
		//�������е�Ԫ��
		//�����������0��ʼ��length-1 ��������ͨ����Խ��
		/*for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		//��Ϊ����Ҫ��ֻ�������Ԫ��,����������,��JDK5��ʼ�ṩ��foreachѭ��
		/*
		 for (Ԫ������ : Ŀ��)  
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
