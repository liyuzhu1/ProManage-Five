package com.webtest.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.WebTestListener;

@Listeners(WebTestListener.class)
public class FreemarkerTest {
	
	@Test
	public void test1() {
		Assert.assertEquals(1, 1);
		Reporter.log("lctest1");
		
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2, 2);
		Reporter.log("lctest2");
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(1, 2);
		Reporter.log("lctest3");
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(1, 3);
		Reporter.log("lctest4");
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(3, 3);
		Reporter.log("lctest5");
	}
}