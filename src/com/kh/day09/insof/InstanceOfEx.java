package com.kh.day09.insof;

public class InstanceOfEx {

	static void print(Person p) {
		//Person p = new Student();
//		if(p instanceof Person)
//			System.out.println("Person입니다.");
		if(p instanceof Student)
			System.out.println("Student입니다.");
		if(p instanceof Researcher)
			System.out.println("Researcher입니다.");
		if(p instanceof Professor)
			System.out.println("Professor입니다.");
		//System.out.println("Person 입니다!");
	}
	public static void main(String [] args) {
		//print(new Person());
		// Person p = new Student();
		print(new Student()); // 업캐스팅이 되어서 오류가 안남
		print(new Researcher());
		print(new Professor()); // 건너건너 상속받아도 업캐스팅 가능
	}
	
	
}
