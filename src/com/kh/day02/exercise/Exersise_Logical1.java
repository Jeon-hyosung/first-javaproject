package com.kh.day02.exercise;

import java.util.Scanner;

public class Exersise_Logical1 {

	public static void main(String [] args) {
		// �Է��� ������ 1 ~ 100 ������ �������� Ȯ���ϼ���!
		// ��, �Է¹��� ���ڴ� ���� num�� �ʱ�ȭ���ּ���
		// 1���� 100������ �����ΰ�? : true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		boolean result = (1 < num) && (num < 100);
		System.out.println("1���� 100������ �����ΰ�? : " + result);
	}
}