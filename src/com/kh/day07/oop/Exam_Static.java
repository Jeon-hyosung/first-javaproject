package com.kh.day07.oop;

class StaticSample{
	public int num;
	public void sampleMethod() {
		input = 20;
	}
	public void goodMethod() {
		input = 30;
	}
	
	public static int input;
	public static void originMethod() {
		input = 5;
	}
}

public class Exam_Static {

	public static void main(String [] args) {
		//new StaticSample().num = 10;
		StaticSample.input = 10;
		
		StaticSample s1;
		s1 = new StaticSample();
		System.out.println(s1.input); // non-static이라서 new
		StaticSample.originMethod();
		System.out.println(s1.input); // static이라서 바로 사용가능
		
		int value = Math.abs(-5); // 절대값구하기
		System.out.println("값 : " + value);
	}
}
