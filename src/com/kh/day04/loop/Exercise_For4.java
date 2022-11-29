package com.kh.day04.loop;

import java.util.Scanner;

public class Exercise_For4 {

	public static void main(String [] args) {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9 사의 양수를 입력하여야 합니다."를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		if((num >= 1) && (num <= 9)) {
			int i = 1;
			while(i <= 9) {
				System.out.println(num + " * " + i + " = " + (num * i));
				i++;
			}
		}
		else {
			System.out.println("1 ~ 9 사이의 양수를 입력하여야 합니다.");
		}
	}
}
