package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {

	public void lottoProgram() {

		// 로또 번호자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 몇개? 6개
		// 로또 번호의 범위는? 1 ~ 45
		
		Random rand = new Random();
		
		int [] lottos = new int[6];
		
		for(int i = 0; i < lottos.length; i++) {
			lottos[i] = rand.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				// 비교를 한다. 점점 많아진다.
				// 비교는 이미뽑은 것과 첫번째부터.
				if(lottos[i] == lottos[j]) {
					// 같으면 i--;
					i--;
					break;
				}
			}
		}
		// 정렬
		// 버블정렬
		for(int i = 0; i < lottos.length; i++) {
			for(int j = lottos.length-1; j > 0; j--) {
				if(j !=  0 && lottos[j - 1] > lottos[j]) {
					int temp = lottos[j];
					lottos[j] = lottos[j - 1];
					lottos[j - 1] = temp;
				}
			}
			System.out.print(lottos[i] + " ");
		}
		
	}
} 
