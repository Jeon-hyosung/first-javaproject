package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For {
	
	public void exercise1() {
		
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum = i + sum;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	
	}

	public void exercise2() {
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.print(i);
			if(i <= 9) {
				System.out.print("+");
			}
			else {
				System.out.print("=");
			}
		}
		System.out.println(sum);
	
	}
	
	
	
	public void exercise3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 입력 : ");
		int dan = sc.nextInt();
		
		int result = 0;
		
		for(int i = 1; i < 10; i++) {
			result = dan * i;
			System.out.println(dan + " * " + i + " = " +result);
		}

	}
	
	public void exercise4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9사이의 정수 하나 입력 : ");
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
