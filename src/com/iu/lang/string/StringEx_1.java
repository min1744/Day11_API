package com.iu.lang.string;

import java.util.Scanner;

public class StringEx_1 {
	Scanner sc = new Scanner(System.in);
	//ex1
	//주민번호 입력 991224-1234567
	//남자 여자 판별

	public void check() {

		System.out.print("주민번호를 입력하세요 : ");
		String num1 = sc.next();
		char check = num1.charAt(7);

		if(check == '1' || check == '3' || check == '5') {
			System.out.println("남자");
		}else
			System.out.println("여자");
	}

	public void ex2() {
		String name = "Mississippi";
		int i = -1;//index
		int count = 0;//count
		while(true) {
			i = name.indexOf('s', i+1);
			if(i != -1) {
				count++;
			}else
				break;
		}System.out.print("Count : " + count);
	}

	public void ex3() {
		//문자열을 입력 받고
		//글자당 *100원
		System.out.print("문자를 입력하세요 : ");
		String str = sc.next();
		int pay = str.length()*100;
		System.out.println(pay + "원");
	}

	public void ex4() {
		//id입력 - email 형식으로 받을 것
		//최대 10글자 이하로만 입력받을 수 있또록 설정
		while(true) {
			System.out.print("아이디를 입력하세요 : ");
			String id = sc.next();
			int check = id.indexOf('@');

			if(check > -1 && check <= 10) {
				System.out.println("정상적인 아이디입니다.");
				break;
			}else
				System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void ex5() {
		//jpg, png, gif
		//업로드 할 파일명을 입력
		//이미지파일이 이미지가 맞는지 아닌지 판단
		//이미지만 업로드 가능
		while(true) {
			System.out.print("사진을 등록하세요 : ");
			String name = sc.next();
			int image = name.lastIndexOf('.');
			String extension = name.substring(image+1);
			if(extension.equals("jpg") || extension.equals("png") || extension.equals("gif")|| extension.equals("jpeg")) {
				System.out.println(extension + " 파일이 등록되었습니다.");
				break;
			}
			else
				System.out.println("잘못 된 파일입니다.");
		}
	}
}