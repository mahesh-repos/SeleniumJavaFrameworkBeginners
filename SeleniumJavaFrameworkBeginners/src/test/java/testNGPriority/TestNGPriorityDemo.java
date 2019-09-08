package testNGPriority;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	@Test
	public void one() {

		System.out.println("I am Inside test 1 ");

	}

	@Test(priority = 1)   
	public void two() {

		System.out.println("I am Inside test 2 ");

	}

	@Test(priority = 2)
	public void three() {

		System.out.println("I am Inside test 3 ");

	}


}
