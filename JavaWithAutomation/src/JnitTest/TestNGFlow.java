package JnitTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFlow {

	@BeforeClass
	public void action1() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void action2() {
		System.out.println("BeforeMethod");
	}
	@BeforeTest
	public void action3() {
		System.out.println("BeforeTest");
	}
	@BeforeSuite
	public void action4() {
		System.out.println("BeforeSuit");
	}
	@Test
	public void action5() {
		System.out.println("Test1");
	}
	@Test
	public void action6() {
		System.out.println("Test2");
	}
	@AfterTest
	public void action7() {
		System.out.println("AfterTest");
	}
	@AfterMethod
	public void action8() {
		System.out.println("AfterMethod");
		
	}
	@AfterClass
	public void action9() {
		System.out.println("AfterClass");
	}
	@AfterSuite
	public void action10() {
		System.out.println("AfterSuit");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
