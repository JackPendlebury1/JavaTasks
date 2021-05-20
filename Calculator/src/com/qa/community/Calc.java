package com.qa.community;
public class Calc {
	public static int y;
	
	public static void main(String[] args) {
		System.out.println(addition(2,2));
		System.out.println(subtraction(2,2));
		System.out.println(multiplication(2,2));
		division(10,5);
	}
	
	public static int addition(int int1, int int2) {
		int result = int1 + int2;
		return result;
	}
	public static int subtraction(int int1, int int2) {
		int result = int1 - int2;
		y = 10;
		return result;
	}
	public static int multiplication(int int1, int int2) {
		int result = int1 * int2;
		return result;
	}
	public static void division(double doub1, double doub2) {
		if (doub1 > doub2) {
			System.out.println("cannot be preformed");
		} else {
			double result = doub1/doub2;
			System.out.println(result);
		}
		
	}
}
