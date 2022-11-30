package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int korean = 0;
		int english = 0;
		int math = 0;
		int total = 0;
		double avg = 0;
		int count = 0;
		
		ESCAPE :
		while(true) {			
			System.out.println("====== 메인메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택: ");
			int input = sc.nextInt();
			
			switch(input) {
			case 1:
				System.out.println("====== 성적 입력 ======");
				System.out.print("국어 : ");
				korean = sc.nextInt();
				count++;
				System.out.print("영어 : ");
				english = sc.nextInt();
				count++;
				System.out.print("수학 : ");
				math = sc.nextInt();
				count++;
				total = (korean + english + math);
				avg = (total / count);
				break;
			case 2:
				System.out.println("====== 성적 출력 ======");
				System.out.println("국어 : " + korean);
				System.out.println("영어 : " + english);
				System.out.println("수학 : " + math);
				System.out.println();
				System.out.println("총점 : " + total);
				System.out.printf("평균 : %.2f\n", avg);
				break;
			case 3:
				System.out.println("Good Bye~");
				break ESCAPE;
			default:
				System.out.println("1 ~ 3사이의 숫자를 입력해주세요.");	
			
			}
			//if(input == 3) break;
			
		}
		
	}
}
