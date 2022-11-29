package com.kh.day04.loop;

import java.util.Scanner;

public class Exercise_For3 {

	public static void main(String [] args) {
		// ������ ����ϱ�!
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ...
		// 2 * 9 = 18
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 입력 : ");
		int dan = sc.nextInt();
		
		int result = 0;
		
		for(int i = 1; i < 10; i++) {
			result = dan * i;
			System.out.println(dan + " * " + i + " = " +result);
		}
		
	}
}
