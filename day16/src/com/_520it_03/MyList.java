package com._520it_03;

import java.util.Arrays;

//ģ��ArrayList
public class MyList {

	private Object[] eles;
	private int size;//�洢��ǰ�ж��ٸ�Ԫ��
	
//	1):Ĭ����Ҫ���Ŷ��ٶ�Ա�ϳ���  ���췽��
	public MyList() {
		eles = new Object[5];
	}
	
//	2):����ѡ�õĶ�Ա��ŵ������С�add
	public void add(Object ele) {
		//���ʱ,�п������˻�Ҫ�������,��ʱҪ��������
		if (size >= eles.length - 1) {
			eles = Arrays.copyOf(eles, eles.length + 10);
		}
		
		eles[size] = ele;
		size++;
	}
	
//	3):��ѯָ����Ա���ڵ�λ�á�indexOf
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
	
//	4):��ѯָ��λ�õĶ�Ա��˭��get
	public Object get(int index) {
		if (index > size) {
			throw new RuntimeException(index + "����������");
		}
		
		return eles[index];
	}
	
//	5):��Ա����ս������ս����ɾ��һ����Ա��remove
	public void remove(int index) {
		if (index > size) {
			throw new RuntimeException(index + "����������");
		}
		
		//ɾ����,�������ǰŲ��
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
	
//	6):��Ա�������ˣ���ָ��λ�õĶ�Ա�滻����һ����Ա��set
	public void set(int index, Object ele) {
		if (index > size) {
			throw new RuntimeException(index + "����������");
		}
		
		eles[index] = ele;
	}
	
//	7):����ս���ϴ��Ķ�Ա��size
	public int size() {
		return size;
	}
	
//	8):��ӡ���ϳ������ж�Ա��toString
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
	
//	2.�����ж��б�Ԫ���Ƿ�Ϊ�յķ�����isEmpty
	public boolean isEmpty() {
		return size == 0;//indexΪ��˵��û��Ԫ��
	}
	
//	3.��������б�ķ�����clear
	public void clear() {
		eles = new Object[0];
		size = 0;
	}

}

