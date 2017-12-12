package com._520it_01;

public class MyList {

	private Integer[] eles;
	private int index;//��ǰ���ڵ�����
	
//	1):Ĭ����Ҫ���Ŷ��ٶ�Ա�ϳ���  ���췽��
	public MyList() {
		eles = new Integer[5];
	}
	
//	2):����ѡ�õĶ�Ա��ŵ������С�add
	public void add(Integer ele) {
		eles[index] = ele;
		index++;
	}
	
//	3):��ѯָ����Ա���ڵ�λ�á�indexOf
	public int indexOf(int key) {
		for (int i = 0; i < eles.length; i++) {
			if (key == eles[i]) {
				return i;
			}
		}
		return -1;
	}
	
//	4):��ѯָ��λ�õĶ�Ա��˭��get
	public Integer get(int index) {
		return eles[index];
	}
	
//	5):��Ա����ս������ս����ɾ��һ����Ա��remove
	public void remove(int index) {
		eles[index] = null;
		this.index--;
	}
	
//	6):��Ա�������ˣ���ָ��λ�õĶ�Ա�滻����һ����Ա��set
	public void set(int index, Integer ele) {
		eles[index] = ele;
	}
	
//	7):����ս���ϴ��Ķ�Ա��size
	public int size() {
		return index;
	}
	
//	8):��ӡ���ϳ������ж�Ա��toString
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
