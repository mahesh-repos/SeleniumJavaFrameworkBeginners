package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.RetryAnalyzer;

public class TestNGRetryFailedDemo {

	@Test
	public void test1() {
		System.out.println("I am Inside test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am Inside test 2");
		//int i=1/0;
	}
	
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void test3() {
		System.out.println("I am Inside test 3");
		Assert.assertTrue(0>1);
	}
}
