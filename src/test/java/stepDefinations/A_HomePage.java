package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_HomePage extends Base {
	private static final Logger log = LogManager.getLogger(A_HomePage.class);
	//private static final Logger log = LogManager.getLogger(A_HomePage.class);
    
	
	@Given("User is on home page")
	public void user_is_on_home_page() throws Exception{
		log.info("Website initialised");
		getDriver().get(getUrl());
	}
	@When("user enters source and destination")
	public void user_enters_source_and_destination() throws Exception{
		log.info("User is entering source and destination");
		driver.findElement(By.xpath("//input[contains(@id,'src')]")).sendKeys("Delhi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(),'Delhi')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'dest')]")).sendKeys("Lucknow");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(),'Lucknow')])[1]")).click();
		Thread.sleep(1000);
	}
	@When("user select dates")
	public void user_select_dates()throws Exception {
		log.info("User is selecting date");
		driver.findElement(By.xpath("//div[contains(@class,'date')]")).click();
		Thread.sleep(3000);
		for(int i=1; i<=2; i++) {
			driver.findElement(By.xpath("//i[contains(@class,' right___90a032')]")).click();
			Thread.sleep(1000);
			}
			// selecting desired date
			driver.findElement(By.xpath("//span[text()='4']")).click();
			Thread.sleep(1000);
	}
	@Then("user sees all the available buses")
	public void user_sees_all_the_available_buses()throws Exception {
		log.info("All relevent buses fetched");
		driver.findElement(By.xpath("//button[contains(.,'Search')]")).click();
		Thread.sleep(1000);
	}

}











