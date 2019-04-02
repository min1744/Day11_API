package com.iu.util.random;

import java.util.Random;

public class RandomEx1 {

	public void ex1() {
		//6개 숫자가 출력
		//1~45번 출력
		Random rd = new Random();
		for(int i = 0; i < 6; i ++) {
			System.out.println(rd.nextInt(44)+1);
		}
	}

	public void ex2() {
		//1~45번까지의 숫자를 6개
		int [] lotto = new int[6];
		Random rd = new Random();

		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = rd.nextInt(45)+1;
					j--;
				}
			}
			System.out.println(lotto[i]);
		}
	}

	public void ex3() {
		int a = 0;
		String [] foods = {"떡볶이", "냉면", "순대국", "육개장", "해장국", "굶기"};
		Random rd = new Random();
		for(int i = 0; i < foods.length; i++) {
			a = rd.nextInt(foods.length);
		}
		System.out.println(foods[a]);
	}

	public void ex4() {
		//RPG
		//Lineage :
		//10% 확률로 2단계 성공
		//20% 확률로 1단계 성공
		//70% 확률로 실패
		Random rd = new Random();
		double pro = Math.random()*10;
		double level2 = pro;
		double level1 = pro;
		level2 = rd.nextInt(1);
		level1 = rd.nextInt(2)+1;

		if(rd.nextInt(10) == level2) {
			System.out.println("2단계 성공");
		}else if(rd.nextInt(10) == level1) {
			System.out.println("1단계 성공");
		}else
			System.out.println("실패");
	}
}