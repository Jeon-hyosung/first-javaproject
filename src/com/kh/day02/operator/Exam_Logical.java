package com.kh.day02.operator;

public class Exam_Logical {

	public static void main(String [] args) {
		System.out.println("논리연산자 예제");
		// 남자이면서 평균평점이 4.3이상인 사람 -> AND (&&)
		// 컴퓨터공학과 또는 경영학과인 사람 -> OR (||)
		
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4; // 변수의 선언
//		// num1 과 num2가 다르면서 num2가 num1보다 클때
//		result1 = (num1 != num2) && (num1 < num2);
//		System.out.println("resutl1의 값 : " + result1);
//		result2 = (num1 < num2) || (num1 == num2);
//		// false
//		result3 = (num1 > num2) && (num1 != num2);
//		// true
//		result4 = (num1 > num2) || (num1 == num2);
//		// true
//		System.out.println("resutl2의 값 : " + result2);
//		System.out.println("resutl3의 값 : " + result3);
//		System.out.println("resutl4의 값 : " + result4);
		
		System.out.println("논리연산자 예제2");
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
		System.out.println("resutl1의 결과값 : " + result1);
		System.out.println("resutl2의 결과값 : " + result2);
		System.out.println("resutl3의 결과값 : " + result3);
		System.out.println("resutl4의 결과값 : " + result4);
		System.out.println("aNum의 값 : " + aNum + ", " + "bNum의 값 : " + bNum);
		
		
		
	}
}
