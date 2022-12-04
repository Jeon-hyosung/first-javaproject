package com.kh.practice.re;

import java.util.Scanner;

public class Practice5 {

	public static void main(String [] args) {
		
//		A, B, C ����� ������ �Է� �ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ� 
//		�μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� ��3000 �̻�, �̸��̸� ��3000 �̸����� ����ϼ���. 
//		(A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)
//
//		ex.
//		A����� ���� : 2500
//		B����� ���� : 2900
//		C����� ���� : 2600
//		A��� ����/����+a : 2500/3500.0
//		3000 �̻�
//		B��� ����/����+a : 2900/2900.0
//		3000 �̸�
//		C��� ����/����+a : 2600/2989.9999999999995
//		3000 �̸�
		
		
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int num1 = sc.nextInt();
		System.out.print("B����� ���� : ");
		int num2 = sc.nextInt();
		System.out.print("C����� ���� : ");
		int num3 = sc.nextInt();
		
		double sum1 = num1 + (num1 * 0.4);
		double sum2 = num2 + (num2 * 0);
		double sum3 = num3 + (num3 * 0.15);
		
		System.out.println("A����� ����/����+a : " + num1 + "/" + sum1);
		
		if(sum1 < 3000) {
			System.out.println("3000 �̸�");
		}
		else {
			System.out.println("3000 �̻�");
		}
		
		System.out.println("B����� ����/����+a : " + num2 + "/" + sum2);
		if(sum2 < 3000) {
			System.out.println("3000 �̸�");
		}
		else {
			System.out.println("3000 �̻�");
		}
		
		System.out.println("C����� ����/����+a : " + num3 + "/" + String.format("%.6f", sum3));
		if(sum3 < 3000) {
			System.out.println("3000 �̸�");
		}
		else {
			System.out.println("3000 �̻�");
		}
		
		
		
		
	}
}
