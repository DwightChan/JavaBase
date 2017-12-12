package com._520it_01;

public class ThrowDemo {
	public static void main(String[] args) {
		/*//Error  Exception
//		main(null);
		int[] arr = null;
		arr[0] = 0;*/
		
		Throwable t = new Throwable("有病");
		System.out.println(t.getMessage());//简单原因
		t.printStackTrace();
	}
}
