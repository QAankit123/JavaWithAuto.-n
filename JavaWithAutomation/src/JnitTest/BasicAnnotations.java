package JnitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasicAnnotations {

	
	
	@Test 
	public void Login() {
		// TODO Auto-generated method stub
    System.out.println("Login to System");
	}
	
	@After
	public void CloseBrowser() {
		// TODO Auto-generated method stub
  System.out.println("Close the browser");
	}
	
	
	
	@Before
	public void OpenBrowser() {
		// TODO Auto-generated method stub
   System.out.println("Open the browser");
	}
	
	
	
	@Test
	public void Composemail() {
		// TODO Auto-generated method stub
    System.out.println("Pls Compose a Mail");
	}
	
	@BeforeClass
	
	public static  void Testing1() {
		// TODO Auto-generated method stub
    System.out.println("testing of Before Class ");
	}
	
	
	@AfterClass
	
	public static void Testing2() {
		// TODO Auto-generated method stub
    System.out.println("testing of After Class");
	}
	
	
	
	
	
	
}
