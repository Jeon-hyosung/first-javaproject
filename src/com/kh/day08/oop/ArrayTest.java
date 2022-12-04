package com.kh.day08.oop;

import java.util.Scanner;

class Test {
	String name;
	int age;
	public Test(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ArrayTest {

	public static void main(String [] args) {
		
		Test [] test = new Test[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < test.length; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.println();
			
			test[i] = new Test(name, age);
		}
		for(int i = 0; i < test.length; i++) {
			System.out.println("(" + test[i].name + ", " + test[i].age + ")");
		}
		
	}
}
