package com.assignment.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.assignment.util.Sleep;
import com.assignment.wait.WaitTypes;

// will not have information on which browser this has to be 
// executed, the selenium script should give the browser information 

public class Composemessage {
	private WebDriver driver;
	private WebElement element;

	private WaitTypes waitTypes;

	// the parametric constructor to load the driver
	public Composemessage(WebDriver driver) {
		this.driver = driver;
		this.waitTypes = new WaitTypes(driver);
	}

	public void Sendto() throws InterruptedException  {
		
		//driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("ravi1234567S");  
		driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("pmimran@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys(Keys.ENTER);
        
	}

	public void Subject() {
		element = driver.findElement(By.id("compose_message_title"));
		element.sendKeys("CASESTUDY");

	}

	public void Message() throws InterruptedException {
		 Thread.sleep(5000);
		 driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);
         Thread.sleep(2000);
         driver.switchTo().frame(0);
         System.out.println("reached frame");
         
         driver.findElement(By.xpath("/html/body")).sendKeys("Hello Mr. Sunil \n" + "    This is for TestMail \n" + "\n" + "From,"+ "\n"+ "PMimran");
         
         Thread.sleep(4000);
         driver.switchTo().defaultContent();
       
   
	}
	public void clicksendmessage() {
		element = driver.findElement(By.id("compose_message_compose"));
		element.click();

	}
	
public void verifyingemailack() {
		
	String emailack = driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/div[1]")).getText();
    System.out.println(emailack);
    String expectedemailack = "The message has been sent to";
    System.out.println("Expected string is: " +expectedemailack);
       if (emailack.contains(expectedemailack))
       {
       System.out.println("Email is sent --->Test case pass");    
       }
       else
       {
           System.out.println("Email not sent --->Test case failed");
      
       
       }
	
}
	
}
