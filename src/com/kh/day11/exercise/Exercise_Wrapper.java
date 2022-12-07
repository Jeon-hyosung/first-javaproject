package com.kh.day11.exercise;

public class Exercise_Wrapper {

	public void paserExam() {
		String strNum = "221123";
		String strNum2 = "230502";
		// 두 값을 계산해서 출력하시오
		// 결과 : 2018
		
		int intNum = Integer.parseInt("221123");
		int intNum2 = Integer.parseInt("230502");
		
		int result = intNum2 - intNum;
		System.out.println("결과 : " + result);
	}
	
	
	public void dataParsingExample() {
		String strData = "13";
		String strData2 = "23.502";
		String strData3 = "SPRING";
		// 1. strData를 byte, short, int, long으로 변환하시오.
		// 2. strData2를 float, double로 변환하시오.
		// 3. strData3을 char로 변환하시오.
		
		byte byteData = Byte.parseByte("13");
		short shortData = Short.parseShort("13");
		int numData = Integer.parseInt("13");
		long longData = Long.parseLong("13");
		
		float floatData = Float.parseFloat("13");
		double doubleData = Double.parseDouble("13");
		
		char charData = strData3.charAt(0);
		
	}
}
