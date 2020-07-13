package com.assignment.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.assignment.util.Sleep;
import com.assignment.wait.WaitTypes;

// will not have information on which browser this has to be 
// executed, the selenium script should give the browser information 

public class SignupPOM {
	private WebDriver driver; 
	private WebElement element; 
	
	private WaitTypes waitTypes; 
	
	// the parametric constructor to load the driver 
	public SignupPOM(WebDriver driver) {
		this.driver = driver; 
		this.waitTypes = new WaitTypes(driver); 
	}

	// Signupbutton
	// this can be taken from .properties files 
	public void clickSignupbutton() {
		element = driver.findElement(By.linkText("Sign up!"));
		element.click();
	}

	
	
	
}
