package com.kh.day02.operator;

public class Exam_Logical {

	public static void main(String [] args) {
		System.out.println("���������� ����");
		// �����̸鼭 ��������� 4.3�̻��� ��� -> AND (&&)
		// ��ǻ�Ͱ��а� �Ǵ� �濵�а��� ��� -> OR (||)
		
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4; // ������ ����
//		// num1 �� num2�� �ٸ��鼭 num2�� num1���� Ŭ��
//		result1 = (num1 != num2) && (num1 < num2);
//		System.out.println("resutl1�� �� : " + result1);
//		result2 = (num1 < num2) || (num1 == num2);
//		// false
//		result3 = (num1 > num2) && (num1 != num2);
//		// true
//		result4 = (num1 > num2) || (num1 == num2);
//		// true
//		System.out.println("resutl2�� �� : " + result2);
//		System.out.println("resutl3�� �� : " + result3);
//		System.out.println("resutl4�� �� : " + result4);
		
		System.out.println("���������� ����2");
		int aNum = 70;
		int bNum = 55;
		result1 = (aNum == bNum) || (aNum++ < 100);
		// aNum = 71, bNum = 55, true
		result2 = (aNum < bNum) && (--bNum < 55);
		// aNum = 71, bNum = 55, false
		result3 = (aNum != bNum) && (bNum-- < aNum++);
		// aNum = 72, bNum = 54, true
		result4 = (aNum++ != bNum) || (bNum++ >= 85);
		// aNum = 73, bNum = 54, true
		// aNum : 73, bNum : 54
		System.out.println("resutl1�� ����� : " + result1);
		System.out.println("resutl2�� ����� : " + result2);
		System.out.println("resutl3�� ����� : " + result3);
		System.out.println("resutl4�� ����� : " + result4);
		System.out.println("aNum�� �� : " + aNum + ", " + "bNum�� �� : " + bNum);
		
		
		
	}
}