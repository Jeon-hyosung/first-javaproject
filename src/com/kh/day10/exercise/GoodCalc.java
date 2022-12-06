package com.kh.day10.exercise;

public class GoodCalc extends Calculator{

	public static void main(String [] args) {
		GoodCalc calc = new GoodCalc();
		int [] a = {1, 2, 3};
		System.out.println("합 : " + calc.add(2, 3));
		System.out.println("차 : " + calc.substract(3, 1));
		System.out.println("평균 : " + calc.average(a));
	}

	@Override
	public int add(int a, int b) {
		int add = a + b;
		return add;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = sum / (double)a.length ;
		return avg;
	}
}
