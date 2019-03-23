package org.Enterprise.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.Enterprise.Base.BaseData;
import org.Enterprise.Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomBooking extends BaseData{
    
	WebDriver driver ;
	
	@FindBy(xpath="//a[@class='activeNavLink']")
	WebElement HomeTab;
	
	@FindBy(xpath="//div[@id='RoomBookingHeader']")
	WebElement RoomBookingHeader ;
	@FindBy(xpath="//a[@id='advancedSearchLink']")
	WebElement AdvanceSearch;
	
	CommonMethods objCommonMethods = new CommonMethods(driver);
	
	public RoomBooking(WebDriver driver){
		this.driver=driver;
	}
	
	public Boolean RoomBookingTab() {
		 
		Boolean status=false;
		objCommonMethods.isVisible(driver,RoomBookingHeader,60);
		RoomBookingHeader.click();
		
		status= RoomBookingHeader.isDisplayed();
		return status;
	}
		
      public Boolean HomeTab() {    
	 
         
    	Boolean status=false;
    	objCommonMethods.isVisible(driver,HomeTab,60);
  		HomeTab.click();
  		status= HomeTab.isDisplayed();
  		return status;
      }
    	

    //This link is inside Home Tab
    public Boolean AdvancedSearchLink() {
    	Boolean status=false;
    	objCommonMethods.isVisible(driver,HomeTab,60);
  		HomeTab.click();
  		objCommonMethods.isVisible(driver,AdvanceSearch,60);
  		AdvanceSearch.click();
  		status= HomeTab.isDisplayed();
  		return status;
    	}

	
    //This link is inside Home Tab
    public void SetAsDefaultLinkHomeTab() {
		

	}
    public void YourBookingsTab() {
		

	}
	public void FindARoomTab() {
		

	}
	
	//This link is inside FindARoom Tab
	public void SetAsDefaultLinkFindARoom () {
		
	}
	//This link is inside FindARoom Tab
	private void StartOverLink() {
		

	}
	public void BookingGridTab() {
		

	}
	
	private void AdvancedGridTab() {
		

	}
	public void DeliveryTab() {
		

	}
	
	public void RequestTab() {
		

	}
	public void FindBookingsTab() {
		

	}
	
	public void UsersTab() {
		

	}
	
}
