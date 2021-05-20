package com.qa.community;

public class Tax {
	static double tax;
	
	public static void main(String[] args) {
		int money = 21444;
		method1(money);
		System.out.println(method2(money, tax));

	}
	public static void method1(int money) {
		int money1 = money;
        if (money1 >= 0 & money1 <= 14999) {
        	System.out.println("0% tax");
        	tax = 0;
        }
        else if (money1 >= 15000 & money1 <= 19999) {
        	System.out.println("10% tax");
        	tax = 0.9;
        }
        else if (money1 >= 20000 & money1 <= 29999) {
        	System.out.println("15% tax");
        	tax = 0.85;
        }
        else if (money1 >= 30000 & money1 <= 44999) {
        	System.out.println("20% tax");
        	tax = 0.8;
        }
        else {
        	System.out.println("25% tax");
        	tax = 0.75;
        }
        }
        
	public static double method2(int money, double tax) {
		double amount = money * tax;
		return amount;
	}

}
