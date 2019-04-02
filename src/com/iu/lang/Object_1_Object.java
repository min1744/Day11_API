package com.iu.lang;

public class Object_1_Object {

	public static void main(String[] args) {
		//Object 클래스의 객체 생성
		//클래스명 참조변수명 = new 생성자();
		//참조변수명.멤버변수명
		//참조변수명.멤버메서드명()
		Object obj = new Object();
		Object obj2 = new Object();
		//접근지정자 그외지정자 리턴타입 메서드명([매개변수 선언])
		
		boolean a = obj.equals(obj2);
		String b = obj.toString();
		int c = obj.hashCode();
		
		System.out.println(c);
		
		String ss = "hello world";
		String r = ss.substring(6);
		System.out.println(r);
		r= ss.substring(3,5);
		System.out.println(r);
		
		r = ss.toUpperCase();
		System.out.println(r);
		r = ss.toLowerCase();
		System.out.println(r);
		
		String str1 = "test";
		String str2 = " test ";
		r = str2.trim();
		System.out.println(str1);
		System.out.println(r);
		System.out.println(str1.equals(r));
		
		r = String.valueOf(3);
		System.out.println(r);
		
		ss = "iu-choa-suji-hani";
		String [] names = ss.split("-");
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		ss = "a,b,c-d-e,f";
		r = ss.replace('-', ',');
		System.out.println(r);
	}
}