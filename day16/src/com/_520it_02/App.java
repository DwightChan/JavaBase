package com._520it_02;

public class App {
	public static void main(String[] args) {
		//创建容器对象
		MyList list = new MyList();
		
		//1.安排队员上场    
		list.add(7);
		list.add(9521);
		list.add(9527);
		//查看队里有多少人
		System.out.println(list.size());//3
		System.out.println(list);
		
		//查看9521在哪个位置
		System.out.println(list.indexOf(9521));//1
		
		//查询某个位置上的人
		System.out.println(list.get(2));//9527
		System.out.println("--------------");
		//7元素挂了
		list.remove(0);
		//查看队里有多少人
		System.out.println(list.size());//3
		System.out.println(list);
		
		System.out.println("--------------");
		//替补一下
		list.set(0, 110);
		//查看队里有多少人
		System.out.println(list.size());//3
		System.out.println(list);
		
		System.out.println("--------------");
		list.add(888);
		list.add(999);
		list.add(666);
		list.add(333);
		//查看队里有多少人
		System.out.println(list.size());//3
		System.out.println(list);
	}
}
