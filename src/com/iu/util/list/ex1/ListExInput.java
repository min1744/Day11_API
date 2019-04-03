package com.iu.util.list.ex1;

import java.util.Scanner;

public class ListExInput {
	private Scanner sc;
	
	public ListExInput() {
		sc = new Scanner(System.in);
		
	}
	public Member setInfo() {
		Member member = new Member();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		member.setName(name);
		
		System.out.print("번호 입력 : ");
		int age = sc.nextInt();
		member.setAge(age);
		
		return member;
	}
}