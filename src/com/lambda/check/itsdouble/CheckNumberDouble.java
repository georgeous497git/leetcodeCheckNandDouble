package com.lambda.check.itsdouble;

import java.util.HashSet;

/*
 * Type: Solution
 * Name: Jorge Alberto Correa Reyes (Lambda)
 * Date: December 17 2020
 * Level: Easy
 * Platform: Leetcode
 * */

public class CheckNumberDouble {
	
	//Linear time complexity  O(N) 
	public static boolean checkNumberAndDouble(int[] arr) {
		

		//Contains operation - Constant time complexity O(1)
		HashSet<Integer> hs = new HashSet<>(arr.length);

		//For loop - Linear time complexity  O(N) 
		for (int i = 0; i < arr.length; i++) {
			if (hs.contains(arr[i] * 2) || ((arr[i] % 2 == 0) && hs.contains(arr[i] / 2))) {
				return true;
			}
			hs.add(arr[i]);
		}

		return false;
	}

}
