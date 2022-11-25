package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If1 {

	public static void main(String [] args) {
		
		//정수판별1
		/* 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
		   양수가 아닌 경우 중에서 0이면 “0이다“, 
		   0이 아니면 “음수다”를 출력하세요.

		ex.
		정수 : -9
		음수다 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = "";
		
		if(num == 0) {
			result = "0이다.";
		}
		else if(num > 0) {
			result = "양수다.";
		}
		else {
			result = "음수다.";
		}
		
		System.out.println(result);
		
	}
}
