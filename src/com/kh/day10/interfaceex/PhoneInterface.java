package com.kh.day10.interfaceex;

public interface PhoneInterface {
	public String NAME = "";
	//name = "Hello World"; // X, 상수값이라서 바뀌지 않음.
//	1. Illegal modifier for the interface field PhoneInterface.name; 
//	only public, static & final are permitted
	public static final int TIME_OUT = 10000; // 기울어져있으면 static이란 의미 
	public void sendCall();
	public abstract void receiveCall();
//	2. Abstract methods do not specify a body
	abstract void printLogo();
	void displayNumber(); // public, abstract 둘다 없어도 가능
	public default void showLogo() { // 디폴트 메소드(유일하게 몸체를 사용할수 있게하는 메소드)
		// 하위 호완성을 위해서 작성한다.
		// 즉, 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
	
}
