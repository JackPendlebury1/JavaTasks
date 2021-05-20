package com.qa.commuinity;

public class BlackjackMain {

	public static void main(String[] args) {
		play(19, 19);
	}
	public static void play(int num1, int num2) {
		if(num1 > 0 & num2 > 0) {
			if (num1 > 21 & num2 > 21) {
				System.out.println(0);
			} 
			else if ((num1 > num2) & (num1 < 21)) {
				System.out.println(num1);
			}
			else if (num2 > num1 & num2 < 21) {
				System.out.println(num2);
			} else if (num1 > 21) {
				System.out.println(num2);
			}
			else if (num2 > 21) {
				System.out.println(num1);
			}
			else if (num2 == 21) {
				System.out.println(num2);
			}
			else if (num1 == 21) {
				System.out.println(num1);
			}
			else {
				System.out.println(num1 | num2);
			}
		} else {
			System.out.println("the number needs to be greater than 0");
		}
	}

}
