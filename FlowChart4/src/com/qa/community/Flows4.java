package com.qa.community;

public class Flows4 {
	public static void main(String[] args) {
		flows(100);
	}
	public static void flows(int num1) {
		while(num1 <= 200) {
			if (num1 % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			num1 ++;
		}
	}
}
