package com._520it_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//����Map����
public class MapDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("10", "��ʥ");
		map.put("11", "��Ӱ�̿�");
		map.put("6", "����");
		map.put("3", "������");
		/// ���Ǵ�����
		System.out.println(map); // {11=��Ӱ�̿�, 3=������, 6=����, 10=��ʥ}

		work2(map);
	}

	private static void work2(Map map) {
		//ʹ��Map.Entry�ķ�ʽ����Map����
		Set entrys = map.entrySet();
		/// �����ӡ������������
		System.out.println(entrys); //[11=��Ӱ�̿�, 3=������, 6=����, 10=��ʥ]
		for (Object obj : entrys) {
			//class java.util.HashMap$Node
//			System.out.println(obj.getClass());
			//����ͨ����Դ��Node��ʵ����Map.Entry�ӿ�
			Map.Entry entry = (Map.Entry) obj;
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

	private static void work1(Map map) {
		//ͨ��key����ȡvalue
//		��ȡ���е�key
		Set keys = map.keySet();
		for (Object obj : keys) {
			//ͨ��get������ȡvalue
			Object val = map.get(obj);
			System.out.println(obj + " = " + val);
		}
	}
}
