package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {

	static int korean = 0;
	static int english = 0;
	static int math = 0;
	static int total = 0;
	static double avg = 0;
	static int count = 0; // 전역변수, 클래스 변수
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EXIT:
		while(true) {
			printmenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				inputscore();
				break;
			case 2:
				printscore();
				break;
			case 3:
				goodByeMsg();
				break EXIT;
			default:
				printexception();
				break;		
			}
		}
	}
	public static void printmenu() {
		System.out.println("====== 메인메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택: ");
	}
	public static void inputscore() {
		Scanner sc = new Scanner(System.in);
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
	}
	public static void printscore() {
		System.out.println("====== 성적 출력 ======");
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println();
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n", avg);
	}
	public static void goodByeMsg() {
		System.out.println("Good Bye");
	}
	public static void printexception() {
		System.out.println("1 ~ 3사이의 숫자를 입력하세요");
	}

}

