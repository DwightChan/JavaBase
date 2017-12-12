package com._520it_01;

public class KonGe {
	public static void main(String[] args) {
		String st = "a b c ÄãºÃ";
		for (int i = 0; i < st.length(); i++) {
			char c = st.charAt(i);
			System.out.println(c);
			if(c == ' '){
				System.out.println("123");
			}
		}
	}
}
