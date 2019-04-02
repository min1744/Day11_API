package com.iu.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {
	public void ex1() {
		//주민번호를 입력
		//1. 나이가 몇?(만 나이)
		//2. 3~5월생 : 봄, 6~8월생 : 여름, 9~11월생 : 가을, 12~2월생 : 겨울
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("주민등록번호 : ");
			String re = sc.next();
			String year = re.substring(0, 2);
			String month = re.substring(2, 4);
			String day = re.substring(4, 6);
			String generation = re.substring(7, 8);

			int y = Integer.parseInt(year);
			int m = Integer.parseInt(month);
			int d = Integer.parseInt(day);
			int g = Integer.parseInt(generation);

			if(m>=1 && m<=12) {
				if(g == 1) {
					System.out.println("나이 : 만 " + (2019-(1900+y)) + "세");
				}else
					System.out.println("나이 : 만 " + (2019-(1900+y)-100) + "세");
				if(m >= 3 && m <= 5) {
					System.out.println("출생 계절 : 봄");
					break;
				}else if(m >= 6 && m <= 8) {
					System.out.println("출생 계절 : 여름");
					break;
				}else if(m >= 9 && m <= 11) {
					System.out.println("출생 계절 : 가을");
					break;
				}else {
					System.out.println("출생 계절 : 겨울");
					break;
				}
			}else
				System.out.println("주민등록번호를 잘못 입력하셨습니다.");
		}
	}

	public void ex2() {
		//비밀번호를 입력하세요 :
		//대문자, 소문자, 숫자 각각 1개 이상, 공백은 X
		//최소 6자 이상
		int count = 0;
		int upper = 0;
		int lower = 0;
		int digit = 0;
		int space = 0;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("비밀번호를 입력하세요 : ");
			String pw = sc.nextLine();
			
			count = pw.length();
			if(count>5) {
				for(int i = 0; i < pw.length(); i++) {
					char ch = pw.charAt(i);
					if(Character.isUpperCase(ch)) {
						upper++;
					}else if(Character.isLowerCase(ch)) {
						lower++;
					}else if(Character.isDigit(ch)) {
						digit++;
					}else if(Character.isWhitespace(ch)) {
						space++;
					}
				}
				if(upper > 0 && lower > 0 && digit > 0 && space == 0) {
					System.out.println("정상 입력 되었습니다.");
					break;
				}
				else
					System.out.println("정상적으로 입력되지 않았습니다.");
			}else
				System.out.println("6글자 이상 입력해주세요");
		}
	}
}