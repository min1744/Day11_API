package com.iu.lang;

public class Object_2_Wrapper {

	public static void main(String[] args) {
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Double.BYTES);
		
		Integer i = new Integer(10);
		Integer i2 = new Integer("20");
		int n1 = i2.intValue();
		System.out.println(n1*2);
		
		String num1 = "3.2";
		Double d = new Double(num1);
		double n2 = d.doubleValue();
		System.out.println(n2*2);
		
		n1 = Integer.parseInt("20");
		n2 = Double.parseDouble("3.0");
		System.out.println(n1);
		System.out.println(n2);
		
		
	}
}