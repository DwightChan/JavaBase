package com._520it_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//迭代Map集合
public class MapDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("10", "剑圣");
		map.put("11", "幻影刺客");
		map.put("6", "谜团");
		map.put("3", "撼地者");
		/// 这是大括号
		System.out.println(map); // {11=幻影刺客, 3=撼地者, 6=谜团, 10=剑圣}

		work2(map);
	}

	private static void work2(Map map) {
		//使用Map.Entry的方式迭代Map集合
		Set entrys = map.entrySet();
		/// 这个打印出来是中括号
		System.out.println(entrys); //[11=幻影刺客, 3=撼地者, 6=谜团, 10=剑圣]
		for (Object obj : entrys) {
			//class java.util.HashMap$Node
//			System.out.println(obj.getClass());
			//我们通过看源码Node是实现了Map.Entry接口
			Map.Entry entry = (Map.Entry) obj;
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

	private static void work1(Map map) {
		//通过key来获取value
//		获取所有的key
		Set keys = map.keySet();
		for (Object obj : keys) {
			//通过get方法获取value
			Object val = map.get(obj);
			System.out.println(obj + " = " + val);
		}
	}
}
