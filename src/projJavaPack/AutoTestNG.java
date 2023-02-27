package projJavaPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AutoTestNG {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite");
	}
	
	@BeforeClass
	public void Beforeclass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("After Class");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	@Test
	public void test3() {
		System.out.println("Test 3");
	}

}

