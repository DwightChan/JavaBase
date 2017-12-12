package com._520it_day6;

public class OOP {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "王大锤";
		p.age = 30;
		
		p.eat();
		System.out.println(p);
		p.up();
		System.out.println("lv:" + Person.lv);
		
		int i = 0;
		if (true) {
			int j;//没有默认值,没有开辟内存空间
		}
		
		Person pp = new Person("唐马儒", 33);
		System.out.println(pp);
		
		System.out.println("lv:" + Person.lv);
	}
}

class Person {
	//类卸载静态是成变量结束
	static int lv;//文明等级  被该类所有的对象所共享   
	
	//状态  使用成员变量
	//对象被GC
	String name;  //有姓名状态
	int age;      //描述年龄
	
	//不写有个默认的   无参空方法体   Person(){}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		this(null,0);
	}

	//行为  使用方法
	public void eat() {
		System.out.println("...eat...");
	}

	public void up() {
		lv++;
	}
	
	@Override //alt + s
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
