package com._520it_day4;

public class MethodDemo {
	public static void main(String[] args) {
		
	}
	
	/*[���η�] ����ֵ���� ������([�β��б�]) {
		[return ֵ;]
		����ֵ���Ͳ���voidʱ,����ʹ��return ���ض�Ӧ���͵�һ��ֵ
		����ֵ���Ͳ���voidʱ,�������ִ�е���������return ֵ;
		}*/
	public static int work() {
		boolean flag = false;
		if (flag) {
			return 0;
		}
		return 0;//��֤��ֵ����
	}
	
	//����������   ��ͬһ��ͬ  ������ֵ�����޹�,�����������޹�
	public static void work(int i) {}
}
