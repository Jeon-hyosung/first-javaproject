package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While4 {

	public static void main(String [] args) {

		// while���� �̿��Ͽ� ������ ������ �Է� �ް� ����� ����϶�.
		// -1�� �ԷµǸ� �Է��� �����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int count = 0;
		int sum = 0;
		double avr = 0;
		
		while(true) {
			System.out.print("������ �Է� : ");
			input = sc.nextInt();
			count++;
			if(input == -1) break;
			sum += input;
			avr = sum / count;
		}
		System.out.println("�Է¹��� ������ ����� = " + avr);
		
	}
}
