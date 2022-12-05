package com.kh.practice.homework;

import java.util.Scanner;

public class BookFunction {

	Book [] books = new Book[3];
	
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 도서 관리 프로그램 ======");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 현황");
		System.out.println("3. 도서 대여");
		System.out.println("4. 프로그램 종료");
		System.out.print("원하시는 메뉴를 입력해주세요 : ");
		int select = sc.nextInt();
		return select;
	}
	public void insertBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 도서 등록 메뉴 ======");
		for(int i = 0; i < books.length; i++) {
			System.out.print("책 제목 : ");
			String bookName = sc.next();
			sc.nextLine();
			System.out.print("책 저자 : ");
			String author = sc.nextLine();
			System.out.print("책 장르 : ");
			String genre = sc.nextLine();
			System.out.print("책 입고일 : ");
			String stockedDate = sc.next();
			System.out.println("============");
			
			books[i] = new Book();
			books[i].setBookName(bookName);
			books[i].setAuthor(author);
			books[i].setGenre(genre);		
			books[i].setStockedDate(stockedDate);
		}
		
		
	}
	public void booksInformation() {
		System.out.println("====== 도서 현황 ======");
		System.out.println("현재의 도서 현황 입니다.");
		for(int i = 0; i < books.length; i++) {
			String name = books[i].getBookName();
			String author = books[i].getAuthor();
			String genre = books[i].getGenre();
			String date = books[i].getStockedDate();
			
			System.out.println("제목 : " + name + ", 저자 : " + author + ", 장르 : " + genre);
			System.out.println("입고 날짜 : " + date);
			//System.out.println("======================");
		}
	}
	public void bookRental() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 도서 대여 메뉴 ======");
		System.out.println("대여를 원하시는 도서를 선택해주세요.");
		System.out.println("1 ~ 3의 숫자를 입력해주세요.");
		System.out.println("1. " + books[0].getBookName());
		System.out.println("2. " + books[1].getBookName());
		System.out.println("3. " + books[2].getBookName());
		System.out.print("선택 : ");
		int selectBook = sc.nextInt();
		switch(selectBook) {
			case 1:
				System.out.println(books[0].getBookName() + "을/를 대여하시겠습니까?");
				System.out.print("(Y/N) : ");
				char selectYN = sc.next().charAt(0);
				switch(selectYN){
				case 'Y':
					System.out.println("대여가 완료되었습니다. 반납기한은 대여일로부터 7일입니다.");
					break;
				case 'N':
					break;
			}
				break;
			case 2:
				System.out.println(books[1].getBookName() + "을/를 대여하시겠습니까?");
				System.out.print("(Y/N) : ");
				char selectYN1 = sc.next().charAt(0);
				switch(selectYN1){
				case 'Y':
					System.out.println("대여가 완료되었습니다. 반납기한은 대여일로부터 7일입니다.");
					break;
				case 'N':
					break;
			}
				break;
			case 3:
				System.out.println(books[2].getBookName() + "을/를 대여하시겠습니까?");
				System.out.print("(Y/N) : ");
				char selectYN2 = sc.next().charAt(0);
				switch(selectYN2){
				case 'Y':
					System.out.println("대여가 완료되었습니다. 반납기한은 대여일로부터 7일입니다.");
					break;
				case 'N':
					break;
				}
				break;
			default:
				System.out.println("1 ~ 3사이의 숫자를 입력해주세요.");
				break;
			
		}
	}
	public void programExit() {
		System.out.println("프로그램을 종료합니다.");
	}
	public void exceptionMsg() {
		System.out.println("1 ~ 4 사이의 숫자를 입력해주세요.");
	}
	
}
