package com.webtest.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




public class TestCheck {
	
	@Test
	public void test1() {
		assertEquals(1, 1);
	}
	
	@Test
	public void test2() {
		assertEquals(2, 1);
	}
	
	@Test
	public void test3() {
		assertEquals(3, 1);
	}
	
	@Test
	public void test4() {
		assertEquals(2, 2);
	}
	
	@Test
	public void test5() {
		assertEquals(3, 2);
	}
}
