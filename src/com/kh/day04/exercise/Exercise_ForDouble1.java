package com.kh.day04.exercise;

public class Exercise_ForDouble1 {

	public static void main(String [] args) {
		// 2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오.
		
		for(int j = 1; j < 10; j++) {
			for(int i = 2; i < 6; i++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				//if(j == 5) System.out.println();
			}
			System.out.println();
			
		}
		
	}
}
