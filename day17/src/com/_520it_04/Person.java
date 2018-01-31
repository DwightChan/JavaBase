package com._520it_04;

public class Person {
	private int id;
	private String name;
	
	public Person() {
		super();
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	// 重写 hashcode 方法的同时 一定要重写 equals 方法
	//重写hashCode方法
	@Override
	public int hashCode() {
		System.out.println("调用了哈希码方法");
		return 31 * id;
	}
	
	//重写equals方法
	@Override
	public boolean equals(Object obj) {
		System.out.println("...equals...");
		Person p = (Person) obj;
		return p.id == this.id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
