package com._520it_02;

public class FianllyDemo {
	public static void main(String[] args) {
		int i = todo2();
		System.out.println(i);
//		InputStream is = new FileInputStream("d:/1.txt");
//		is.read();
//		is.read();
//		is.close();
	}

	private static int todo2() {
		int i = 0;
		try {
			System.out.println("����ʼ,������Դ");
			System.exit(0);
			return i;
		} finally {
			i++;
			System.out.println("�������,�ͷ���Դ");
		}
	}
	
	private static void todo1() {
		try {
			System.out.println("����ʼ,������Դ");
			System.out.println("......");
			//����
			work1("12");
			System.out.println("......");
//			System.out.println("�������,�ͷ���Դ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			System.out.println("�������,�ͷ���Դ");
		} finally {//�����ͷ���Դ  finally���ص��������Ƿ����쳣����ִ�еĴ����
			System.out.println("�������,�ͷ���Դ");
		}
	}

	private static void work1(String s) {
		Integer.parseInt(s);
	}
}
