package org.Enterprise.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.DriverAction;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import org.Enterprise.Base.BaseData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

	 WebDriver driver;
	@FindBy(id="txtUserName")
	WebElement username;
	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement password;
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginbtn;
	@FindBy(xpath="//a[text()='Go to app']")
	WebElement  goToapp;
	@FindBy(xpath="//a[@id='logout_link']")
	WebElement  logoutbtn;
	
	public CommonMethods(WebDriver driver){
	      this.driver=driver;
	}
	

	
	 ResourceBundle bundle = ResourceBundle.getBundle("Config");	
	
	
	    public void LoginToSystem() {
	    
	    username.sendKeys(bundle.getString("user_name"));
	    
	    password.sendKeys(bundle.getString("user_password"));
		
		loginbtn.click();

	}
	
	public void GoToApplication() {
		goToapp.click();
		
	}	
	
	public void LogoutToSystem() {
		logoutbtn.click();

	}
           
	
	
	public boolean isVisible(WebDriver driver,WebElement element,int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
			return true;
		
	} 
	
	

}
