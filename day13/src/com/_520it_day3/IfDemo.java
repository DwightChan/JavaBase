package com._520it_day3;

//if-switch
public class IfDemo {
	public static void main(String[] args) {
		//if if-else if-[else if]*-[else]
		boolean flag = false;
		/*if (flag) { //trueִ�д����  //false��ִ��
			System.out.println("true");
		}
		
		if (flag) {  //true
			System.out.println("true");
		} else { //false
			System.out.println("false");
		}
		
		//�������ѡ��1������
		if (flag) {//true
			System.out.println("����1");
		} else if (!flag) {//false �����ж�
			System.out.println("����2");
		} else {
			System.out.println("����n");
		}*/
//		long i = 3L;
		int i = 3;
		switch (i) {//û��long,ֻ��С�ڵ���int������
			case 1:
				System.out.println("����1");
				break;
			case 2:
				System.out.println("����2");
				break;
			case 3:
				System.out.println("����3");
				break;
			case 4:
				System.out.println("����4");
				break;
			default:
				break;
		}
	}
}
