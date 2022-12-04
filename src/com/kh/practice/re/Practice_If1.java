package com.kh.practice.re;

import java.util.Scanner;

public class Practice_If1 {

	public static void main(String [] args) {
		
		//�����Ǻ�1
		/* Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, 
		   ����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 
		   0�� �ƴϸ� �������١��� ����ϼ���.

		ex.
		���� : -9
		������ */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = "";
		
		if(num == 0) {
			result = "0�̴�.";
		}
		else if(num > 0) {
			result = "�����.";
		}
		else {
			result = "������.";
		}
		
		System.out.println(result);
		
	}
}
