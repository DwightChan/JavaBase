package com._520it_01;

public class EnumDemo {
	public static void main(String[] args) {
		/*Person p1 = new Person("����", Gender.MAN);
		//ʵ����ͨ�����仹�Ǵ������˲�������ڵĶ���
		System.out.println(p1);*/
		
		//switch���ֻ֧��byte/char/short/int
		Gender man = Gender.MAN;
		switch (man) {
			case MAN:
				System.out.println("...man...");
				break;
			case WOMAN:
				System.out.println("...woman...");
				break;
			default:
		}
		
	}
}

//jdk1.5���ֽ���ö�ٵ����Ͷž��ⲿ�����������
enum Gender {
	//��һ�б���дö��ֵ
	MAN('��'),WOMAN('Ů');
	
	private char gender;
	//���幹�췽��
	private Gender(char gender) {
		this.gender = gender;
	}
}

/*class Gender {
	public static final Gender MAN = new Gender('��');
	public static final Gender WOMAN = new Gender('Ů');
	
	private char gender;

	private Gender(char gender) {
		this.gender = gender;
	}

	public char getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		return String.valueOf(gender);
	}
}*/

class Person {
	public static final char MAN = '��';
	public static final char WOMAN = 'Ů';
	
	private String name;
	private Gender gender;
	
	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Person(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
}
