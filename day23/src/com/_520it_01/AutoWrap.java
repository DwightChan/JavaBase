package com._520it_01;

public class AutoWrap {
	public static void main(String[] args) {
		int a = 10;//��������
		Integer i = Integer.valueOf(a);//ʹ�ð�װ��ķ���,�Ի������Ͱ�װ
		
		i = 10;//Ϊʲô?Integer��һ����,�洢�����ڴ��ַ,���ڻ������͵�ֵ�����ڴ�ĵ�ַ
		//�Զ�װ��   �����ǵĻ������͵�ֱֵ�Ӹ�����Ӧ�İ�װ��,�Զ����ð�װ���ϵ�valueOf��������װ
		
		//�Զ�����
		a = i;//�ȼ���  a = i.intValue();
	}
}
