package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Claculator {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
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
			result = num1;
		}
		System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
		
	}
}
