package com._520it_01;

public class EnumDemo {
	public static void main(String[] args) {
		/*Person p1 = new Person("王大锤", Gender.MAN);
		//实际上通过反射还是创建出了不允许存在的对象
		System.out.println(p1);*/
		
		//switch语句只支持byte/char/short/int
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

//jdk1.5出现叫做枚举的类型杜绝外部创建多余对象
enum Gender {
	//第一行必须写枚举值
	MAN('男'),WOMAN('女');
	
	private char gender;
	//定义构造方法
	private Gender(char gender) {
		this.gender = gender;
	}
}

/*class Gender {
	public static final Gender MAN = new Gender('男');
	public static final Gender WOMAN = new Gender('女');
	
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
	public static final char MAN = '男';
	public static final char WOMAN = '女';
	
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
