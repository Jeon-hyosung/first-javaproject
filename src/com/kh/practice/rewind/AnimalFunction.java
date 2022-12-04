package com.kh.practice.rewind;

import java.util.Scanner;

public class AnimalFunction {

	Animal [] animals;
	
	public AnimalFunction() {
		animals = new Animal[2];
	}
	
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 애완동물 관리 프로그램 ======");
		System.out.println("1. 애완동물 정보 입력");
		System.out.println("2. 애완동물 상태 체크");
		System.out.println("3. 병원 예약");
		System.out.println("4. 병원 예약 확인");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int input = sc.nextInt();
		return input;
	}
	public void inputInformation() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < animals.length; i++) {
			System.out.println("====== 애완동물 정보 입력 ======");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("입양일자(YY.MM.DD) : ");
			String date = sc.next();
			System.out.print("성별 (M/F) : ");
			char gender = sc.next().charAt(0);
			System.out.print("견종 : ");
			String species = sc.next();
			System.out.print("접종상태 (Y/N) : ");
			char vaccination = sc.next().charAt(0);
			System.out.print("진료날짜 : ");
			String medicalDate = sc.next();
			System.out.print("건강상태 (%): ");
			int healthState = sc.nextInt();
			
			animals[i] = new Animal();
			animals[i].setName(name);
			animals[i].setDate(date);
			animals[i].setGender(gender);
			animals[i].setSpecies(species);
			animals[i].setvaccination(vaccination);
			animals[i].setmedicalDate(medicalDate);
			animals[i].sethealthState(healthState);
		}
	}
	
	public void stateCheck() {
		System.out.println("====== 애완동물 상태 체크 ======");
		for(int i = 0; i < animals.length; i++) {
			String name = animals[i].getName();
			char vacc = animals[i].getvaccination();
			String medicDate = animals[i].getmedicalDate();
			int healStat = animals[i].gethealthState();
			System.out.println("====" + name + "의 상태 ====");
			System.out.println("접종상태 : " + vacc);
			System.out.println("진료날짜 : " + medicDate);
			System.out.println("== 건강상태 ==");
			if(healStat >= 80) {
				System.out.println("현재 " + name + "은/는 건강합니다.");
			}
			else if(healStat >= 60) {
				System.out.println("현재 " + name + "은/는 안정이 필요합니다.");
			}
			else if(healStat >= 40) {
				System.out.println("현재 " + name + "은/는 진료가 필요합니다.");
			}
			else if(healStat >= 20) {
				System.out.println("현재 " + name + "은/는 수술이 필요합니다.");
			}
		}
		
	}
	public void reservation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 병원 예약 ======");
		System.out.print("병원을 예약하시겠습니까? (Y/N) : ");
		char reservation = sc.next().charAt(0);
		if(reservation == 'Y') {
			
			for(int i  = 0; i < animals.length; i++) {
				System.out.println("예약할 애완동물의 해당하는 번호를 선택해주세요.");
				System.out.println("1. " + animals[0].getName());
				System.out.println("2. " + animals[1].getName());
				System.out.print(">> ");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println(animals[0].getName() + "을/를 선택하셨습니다.");
					System.out.println("병원을 선택해주세요.");
					System.out.println("1. 동네동물병원");
					System.out.println("2. 종합동물병원");
					System.out.println("3. 대학동물병원");
					System.out.print(">> ");
					int select = sc.nextInt();
					switch(select) {
					case 1:
						System.out.println("동네동물병원을 선택하셨습니다.");
						System.out.print("원하시는 날짜를 입력해주세요. (yy.mm.dd) :");
						String reservdate = sc.next();
						System.out.println(reservdate + "에 예약이 완료되었습니다.");
						break;
					case 2:
						System.out.println("종합동물병원");
						System.out.print("원하시는 날짜를 입력해주세요. (yy.mm.dd) :");
						String reservdate2 = sc.next();
						System.out.println(reservdate2 + "에 예약이 완료되었습니다.");
						break;
					case 3:
						System.out.println("대학동물병원");
						System.out.print("원하시는 날짜를 입력해주세요. (yy.mm.dd) :");
						String reservdate3 = sc.next();
						System.out.println(reservdate3 + "에 예약이 완료되었습니다.");
						break;
					default:
						System.out.println("1 ~ 3사이의 숫자를 입력해주세요.");
						break;
					}
					break;
				case 2:
					System.out.println(animals[1].getName() + "을/를 선택하셨습니다.");
					System.out.println("병원을 선택해주세요.");
					System.out.println("1. 동네동물병원");
					System.out.println("2. 종합동물병원");
					System.out.println("3. 대학동물병원");
					System.out.print(">> ");
					int select2 = sc.nextInt();
					switch(select2) {
					case 1:
						System.out.println("동네동물병원을 선택하셨습니다.");
						System.out.print("원하시는 날짜를 입력해주세요. (yy.mm.dd) :");
						String reservdate = sc.next();
						System.out.println(reservdate + "에 예약이 완료되었습니다.");
						break;
					case 2:
						System.out.println("종합동물병원");
						System.out.print("원하시는 날짜를 입력해주세요. (yy.mm.dd) :");
						String reservdate2 = sc.next();
						System.out.println(reservdate2 + "에 예약이 완료되었습니다.");
						break;
					case 3:
						System.out.println("대학동물병원");
						System.out.print("원하시는 날짜를 입력해주세요. (yy.mm.dd) :");
						String reservdate3 = sc.next();
						System.out.println(reservdate3 + "에 예약이 완료되었습니다.");
						break;
					default:
						System.out.println("1 ~ 3사이의 숫자를 입력해주세요.");
						break;
					}
					break;
				default:
					System.out.println("잘못된 번호입니다.");
					break;
				}
			}
		}
	}
		
	public void checkReserv() {
		System.out.println("====== 병원 예약 확인======");
		
	}
	
	public void programExit() {
		System.out.println("안녕히가십시오.");
	}
	public void exceptionMsg() {
		System.out.println("1 ~ 5사이의 숫자를 입력해주세요.");
	}
}
