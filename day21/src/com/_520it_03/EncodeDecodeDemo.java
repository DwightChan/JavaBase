package com._520it_03;

import java.util.Arrays;

public class EncodeDecodeDemo {
	public static void main(String[] args) throws Exception {
		//С�ձ��л,Ҫ���Լ�
		String data = "С�ձ��л,Ҫ���Լ�";
		//����
//[-48, -95, -56, -43, -79, -66, -45, -48, -69, -18, -74, -81, 44, -46, -86, -56, -43, -41, -44, -68, -70]
//		byte[] bs = data.getBytes();//ʹ��ϵͳĬ�������б���  ϵͳĬ����GBK,1������2���ֽ�
		byte[] bs = data.getBytes("UTF-8");//ָ�����������  UTF-8��һ������3���ֽ�
		System.out.println("len:" + bs.length);//21
		System.out.println("�����:" + Arrays.toString(bs));
		
		//����
//		System.out.println("�����:" + new String(bs));
//		System.out.println("�����:" + new String(bs, "GBK"));//����ͽ��벻һ�¾ͻ��������
		System.out.println("�����:" + new String(bs, "UTF-8"));
	}
}
