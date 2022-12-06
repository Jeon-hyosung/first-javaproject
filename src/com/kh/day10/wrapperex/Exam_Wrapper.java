package com.kh.day10.wrapperex;

public class Exam_Wrapper {
	public static void main(String [] args) {
		// Wrapper 객체로부터 기본 타입 값 알아내기
//		The constructor Integer(int) is deprecated since version 9
		Integer i = Integer.valueOf(1123); // <-- 클래스 / 기울어짐 == static
		// 객체를 만들어서 사용하다가
		int e = i.intValue();
		// 기본형으로 변환가능
		Integer f = null;
//		Type mismatch: cannot convert from null to int
		// int m = null; // int에 null값 못넣음
		
		Character c = Character.valueOf('c');
		char che = c.charValue(); // 기본형
		
		Double d = Double.valueOf(3.14);
		double dd = d.doubleValue(); // 기본형
		
		// 문자열을 기본 데이터 타입(int, boolean, double)
		// 으로 변환
//		Type mismatch: cannot convert from String to int
		int num = Integer.parseInt("123");
		int result = num + 1;
		System.out.println("변환된 값 : " + num);
		boolean isYn = Boolean.parseBoolean("True");
		double fNum = Double.parseDouble("3.14");
		
		// 기본 데이터 타입(int, double, char)을
		// 문자열로 변환
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123); // 16진수 7b로 변환
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);
		
	}
}






















