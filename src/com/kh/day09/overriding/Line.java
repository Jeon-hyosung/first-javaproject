package com.kh.day09.overriding;

public class Line extends Shape {

	// 오버라이딩 하겠습니다 (재정의, 복붙)
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
