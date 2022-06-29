package org.company;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
	
	WebDriver driver;
	
	@Given("user Launches the Facebook url")
	public void user_Launches_the_Facebook_url() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	   
	}

	@When("user Enters the {string} and {string}")
	public void user_Enters_the_and(String username, String password) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		
	    
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.name("login")).click();
	   
	}

	@Then("user validates the successfull login")
	public void user_validates_the_successfull_login() throws InterruptedException {
		String title = driver.getTitle();
		boolean contains = title.contains("Facebook");
		Assert.assertTrue(contains);
		System.out.println("facebook is passed ");
		Thread.sleep(2000);
		driver.close();
	   
	}




}
