package org.company;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotelBook {
	
	WebDriver driver;
	


	@Given("Open the Adactin Website")
	public void open_the_Adactin_Website() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
	   
	}
	@When("Enter the Username")
	public void enter_the_Username() {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("sarathkumar347");
	    
		
	}
	   

	@And("Enter the Password")
	public void enter_the_Password() {
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("Krish@1234");
	    
	}

	@And("Click the Login button")
	public void click_the_Login_button() {
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
	    
		
	}
	   

	@Then("User validates the Hotel booking Successfull Login")
	public void user_validates_the_Hotel_booking_Successfull_Login() {
		String title = driver.getTitle();
		boolean contains = title.contains("Adactin");
		Assert.assertTrue(contains);
		System.out.println("Adactin hotel open");
	    
	    
	}

	@And("select the location")
	public void select_the_location() {
		WebElement location = driver.findElement(By.name("location"));
		Select select = new Select(location);
		select.selectByVisibleText("Melbourne");
		
	  
	}

	@And("select the Hotels")
	public void select_the_Hotels() {
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select select =new Select(hotels);
		select.selectByVisibleText("Hotel Sunshine");
	   
	}

	@And("select the Roomtype")
	public void select_the_Roomtype() {
		WebElement roomtype = driver.findElement(By.name("room_type"));
		Select select = new Select(roomtype);
		select.selectByVisibleText("Double");
	    
	}

	@And("select the number of rooms")
	public void select_the_number_of_rooms() {
		WebElement numberrooms = driver.findElement(By.id("room_nos"));
		Select select = new Select(numberrooms);
		select.selectByIndex(4);
	    
	   
	}

	@Then("select the check in date")
	public void select_the_check_in_date() {
		WebElement datecheckin = driver.findElement(By.id("datepick_in"));
		datecheckin.sendKeys("20/06/2022");
		
	   
	}

	@Then("select the checkout date")
	public void select_the_checkout_date() {
		WebElement checkoutdate = driver.findElement(By.name("datepick_out"));
		checkoutdate.sendKeys("21/06/2022");
		
	}
	    

	@And("select the Adults as per room")
	public void select_the_Adults_as_per_room() {
		WebElement adultroom = driver.findElement(By.name("adult_room"));
		Select select = new Select(adultroom);
		select.selectByValue("3");
	   
	}

	@And("select the children per room")
	public void select_the_children_per_room() {
		WebElement childrenroom = driver.findElement(By.id("child_room"));
		Select select = new Select(childrenroom);
		select.selectByIndex(2);
	   
	}

	@Then("select the search")
	public void select_the_search() {
		WebElement searchhotel = driver.findElement(By.id("Submit"));
		searchhotel.click();
	   
	}
	
	@And("click the select button")
	public void click_the_select_button() {
		driver.findElement(By.id("radiobutton_0")).click();
	    
	}

	@And("click the continue button")
	public void click_the_continue_button() {
		driver.findElement(By.name("continue")).click();
	    
	}

	@When("Enter the First name")
	public void enter_the_First_name() {
		driver.findElement(By.name("first_name")).sendKeys("sarath");
	   
	}

	@When("Enter the Last name")
	public void enter_the_Last_name() {
		driver.findElement(By.id("last_name")).sendKeys("kumar");
	   
	}

	@When("Enter the Billing address")
	public void enter_the_Billing_address() {
		driver.findElement(By.name("address")).sendKeys("chennai tambaram 10001");
	    
	}

	@When("Enter the Credit card number")
	public void enter_the_Credit_card_number() {
		driver.findElement(By.id("cc_num")).sendKeys("3567891234512345");
	   
	}

	@And("select the credit card type")
	public void select_the_credit_card_type() {
		WebElement creditcardtype = driver.findElement(By.name("cc_type"));
		Select select = new Select(creditcardtype);
		select.selectByVisibleText("American Express");
	    
	}

	@And("select the Month")
	public void select_the_Month() {
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Select select = new Select(month);
		select.selectByIndex(7);
	   
	}

	@And("select the Year")
	public void select_the_Year() {
		WebElement selectyear = driver.findElement(By.id("cc_exp_year"));
		Select select = new Select(selectyear);
		select.selectByValue("2022");
	    
	}

	@And("Enter the CVV Number")
	public void enter_the_CVV_Number() {
		driver.findElement(By.name("cc_cvv")).sendKeys("546");
	    
	}

	@Then("click the Booking now button")
	public void click_the_Booking_now_button() {
		driver.findElement(By.name("book_now")).click();
	    
	}

	
	   
	}








