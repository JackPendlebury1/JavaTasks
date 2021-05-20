package com.qa.community;

import java.util.HashMap;
import java.util.Map;

public class Exams {
	
	static Map<String, Double> map =  new HashMap<>();
	
	public static void main(String[] args) {
		double physics = 150;
		double chemistry = 65;
		double biology = 59;
		double total = physics + chemistry + biology;
		double Overallpercentage = total / 450;
		results(physics,chemistry,biology,total);
		resultPercent(Overallpercentage, physics,chemistry,biology);
	}
	
	public static void results(double physics, double chemistry, double biology, double total) {
		System.out.println("--------------------------------");
		System.out.println("Your physics result is: " + physics);
		System.out.println("--------------------------------");
		System.out.println("Your chemistry result is: " + chemistry);
		System.out.println("--------------------------------");
		System.out.println("Your biology result is: " + biology);
		System.out.println("--------------------------------");
		System.out.println("Your total result is: " + total);
		System.out.println("--------------------------------");
	}
	
	public static void resultPercent(double Overallpercentage, double physics, double chemistry, double biology) {
		double per = Math.round(Overallpercentage*100);
		map.put("physics", physics);
		map.put("chemistry", chemistry);
		map.put("biology", biology);
		if (per > 60) {
			System.out.println("overall grade of " + per + "% you have (Passed)");
			for (Map.Entry<String, Double> pair : map.entrySet()) {
				if ((pair.getValue() / 150 * 100) < 60) {
					System.out.println("you have failed " + pair.getKey() + " with a score of "+ pair.getValue());
				}
			}
		} else {
			System.out.println("overall grade of " + per + "% you have (Failed)");
		}
	}

}
