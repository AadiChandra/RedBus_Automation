package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class A_Home extends Base{
	 public WebDriver driver;

	    public A_Home(WebDriver driver) {
	        this.driver = driver;
	    }
	    By Source = By.xpath("//input[contains(@id,'src')]");
		By Destination= By.xpath("//input[contains(@id,'dest')]");
		By Delhi= By.xpath("(//*[contains(text(),'Delhi')])[1]");
		By Lucknow = By.xpath("(//*[contains(text(),'Lucknow')])[1]");
		By RightArrow1 = By.xpath("//i[contains(@class,' right___90a032')]");

		public WebDriver getDriver() {
			return driver;
		}
		public void setDriver(WebDriver driver) {
			this.driver = driver;
		}
		public By getSource() {
			return Source;
		}
		public void setSource(By source) {
			Source = source;
		}
		public By getDestination() {
			return Destination;
		}
		public void setDestination(By destination) {
			Destination = destination;
		}
		public By getDelhi() {
			return Delhi;
		}
		public void setDelhi(By delhi) {
			Delhi = delhi;
		}
		public By getRightArrow() {
			return RightArrow1;
		}
		public void setRightArrow(By rightArrow) {
			RightArrow1 = rightArrow;
		}
		
		public By getLucknow() {
			return Lucknow;
		}
		By RightArrow = By.xpath("//i[contains(@class,' right___90a032')]");
		}
