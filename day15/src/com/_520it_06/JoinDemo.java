package com._520it_06;

public class JoinDemo {
	public static void main(String[] args) throws Exception {
		//����
		//1.���
		System.out.println("���");
		//2.ϴ��
		System.out.println("ϴ��");
		//3.�¹�
		System.out.println("�¹�");
		//4.��ζ
		System.out.println("��ζû����"); 
//		ģ��ж��������
		Thread son = new Thread() {
			public void run() {
				System.out.println("��¥");
				System.out.println("�ҵ�");
				System.out.println("ѡ��");
				System.out.println("��Ǯ");
				System.out.println("����");
			};
		};
		son.start();//�����ǿ����̺߳��ٵ���join����
		
		son.join();//�������߳�,�ȴ����߳�ִ�����,��ִ�����߳�
		
		System.out.println("��������");
		//5.�Է�
		System.out.println("�Է�");
	}
}
