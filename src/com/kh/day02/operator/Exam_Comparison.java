package com.kh.day02.operator;

public class Exam_Comparison {

	public static void main(String [] args) {
		
		System.out.println("�񱳿����� ����");
		// 1 < 2, 3 < 2, 1 == 2, 1 != 1
		// true, false, false, false
		// �񱳿����� : �� ���� ���ϴ� ������, ���迬����
		// �񱳿����ڴ� ������ �����ϸ� true, �ƴϸ� false�� ��ȯ��.
		// �ڷ��� ������ ���Կ����� ������;
		
		int num1 = 50;
		int num2 = 30;
		boolean result = (num1 < num2);
		System.out.println("(num1 < num2)�� ��� : " + result);
		result = (num1 > num2);
		System.out.println("(num1 > num2)�� ��� : " + result);
		result = (num1 == num2);
		System.out.println("(num1 == num2)�� ��� : " + result);
		result = (num1 != num2);
		System.out.println("(num1 != num2)�� ��� : " + result);

		// ¦Ȧ �Ǻ� ���α׷�
		// ¦���� �����ΰ�?
		
		
		
		int num5 = 2;
		boolean result1 = (num5 % 2 == 0);
		System.out.println("¦���Դϱ�? : " + result1);
		
		
		int num3 = 9;
		if(num3 % 2 == 0) {
			System.out.println("¦�� �Դϴ�.");
		}
		else {
			System.out.println("¦���� �ƴմϴ�.");
		}
	
	
	
	}
}