package com.kh.day09.overriding;

public class MethodOverridingEx {

	static void paint(Shape p) {
		// Shape p = new line();
		p.draw();
	}
	
	public static void main(String [] args) {
		Line line = new Line();
		//line.draw();
		paint(line); // 동적 바인딩
		paint(new Rect());
		paint(new Circle());
	}
}
