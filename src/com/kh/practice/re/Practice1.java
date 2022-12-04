package com.kh.practice.re;

import java.util.Scanner;

public class Practice1 {

	public static void main(String [] args) {
		
//		Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
//
//		ex.
//		���� : -9
//		����� �ƴϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("����� �ƴϴ�");
		}
		else {
			System.out.println("�����.");
		}
		
	}
}
