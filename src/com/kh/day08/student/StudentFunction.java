package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {

	Student [] students;
	
	public StudentFunction() {
		students = new Student[3]; // 초기화
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 학생 성적 확인 프로그램 ======");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < students.length; i++) {
			System.out.println("======" + (i + 1) + "번째 학생 정보 입력 ======");
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("1차 점수 입력 : ");
			int firstScore = sc.nextInt();
			System.out.print("2차 점수 입력 : ");
			int secondScore = sc.nextInt();
			
			students[i] = new Student();
			students[i].setName(name);
			students[i].setFirstScore(firstScore);
			students[i].setSecondScore(secondScore);
		}
	}
	
	public void printScore() {
		for(int i = 0; i < students.length; i++) {
			System.out.println("======" + (i + 1) + "번째 학생 정보 출력 ======");
			System.out.println(students[i].getName() + "학생의 점수는");
			System.out.println("1차 점수 : " + students[i].getFirstScore() + ", " + "2차 점수 : " + students[i].getSecondScore() + "입니다.");
		}
	}
	
	public void checkPass() {
		/*
		 * 0. 재평가의 여부는 1차, 2차가 각각 다르다.
		 * 1. 각각의 점수가 40점 미만의 경우 과락으로 재평가 대상자가 된다. 한 과목만 40점 미만인 경우
		 *    1차, 2차의 평균이 60점 이상이면 40점 미만인 과목만 재평가를 본다.
		 * 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 통과한다.
		 * 3. 1차 점수와 2차 점수의 평균이 60점 미만의 경우 60점 미만의 과목에 대해서 재평가를 본다.
		 */

//		평균이 60점이 아닌사람
//		case1. 둘다 60점이 아닌 경우
//		case2. 1차는 60점이상 2차는 60점이하
//		case3. 1차는 60점이하 2차는 60점이상
		System.out.println("====== 재평가 여부 확인 ======");
		for(int i = 0; i < students.length; i++) {
			String name = students[i].getName();
			int first = students[i].getFirstScore();
			int second = students[i].getSecondScore();
			double avg = ((first + second) / (double)2);
			if(avg >= 60) {
				if(first < 40) {
					System.out.println(name + "학생은 1차 시험 재평가 대상자 입니다.");
				}
				else if(second < 40) {
					System.out.println(name + "학생은 2차 시험 재평가 대상자 입니다.");
				}
				else{
					System.out.println(name + "학생은 통과하셨습니다.");
				}
			}
			else {
				if(first < 60 || second < 60) {
					System.out.println(name + "학생은 1차, 2차 시험 재평가 대상자 입니다.");
				}
				else if(first < 60 || second >= 60) {
					System.out.println(name + "학생은 1차 시험 재평가 대상자 입니다.");
				}
				else if(first >= 60 || second < 60) {
					System.out.println(name + "학생은 2차 시험 재평가 대상자 입니다.");
				}
			}
		}
		
	}
	
	public void printGoodBye() {
		System.out.println("GoodBye");
	}
	
	public void printException() {
		System.out.println("1 ~ 4 사이의 숫자를 입력해주세요");
	}
}

