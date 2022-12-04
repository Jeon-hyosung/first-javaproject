package com.kh.practice.re;

import java.util.Scanner;

public class Practice6 {

	public static void main(String [] args) {
		
//		����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
//
//		ex.
//		����ϰ� ���� �ܼ� �Է� : 4
//		===== 4�� =====
//		4 * 1 = 4
//		4 * 2 = 8
//		4 * 3 = 12
//		4 * 4 = 16
//		4 * 5 = 20
//		4 * 6 = 24
//		4 * 7 = 28
//		4 * 8 = 32
//		4 * 9 = 36		
		
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("����ϰ� ���� �ܼ� �Է� : ");
		int dan = sc.nextInt();
		
		System.out.println("==== " + dan + "��" + " ====");
		
		int result = 0;
		
		for(int i = 1; i < 10; i++) {
			result = dan * i;
			System.out.println(dan + " * " + i + " = " + result);
		}
		
	}
}
