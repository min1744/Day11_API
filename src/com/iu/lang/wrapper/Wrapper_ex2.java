package com.iu.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex2 {
	public void ex1() {
		//주민번호 입력
		//ex)941226-1234567
		//마지막 번호는 체크용 번호로 따로 저장
		// 9 4 1 1 3 0 - 1 2 3 4 5 6 7
		//*2 3 4 5 6 7   8 9 2 3 4 5
		//전부 더하기(18 + 12 + 4 + 10 + ...)
		//결과를 11로 나눈 나머지를 구하기
		//나머지를 11에서 뺀 값을 체크번호랑 비교. 같으면 정상적인 번호
		//위의 결과값이 두자리라면 위의 결과값을 10으로 나눈 나머지를 체크번호와 비교
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력해주세요 : ");
		String re = sc.next();
		int sum = 0;
		int cal = 0;
		int rest = 0;
		char ch = re.charAt(re.length()-1);
		int check = Integer.parseInt(String.valueOf(ch));
		int nomal = 0;
		re = re.replace("-", "");
		for(int i = 0; i < re.length()-1; i++) {
			int reInt = Integer.parseInt(String.valueOf(re.charAt(i)));
			if(i < 8)
				cal = reInt * ((i + 2) % 10);
			else
				cal = reInt * ((i + 2) % 10 + 2);
			sum += cal;
			rest = sum % 11;
			nomal = 11 - rest;
		}if(nomal == check) {
			if(nomal >= 10) {
				nomal = nomal % 10;
			}
			System.out.println("정상적인 주민등록번호입니다.");
		}else
			System.out.println("정상적인 주민등록번호가 아닙니다.");
	}
}
/*
 * 0 1 2 3 4 5 6 7 8 9 10
 * 2 3 4 5 6 7 8 9 2 3  4 
 * j = (i+2)%10
 * if(index >= 8)
 * j+2
 * 193
 */