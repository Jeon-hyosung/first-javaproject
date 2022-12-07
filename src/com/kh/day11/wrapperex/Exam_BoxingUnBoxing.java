package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {

	public static void main(String [] args) {
		Integer num = Integer.valueOf(1);
		// Boxing (자동 박싱, Integer.valueOF를 자동으로 해줌)
		Integer su = 100;
		
		int soo = num.intValue();
		// UnBoxing(자동 언박싱)
		soo = num;
		
		int n = 10;
		Integer intObject = n; // boxing
		System.out.println("intObject : " + intObject);
		
		int m = intObject + 10; //unboxing
		// int m = intObject(Integer -> int) + int;
		System.out.println("m = " + m);
	}
}
