package com.kh.practice.homework;

public class BookRun {

	public static void main(String [] args) {
		BookFunction bFunc = new BookFunction();
		
		ESCAPE:
		while(true) {
			int input = bFunc.mainMenu();
			switch(input) {
			case 1:
				bFunc.insertBook();
				break;
			case 2:
				bFunc.booksInformation();
				break;
			case 3:
				bFunc.bookRental();
				break;
			case 4:
				bFunc.programExit();
				break ESCAPE;
			default:
				bFunc.exceptionMsg();
				break;
			}
		}
		
		
	}
}
