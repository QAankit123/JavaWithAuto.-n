package JnitTest;


import org.testng.TestRunner.PriorityWeight;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest {
@Test (priority=2)
	public void Tc_02() {
		// TODO Auto-generated method stub
    System.out.println("Login to System");
	}
	@AfterMethod
	public void CloseBrowser() {
		// TODO Auto-generated method stub
  System.out.println("Close the browser");
	}
	@BeforeMethod
	public void OpenBrowser() {
		// TODO Auto-generated method stub
   System.out.println("Open the browser");
	}
	@Test(priority=1)
	public void TC_01() {
		// TODO Auto-generated method stub
    System.out.println("Pls Compose a Mail");
	}
	@BeforeMethod
	
	public  void Testing1() {
		// TODO Auto-generated method stub
    System.out.println("testing of Before Class ");
	}
	@AfterMethod
	public void Testing2() {
		// TODO Auto-generated method stub
    System.out.println("testing of After Class");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
