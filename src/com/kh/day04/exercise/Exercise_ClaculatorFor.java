package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ClaculatorFor {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0; // Ƚ�� ī��Ʈ
		for(;;) {
			
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			System.out.print("�����ڸ� �Է��ϼ��� : ");
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
			count++; // ��¿� �������� �� ī��Ʈ ��!
			if(count == 3) break;
		}
		
		
	}
}
