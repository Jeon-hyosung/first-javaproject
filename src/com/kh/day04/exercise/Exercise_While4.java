package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While4 {

	public static void main(String [] args) {

		// while문을 이용하여 정수를 여러개 입력 받고 평균을 출력하라.
		// -1이 입력되면 입력을 종료한다.
		
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
