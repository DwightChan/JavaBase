package com._520it_01;

public class VarArgs {
	public static void main(String[] args) {
//		getSum(new int[] {1,2,3,4,5});
		getSum("",1,2,3,4,5);
	}
	
	//jdk 1.5 ֮��ɱ����  ����������ʹ��,�����[]����...  ��ʾ���ǿɱ����  ���ø��߱������Ѵ���Ĳ������������
	// �ɱ�������ֻ����һ��, ���ұ���λ�ڲ����б�����λ��
	public static void getSum(String name, int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	
	//����:Ҫ�����һ�����ֵĺ�
	/*public static void getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}*/
}
