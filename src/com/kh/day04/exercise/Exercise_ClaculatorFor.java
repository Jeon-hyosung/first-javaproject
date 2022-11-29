package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ClaculatorFor {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0; // 횟수 카운트
		for(;;) {
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자를 입력하세요 : ");
			char oper = sc.next().charAt(0);
			
			int result = 0;
			
			switch(oper) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
			}
			System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
			count++; // 출력에 성공했을 때 카운트 업!
			if(count == 3) break;
		}
		
		
	}
}
