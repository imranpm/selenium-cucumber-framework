package com.assignment.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.assignment.wait.WaitTypes;

public class RegistrationPom {
	
	
	private WebDriver driver; 
	private WebElement element; 
	
	private WaitTypes waitTypes; 
	
	// the parametric constructor to load the driver 
	public RegistrationPom(WebDriver driver) {
		this.driver = driver; 
		this.waitTypes = new WaitTypes(driver); 
	}

	// firstname
	// this can be taken from .properties files 
	public void firstname() {
		element = driver.findElement(By.id("registration_firstname"));
		element.sendKeys("PM");
		
		
	}
	
	
	
	public void Lastname() {
		element = driver.findElement(By.id("registration_lastname"));
		element.sendKeys("imran");
	}
	
	public void email() {
		element = driver.findElement(By.id("registration_email"));
		element.sendKeys("pmimran@gmail.com");
		
	}
	
	
	
	public void username() {
		int r = (int) (Math.random() * 500.0D);
		if (r <= 10) {
			r += 11;
			System.out.println(r);
		}
		WebElement element = driver
				.findElement(By.id("username"));

		element.sendKeys(new CharSequence[] { String.valueOf(r) });
		//element = driver.findElement(By.id("username"));
		//element.sendKeys("final20145amm");
		
	}
	
	
	public void Pass() {
		element = driver.findElement(By.id("pass1"));
		element.sendKeys("123");
		
	}
	
	
	public void Pass2() {
		element = driver.findElement(By.id("pass2"));
		element.sendKeys("123");
		
	}
	
	public void clickregisted() {
		element = driver.findElement(By.id("registration_submit"));
		element.click();
		
	}
	
	
	public void validatemessage() {
		WebElement actual = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]"));
		  //actual.getText();
		  String actualText =actual.getText();
		  System.out.println("actaul string "   +actualText);

		  String expectedtext = "Your personal settings have been registered";
	      System.out.println("Expected string is: " +expectedtext);
	      if (actualText.contains(expectedtext)){
	    	  
	    	  System.out.println("Testcase pass");
	    	  
	      }
		  
	      else {
	    	  
	    	  System.out.println("Testcase fail");  
	      }
		
	}
	
	public void clickingonlogo() {
		element = driver.findElement(By.xpath(".//img[@src='http://elearningm1.upskills.in/main/img/icons/32/unknown.png']"));
		element.click();
		
	}
	
	public void verifyingemailandname() {
		
		String emailtxt = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/p")).getText();
	      System.out.println(emailtxt);
	      String expectedemail="pmimran@gmail.com";
	      System.out.println("Expected string is: " +expectedemail);
	         if (emailtxt.contains(expectedemail))
	         {
	         System.out.println("Email id is present which user entered --->Test case pass");    
	         }
	         else
	         {
	             System.out.println("Email id is not present which user entered --->Test case failed");
	        
	         
	         }
		
	}
	
	public void clikingonhome() {
		element = driver.findElement(By.linkText("Homepage"));
		element.click();
		
	}
	public void clikingcompose() {
		element = driver.findElement(By.linkText("Compose"));
		element.click();
		
	}
	
}
