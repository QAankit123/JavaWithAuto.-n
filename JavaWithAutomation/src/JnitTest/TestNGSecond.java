package JnitTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSecond {

	//private static final boolean False = false;
	@Test(dependsOnMethods="Compose")
	public void Login() {
		// TODO Auto-generated method stub
          System.out.println("Login Successfully");
	}
	@Test
	 public void Compose() {
		// TODO Auto-generated method stub
		Assert.assertTrue(true);
		 System.out.println("Compose Mail");
	}
	@BeforeMethod
	public void BrowserStart() {
		// TODO Auto-generated method stub
		System.out.println("Open the browser");
	}
	@AfterMethod
	 public void BrwserClose() {
		// TODO Auto-generated method stub
		 System.out.println("Close the browser");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
