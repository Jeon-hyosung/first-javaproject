package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ForDouble3 {

	public static void main(String [] args) {
//			*
//			**
//			***
//			****
//			*****
//			******
//			*******
//			********
//			*********
//			**********

		//삼각형
//		int num = 1;
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < num; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			num++;
//		}

		//역삼각형
//		int num = 1;
//		for(int i = 0; i < 10; i++) {
//			for(int j = 10; j > num; j --) {
//				System.out.print("*");
//			}
//			System.out.println();
//			num++;
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		int num = 10;
		for(int i = 10; i < input; i--);
			for(int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
			num++;
		
		
	}
}
