package com.kh.practice.rewind;

public class AnimalRun {

	public static void main(String [] args) {
		AnimalFunction aFunc = new AnimalFunction();
		
		ESCAPE:
		while(true) {
			int choice = aFunc.mainMenu();
			switch(choice) {
			case 1:
				aFunc.inputInformation();
				break;
			case 2:
				aFunc.stateCheck();
				break;
			case 3:
				aFunc.reservation();
				break;
			case 4:
				aFunc.checkReserv();
			case 5:
				aFunc.programExit();
				break ESCAPE;
			default:
				aFunc.exceptionMsg();
				break;
			
				
			}
		}
	}
}
