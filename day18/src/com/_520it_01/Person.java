package com._520it_01;

public class Person implements Comparable {
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

	@Override
	public int compareTo(Object o) {
		//o表示的是传入的比较对象
		Person p = (Person) o;
		System.out.println(this +":" + o);
		if (this.id > p.id) {
			return 1;
		} else if (this.id < p.id) {
			return -1;
		} else {
			return 0; 
		}
		
	}
}
