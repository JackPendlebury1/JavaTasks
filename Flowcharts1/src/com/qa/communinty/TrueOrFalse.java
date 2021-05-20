package com.qa.communinty;

public class TrueOrFalse {
	
	public static void main(String[] args) {
		sums(5 , 5, false);
	}
	public static void sums(int a, int b, boolean bool) {
		if (bool == true) {
			System.out.println(a + b);
		} else {
			System.out.println(a * b);
		}
	}
}
