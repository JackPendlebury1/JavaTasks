package com.qa.community;

public class sum {

	public static void main(String[] args) {
		System.out.println(output(2, 1, 1));
	}
	public static int output(int num1, int num2, int num3) {
		if (num1 == num2 & num1 == num3 & num2 == num3) {
			return 0;
		} else if(num1 == num2 ){
			return num3;
		} else if(num2 == num3) {
			return num1;
		} else if(num1 == num3) {
			return num2;
		} else {
			return num1 + num2 + num3;
		}
	}

}
