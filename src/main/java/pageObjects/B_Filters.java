package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.Base;

public class B_Filters extends Base {
    
    public WebDriver driver;
    
    public B_Filters(WebDriver driver) {
        this.driver = driver;
    }

    By AC = By.xpath("//*[contains(@aria-label,'AC')]");
    By FC = By.xpath("//*[contains(@aria-label,'Free Cancellation')]");
    By Sleeper = By.xpath("//*[contains(@aria-label,'SLEEPER')]");
    By Price = By.xpath("/html/body/div[1]/div[3]/div/div/div[4]/fieldset/div/div[3]/div");
    public By getPrice() {
		return Price;
	}

	public void setPrice(By price) {
		Price = price;
	}

	public WebDriver getDriver() {
        return driver;
    }

    public By getAC() { return AC; }
    public void setAC(By aC) { AC = aC; }

    public By getFC() { return FC; }
    public void setFC(By fC) { FC = fC; }

    public By getSleeper() { return Sleeper; }
    public void setSleeper(By sleeper) { Sleeper = sleeper; }
}