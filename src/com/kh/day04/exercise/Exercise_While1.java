package com.kh.day04.exercise;

public class Exercise_While1 {

	public static void main(String [] args) {
		// while���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�.
		
		int i = 0;
		int sum = 0;
		while(i < 100) {
			if(i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
		
	

		
		
	}
}
