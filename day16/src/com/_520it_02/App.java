package com._520it_02;

public class App {
	public static void main(String[] args) {
		//������������
		MyList list = new MyList();
		
		//1.���Ŷ�Ա�ϳ�    
		list.add(7);
		list.add(9521);
		list.add(9527);
		//�鿴�����ж�����
		System.out.println(list.size());//3
		System.out.println(list);
		
		//�鿴9521���ĸ�λ��
		System.out.println(list.indexOf(9521));//1
		
		//��ѯĳ��λ���ϵ���
		System.out.println(list.get(2));//9527
		System.out.println("--------------");
		//7Ԫ�ع���
		list.remove(0);
		//�鿴�����ж�����
		System.out.println(list.size());//3
		System.out.println(list);
		
		System.out.println("--------------");
		//�油һ��
		list.set(0, 110);
		//�鿴�����ж�����
		System.out.println(list.size());//3
		System.out.println(list);
		
		System.out.println("--------------");
		list.add(888);
		list.add(999);
		list.add(666);
		list.add(333);
		//�鿴�����ж�����
		System.out.println(list.size());//3
		System.out.println(list);
	}
}
