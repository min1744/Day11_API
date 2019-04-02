package com.iu.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		Wrapper_ex1 we1 = new Wrapper_ex1();
		Wrapper_ex2 we2 = new Wrapper_ex2();
		Wrapper_ex3 we3 = new Wrapper_ex3();
		//we.ex1();
		
		/*int num = -10;
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toOctalString(num));
		System.out.println(Integer.toHexString(num));*/
		//we1.ex2();
		we2.ex1();
		//we3.ex1();
		
		Integer n1 = new Integer(10);
		int num = n1; //autoUnBoxing
		n1 = 20;//autoBoxing(Heap -> Stack)
		
		String s1 = "iu";
		String s2 = "choa";
		System.out.println(s1.hashCode());
		s1 = s1 + s2;
		System.out.println(s1.hashCode());
		
		StringBuffer s = new StringBuffer();
		System.out.println(s.hashCode());
		s.append("iu");
		s.append("choa");
		System.out.println(s.hashCode());
		
		System.out.println(s.toString());
		String names = s.toString();
		
		double d1 = 3.14;
		d1 = Math.ceil(d1);//올림
		System.out.println(d1);
		d1 = 3.54;
		d1 = Math.floor(d1);//내림
		System.out.println(d1);
		d1 = 3.44;
		d1 = Math.round(d1);//반올림
		System.out.println(d1);
		
		d1 = Math.random();
		System.out.println("Random : " + d1);
	}
}