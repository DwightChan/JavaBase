package com._520it_03;

import java.util.Arrays;

//模拟ArrayList
public class MyList {

	private Object[] eles;
	private int size;//存储当前有多少个元素
	
//	1):默认需要安排多少队员上场。  构造方法
	public MyList() {
		eles = new Object[5];
	}
	
//	2):把挑选好的队员存放到数组中。add
	public void add(Object ele) {
		//添加时,有可能满了还要继续添加,此时要进行扩容
		if (size >= eles.length - 1) {
			eles = Arrays.copyOf(eles, eles.length + 10);
		}
		
		eles[size] = ele;
		size++;
	}
	
//	3):查询指定队员所在的位置。indexOf
	public int indexOf(Object key) {
		for (int i = 0; i < eles.length; i++) {
			if (eles[i] != null && eles[i].equals(key)) {
				return i;
			} else {
				return -1;
			}
		}
		return -1;
	}
	
//	4):查询指定位置的队员是谁。get
	public Object get(int index) {
		if (index > size) {
			throw new RuntimeException(index + "索引不存在");
		}
		
		return eles[index];
	}
	
//	5):队员不幸战死，从战场上删除一名队员。remove
	public void remove(int index) {
		if (index > size) {
			throw new RuntimeException(index + "索引不存在");
		}
		
		//删除后,后面的往前挪动
		for (int i = index; i < eles.length - 1; i++) {
			if (eles[i + 1] != null) {
				eles[i] = eles[i + 1];
			} else {
				eles[i] = null;
				break;
			}
		}
//		eles[index] = null;
		size--;
	}
	
//	6):队员不幸受伤，把指定位置的队员替换成另一名队员。set
	public void set(int index, Object ele) {
		if (index > size) {
			throw new RuntimeException(index + "索引不存在");
		}
		
		eles[index] = ele;
	}
	
//	7):返回战场上存活的队员。size
	public int size() {
		return size;
	}
	
//	8):打印出上场的所有队员。toString
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (Object i : eles) {
			if (i != null) {
				sb.append( i + ",");
			} else {
				break;
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("]");
		return sb.toString();
	}
	
//	2.增加判断列表元素是否为空的方法。isEmpty
	public boolean isEmpty() {
		return size == 0;//index为空说明没有元素
	}
	
//	3.增加清空列表的方法。clear
	public void clear() {
		eles = new Object[0];
		size = 0;
	}

}

