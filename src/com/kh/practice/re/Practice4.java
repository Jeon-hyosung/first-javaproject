package com.kh.practice.re;

import java.util.Scanner;

public class Practice4 {

	public static void main(String [] args) {
		
//		3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
//
//		ex.
//		�Է�1 : 5
//		�Է�2 : -8
//		�Է�3 : 5
//		false
	
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�1 : ");
		int input1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int input2 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int input3 = sc.nextInt();
		
		boolean result;
		
		result = (input1 == input2) && (input2 == input3);
		
		System.out.println(result);
		
		
		
	}
}
