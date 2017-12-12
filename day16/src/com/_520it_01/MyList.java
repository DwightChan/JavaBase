package com._520it_01;

public class MyList {

	private Integer[] eles;
	private int index;//当前所在的索引
	
//	1):默认需要安排多少队员上场。  构造方法
	public MyList() {
		eles = new Integer[5];
	}
	
//	2):把挑选好的队员存放到数组中。add
	public void add(Integer ele) {
		eles[index] = ele;
		index++;
	}
	
//	3):查询指定队员所在的位置。indexOf
	public int indexOf(int key) {
		for (int i = 0; i < eles.length; i++) {
			if (key == eles[i]) {
				return i;
			}
		}
		return -1;
	}
	
//	4):查询指定位置的队员是谁。get
	public Integer get(int index) {
		return eles[index];
	}
	
//	5):队员不幸战死，从战场上删除一名队员。remove
	public void remove(int index) {
		eles[index] = null;
		this.index--;
	}
	
//	6):队员不幸受伤，把指定位置的队员替换成另一名队员。set
	public void set(int index, Integer ele) {
		eles[index] = ele;
	}
	
//	7):返回战场上存活的队员。size
	public int size() {
		return index;
	}
	
//	8):打印出上场的所有队员。toString
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (Integer i : eles) {
			if (i != null) {
				sb.append( i + ",");
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("]");
		return sb.toString();
	}
}
