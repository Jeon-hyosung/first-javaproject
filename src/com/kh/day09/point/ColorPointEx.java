package com.kh.day09.point;

public class ColorPointEx {

	public static void main(String [] args) {
		
//		ColorPoint cp = new ColorPoint();
//		cp.set(3, 4); // Point의 set() 호출
//		cp.setColor("red"); // ColorPoint의 setColor() 호출 (자식 메소드)
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint(); // 컬러와 좌표 출력 (부모 메소드)
	}
}