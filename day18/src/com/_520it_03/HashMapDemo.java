package com._520it_03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		//��������
		Map map = new HashMap();
		
		//���Ԫ��     map��ʾ����ӳ��,key-value
		map.put("10", "��ʥ");
		map.put("11", "��Ӱ�̿�");
		map.put("6", "����");
		map.put("3", "������");
		
		System.out.println(map.size());
		System.out.println(map);//{key=value}��ʽ
		
//		ͨ��key��ȡvalue
//		System.out.println(map.get("61"));//���keyû��ӳ��value����null
		
		//ͨ��keyɾ��ӳ���ϵ
		map.remove("10");
		System.out.println(map.size());
		System.out.println(map);//{key=value}��ʽ
		
		map.put("3", "��ռ���");//���key���ھ��滻
		System.out.println(map.size());//3
		System.out.println(map);//{key=value}��ʽ
		
		//����keySet������ȡ����key�ļ���Set
		Set set = map.keySet();
		System.out.println(set);
		
		//��ȡ����ֵ�ļ���  values
		Collection values = map.values();
		System.out.println(values);
		
//		for (Object o : map) {
//			
//			
//		}
	}
}
