package com._520it_day2;

//����
public class VarDemo {
//	��Ա����
	int i;//Ĭ��ֵ��0
	
	public static void main(String[] args) {
		/*//��������Ĺ���     ����  ������
		int num; //�ֲ�����û�г�ʼ��,ʵ������û�з����ڴ�ռ��
		//�ֲ�������ʹ��ǰ�����ȸ�ֵ
		num = 10;
		System.out.println(num);
		
		//�������͵����ֵ/��Сֵȥ��װ���Ҿ�̬����
		//double�����ֵ
		System.out.println(Double.MAX_VALUE);
		
		//������/�˽���/ʮ������
		System.out.println(0b11);//��ʾ��������  0b��ͷ
		System.out.println(010);//��ʾ�˽�����  0��ͷ
		System.out.println(0x10);//��ʾʮ��������  0x��ͷ
		
		//����ת���� ,Ϊʲôboolean���Ͳ��ܲ���     ��Ϊ������ֵ
		int a = 10;
		byte num2 = 10;//�жϳ����Ƿ��ڴ˱����ķ�Χ,����ʽת��
		num2 = (byte)a;//��תС   ->  ǿת
		
		a = num2;  //Сת��  --> �Զ�ת��
		
		double num1 = 10;
		byte num2 = 10;
		int num3 = 10;
		short num4 = 10;
		
		int res = num2 + num4;
		float f = res + 1.0F;
		double num5 = num1 + num4;
		//1.����int����תΪint.   2.�Ա��ʽ����ߵ����;��ǽ��������
		 
		int i = 1;
		int z = i--;//��++��ʾʽ��ֵ����i��ԭֵ
		i = z;//i = i
		System.out.println(i);
		
		int i = 10;
		i += i++;
		System.out.println(i);
		
		int i = 0;//-1 < i < 10
		System.out.println(-1 < i && i < 10);
		//&& || �Ǵ��ж�·����,Ч�ʸ�Щ*/
		
		//λ����   ~ & | ^ <<  >>  >>>
		int num1 = 0b0000_0000_0000_0000_0000_0000_0000_0101; //5
		int num2 = 0b1000_0000_0000_0000_0000_0000_0000_0010; //2
		System.out.println(num1 & num2);//0
		System.out.println(num1 | num2);//7
		System.out.println(num1 ^ num2);//
		System.out.println(~num2);//-3
		
		System.out.println(num1 << 34);//
		System.out.println(num1 >> 2);//
		//0b0100_0000_0000_0000_0000_0000_0000_0001;
		System.out.println(num2 >>> 1);//
 	}
}
