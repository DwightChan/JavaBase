package com._520it_01;

//��ʾ�����������о�̬�ĳ�Ա
import static java.lang.Math.E;
import static java.util.Arrays.sort;//��̬���뵼����Ǿ�̬�ĳ�Ա
//��̬���벻��ʹ����Object����ͬ���ķ���

public class StaticImport {
	public static void main(String[] args) {
//		Date d = new Date();//Ĭ��ȥjava.lang������,�������java.util��  �϶�����
		
		//ʹ�ò���java.lang���е���,ʹ�����ȫ�޶���
		/*java.util.Date d1 = new java.util.Date();
		java.util.Date d2 = new java.util.Date();
		java.util.Date d3 = new java.util.Date();
		java.util.Date d4 = new java.util.Date();
		java.util.Date d5 = new java.util.Date();*/
		
//		Date d = new Date();
		
		sort(new int[]{1,2,3,4});
		
		System.out.println(Math.PI);
		System.out.println(E);
	}

}
