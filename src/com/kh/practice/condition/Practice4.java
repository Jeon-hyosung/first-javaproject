package com.kh.practice.condition;

import java.util.Scanner;

public class Practice4 {

	public static void main(String [] args) {
		
//		3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
//
//		ex.
//		입력1 : 5
//		입력2 : -8
//		입력3 : 5
//		false
	
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int input1 = sc.nextInt();
		System.out.print("입력2 : ");
		int input2 = sc.nextInt();
		System.out.print("입력3 : ");
		int input3 = sc.nextInt();
		
		boolean result;
		
		result = (input1 == input2) && (input2 == input3);
		
		System.out.println(result);
		
		
		
	}
}
