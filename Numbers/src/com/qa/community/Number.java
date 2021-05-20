package com.qa.community;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(77);
	}
	public static void method1(int num1) {
		while(num1 > 0) {
			System.out.println(num1 % 10);
			num1 = num1 / 10;
		}
	}

}
