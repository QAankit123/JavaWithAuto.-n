package org.Enterprise.TestCase;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.Enterprise.Base.BaseData;
import org.Enterprise.Page.RoomBooking;
import org.Enterprise.Utils.CommonMethods;
import org.testng.annotations.Test;

public class TestCase_RoomBooking extends BaseData {
	
		
		
	
	ResourceBundle bundle = ResourceBundle.getBundle("Config");	
   	RoomBooking objRoomBooking=new RoomBooking(driver);
   	
	CommonMethods objCommonMethods = new CommonMethods(driver);
	@Test 
	public void TC_001() {
    
	objCommonMethods.LoginToSystem();
	objCommonMethods.GoToApplication();
	
	Boolean result=objRoomBooking.RoomBookingTab(); 
	if(result==true)
	{
		System.out.println("RoomBookingTab is visible");
	}
	else{
		System.out.println("RoomBookingTab is not visible");
	}
	
	}
	
	
	
	@Test   
	public void TC_002() {
	objCommonMethods.LoginToSystem();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	objCommonMethods.GoToApplication();
	
	  Boolean result=objRoomBooking.HomeTab();
	  if(result==true)
		{
			System.out.println("HomeTab is visible");
		}
		else{
			System.out.println("HomeTab is not visible");
		}
	
	}
	 

}