package com.lambda.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.lambda.check.itsdouble.CheckNumberDouble;

/*
 * Type: Test
 * Name: Jorge Alberto Correa Reyes (Lambda)
 * Date: December 17 2020
 * Level: Easy
 * Platform: Leetcode
 * */

public class CheckNumberDoubleTest {
	
	@Test
	public void test1() {
		
		int[] array = {10, 2, 5, 3};
		
		assertEquals(true, CheckNumberDouble.checkNumberAndDouble(array));
	}

	@Test
	public void test2() {
		
		int[] array = {7,1,11,14};
		
		assertEquals(true, CheckNumberDouble.checkNumberAndDouble(array));
	}
	
	@Test
	public void test3() {
		
		int[] array = {3,1,7,11};
		
		assertEquals(false, CheckNumberDouble.checkNumberAndDouble(array));
	}
	
	@Test
	public void test4() {
		
		int[] array = {1, -5, -10, 11};
		
		assertEquals(true, CheckNumberDouble.checkNumberAndDouble(array));
	}
	
	@Test
	public void test5() {
		
		int[] array = {1, 2};
		
		assertEquals(true, CheckNumberDouble.checkNumberAndDouble(array));
	}
	
	@Test
	public void test6() {
		
		int[] array = {12, 3};
		
		assertEquals(false, CheckNumberDouble.checkNumberAndDouble(array));
	}
	
	@Test
	public void test7() {
		
		int[] array = {0, 2};
		
		assertEquals(false, CheckNumberDouble.checkNumberAndDouble(array));
	}
	
	@Test
	public void test8() {
		
		int[] array = {0, 0};
		
		assertEquals(true, CheckNumberDouble.checkNumberAndDouble(array));
	}
	
	@Test
	public void test9() {
		
		int[] array = {-2, 0, 10, -19, 4, 6, -8};
		
		assertEquals(false, CheckNumberDouble.checkNumberAndDouble(array));
	}

}
