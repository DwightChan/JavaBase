package com._520it_day3;

public class ForInForDemo {
	public static void main(String[] args) {
		// 外层循环 控制行 内层循环 控制列
		/*
		 *****
		 *****
		 ***** 
		 * 
		 * for (int i = 0; i < 3; i++) { for (int j = 0;j < 5; j++) {
		 * System.out.print("*"); } System.out.print('\n'); }
		 */
		for (int i = 1; i <= 9; i++) {
			// 1 * 1 = 1
			// 1 * 2 = 2 2 * 2 = 4
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.print('\n');
		}
	}
}
