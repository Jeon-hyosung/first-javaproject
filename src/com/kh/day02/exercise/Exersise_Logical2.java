package com.kh.day02.exercise;

import java.util.Scanner;

public class Exersise_Logical2 {

	public static void main(String [] args) {
		
		// �Է¹��� ���ڰ� �빮������ �ҹ������� Ȯ���ϼ���!
		// ��, �Է¹��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���.
		// ���� �빮�� Ȯ�� : true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : " );
		char word = sc.next().charAt(0);
		
		boolean result = (65 <= word) && (word <= 90);
		System.out.println("���� �빮�� Ȯ�� : " + result);
		
	}
}
