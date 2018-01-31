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
	// ��д hashcode ������ͬʱ һ��Ҫ��д equals ����
	//��дhashCode����
	@Override
	public int hashCode() {
		System.out.println("�����˹�ϣ�뷽��");
		return 31 * id;
	}
	
	//��дequals����
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
