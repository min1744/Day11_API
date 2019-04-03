package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExInput {
	private Scanner sc;
	
	
	public ListExInput() {
		sc = new Scanner(System.in);
		
	}
	
	
	public void setInfo(ArrayList ar) {
		System.out.println("이름 입력");
		String name = sc.next();
		ar.add(name);
		System.out.println("번호 입력");
		int age = sc.nextInt();
		ar.add(age);
		
	}

}