package com.qa.community;

import java.util.HashMap;
import java.util.Map;

public class coin {
	static Map<String, Double> map =  new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Map.Entry<String, Double> pair : map.entrySet()) {
			if ((pair.getValue() / 150 * 100) < 60) {
				System.out.println("you have failed " + pair.getKey() + " with a score of "+ pair.getValue());
			}
		}
	}

}
