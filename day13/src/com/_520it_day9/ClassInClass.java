package com._520it_day9;

public class ClassInClass {
	private int i = 10;
	//�ڲ���   �ڲ����ǿ��Է����ⲿ������г�Ա
	class In {//�ƻ���װ
		int a = i;
	}
	
	public static void main(String[] args) {
		IWalkable i = new IWalkable() {
			@Override
			public void walk() {
				/*�����ڲ���ֻ��ʹ��1��
				�����ڲ���ֻ�ܷ���final���εľֲ�����/����
				�ֲ����������������Ƿ���ִ�н���
				����-->GC
				*/
			}
		};//����/�ӿ���(){}  �����ڲ���          new �����ڲ���  ���������ڲ������    ����ͬʱ���������ڲ������
	}
	
	/*
	 ��Ҫʲô���ܾ�������������ʲô���ܵĽӿ�
	 �̳���������ʾ������ϵ��  ��Ϲ�ϵ
	 */
}
