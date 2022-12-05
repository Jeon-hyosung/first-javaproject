package com.kh.day09.point;

public class ColorPoint extends Point { // 자식 클래스 (Point 클래스를 상속)

	private String color; // 점의 색
	
	public ColorPoint() {}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);// x, y 세팅
		// Point의 생성자 Point(x,y) 호출
		// 생성자 선택은 역시 super
		this.color = color;
	}
	
//	public void setColor(String color) {
//		this.color = color;
//	}
	public void showColorPoint() { // 색, 좌표 출력
		System.out.println(color);
		showPoint(); // Point클래스의 showPoint() 호출
	}
}
