package com.kh.day11.javaapi;

public class Exam_String {

	public static void main(String [] args) {
		String msg = "Hello Java";
		msg = new String("Hello J");
		
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		
		System.out.println(data1 + "의 길이는 " + data1.length());
		System.out.println(data2 + "의 길이는 " + data2.length());
		System.out.println("#이 있는가? : " + data1.contains("#"));
		
		// 문자열 연결
		data1 = data1.concat(data2); // C#,C++
		System.out.println("연결된 문자열 : " + data1);
		
		// 공백제거
		data1 = data1.trim();
		System.out.println("공백 제거 확인 : " + data1);
		
		// C# -> JAVA
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 : " + data1);
		
		// 문자열 분리
		String [] words = data1.split(",");
		for(int i = 0; i < words.length; i++) {
			System.out.println("분리된 문자열 : " + i  + " " + words[i]);
		}
		
		// 문자열 자르기
		//data1 = data1.substring(5);
		//System.out.println("문자열 자르기 : " + data1);
		data1 = data1.substring(1, 4); // 첫번째 포함 두번째 포함x
		System.out.println("범위로 자르기 : " + data1);
		
		char word = data1.charAt(1);
		System.out.println("문자자르기 : " + word);
	}
}
