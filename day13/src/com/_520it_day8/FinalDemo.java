package com._520it_day8;

//��ʾfinal
public class FinalDemo {

}

class Fu { //final���ε��಻�ܱ��̳�
	public final void work() {} //���η�����ʾ�÷������ܱ�������д
}

class Zi extends Fu {
	final int I = 10;//���α�����ʾ����,ֵ���ܱ��޸�
	
	public void work1() {
//		i = 0;
		final int i = 0;  //final��Ψһ�������ξֲ����������η�
	}
}
