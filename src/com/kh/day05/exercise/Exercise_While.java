package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {

	public void exercise1() {
		
		int i = 0;
		int sum = 0;
		while(i < 100) {
			if(i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
		
	}

	
	
	
	
	
	
	
	public void exercise2() {
			
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;
			
		while(true) {
			System.out.print("정수 하나 입력 : ");
			input = sc.nextInt();
			if(input == -1) break;
			sum += input;
		}
		System.out.println("입력하신 수의 합은 : " + sum);
		
	}
	
	public void exercise3() {
				
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int count = 0;
		int sum = 0;
		double avr = 0;
		
		while(true) {
			System.out.print("정수값 입력 : ");
			input = sc.nextInt();
			count++;
			if(input == -1) break;
			sum += input;
			avr = sum / count;
		}
		System.out.println("입력받은 정수의 평균은 = " + avr);
		
	}
	

	
	




}
