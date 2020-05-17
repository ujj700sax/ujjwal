package com.qa.test.StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;

public class Login_StepDefination {
	
	
	WebDriver driver;
	
	@Given("^I am on Achieve Int environment$")
	public void I_am_on_Achieve_Environment() {
		System.out.println("Starting Chrome driver");
		System.setProperty("webdriver.chrome.driver","/Users/qainfotech/Downloads/chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://int-achieve-courseware-frontend.mldev.cloud/courses/9p934q/search");
		 driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
		
		 
	} 
			
	@And("^I want Title of page$")	
	public void I_want_Title_of_page() {
		String title=driver.getTitle();
		System.out.println("Get title of page :" + " " + title);

	}
  
	@When("^I provide \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_provide_username_and_Password(String username,String password)
	{
		 System.out.println("User logged-in");
		 WebDriverWait wait = new WebDriverWait(driver, 20 );
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"username\"]")));

		 driver.findElement(By.xpath("//input[@id=\"username\"]")).click();
		 System.out.println("User puts the username");
		 driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
		 System.out.println("User puts the Password");

         driver.findElement(By.xpath("//button[@id=\"signin\"]")).click();
		 System.out.println("User logged-in");

	}
        
      @Then("^I lands on Homepage of Achieve Media processeor$")   
       public void I_lands_on_Homepage_of_Achieve_Media_processeor() {   
    	  
 	 WebDriverWait wait = new WebDriverWait(driver, 20 );
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Let's get started!\"]"))); 
     Assert.assertEquals("Let's get started!", driver.findElement(By.xpath("//span[text()=\"Let's get started!\"]")).getText());
   	 String title = driver.getTitle();
   	 System.out.println(title);
      
   	 
}
      
     @Then("^I close the browser$") 
     public void I_close_the_browser() {
    	 driver.close();
    	 
    	driver.quit();
    	System.out.println("Browser Closed");
    	 
     }
}		


