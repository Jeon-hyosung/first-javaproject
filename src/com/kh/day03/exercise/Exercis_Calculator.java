package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercis_Calculator {

	public static void main(String [] args) {
		// �� ���� ������ �Է¹ް� �����ڸ� �Է¹޾Ƽ�
		// ����ϴ� ���� ���α׷��� �ۼ��ϼ���!!
		// ������ �Է����ּ��� : 11
		// ������ �ѹ��� �Է����ּ��� : 22
		// �����ڸ� �Է����ּ���(+,-,*,/,%) : %
		// ��� : 11 % 22 = 11
		
		// 1. �����ϳ� �Է�
		// 2. �����ϳ��� �Է� ����
		// 3. ������ �Է� ����
		// 4. ������ �Ǻ� �� ���� ���� �� ��� ����
		// 5. ��� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int num1 = sc.nextInt();
		System.out.print("������ �ѹ��� �Է����ּ��� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է����ּ���(+,-,*,/,%) : ");
		char oper = sc.next().charAt(0);
		
		int result = 0;
		
		if(oper == '+') {
			result = num1 + num2;
		}
		else if(oper == '-') {
			result = num1 - num2;
		}
		else if(oper == '*') {
			result = num1 * num2;
		}
		else if(oper == '/') {
			result = num1 / num2;
		}
		else if(oper == '%') {
			result = num1 % num2;
		}
		else {
			System.out.println("���Է�");
		}
		
		System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
		
		
		
			
		}

		
	}