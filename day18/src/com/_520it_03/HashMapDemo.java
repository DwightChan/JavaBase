package com._520it_03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		//创建对象
		Map map = new HashMap();
		
		//添加元素     map表示的是映射,key-value
		map.put("10", "剑圣");
		map.put("11", "幻影刺客");
		map.put("6", "谜团");
		map.put("3", "撼地者");
		
		System.out.println(map.size());
		System.out.println(map);//{key=value}形式
		
//		通过key获取value
//		System.out.println(map.get("61"));//如果key没有映射value返回null
		
		//通过key删除映射关系
		map.remove("10");
		System.out.println(map.size());
		System.out.println(map);//{key=value}形式
		
		map.put("3", "虚空假面");//如果key存在就替换
		System.out.println(map.size());//3
		System.out.println(map);//{key=value}形式
		
		//调用keySet方法获取所有key的集合Set
		Set set = map.keySet();
		System.out.println(set);
		
		//获取所有值的集合  values
		Collection values = map.values();
		System.out.println(values);
		
//		for (Object o : map) {
//			
//			
//		}
	}
}
