package stepDefinations;

import base.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pageObjects.B_Filters;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;


public class B_FiltersPrice extends Base {
	private static final Logger log = LogManager.getLogger(B_FiltersPrice.class);
    B_Filters filtersPage;

      
    
    
    @Given("User is viewing all buses")
    public void user_is_viewing_all_buses() throws Exception {
    	log.info("User is viewing buses right now");
        String currentUrl = getDriver().getCurrentUrl();
        System.out.println(currentUrl);
        if(!currentUrl.contains("bus-tickets")) {
        	getDriver().get(getUrl());
        	Thread.sleep(2000);
        }
        else {
        	Thread.sleep(2000);
        }
        
        Thread.sleep(3000);
    }

    @When("user apply AC filter")
    public void user_apply_ac_filter() throws InterruptedException {
    	log.info("User is applying filter");
        filtersPage = new B_Filters(getDriver());
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        ((org.openqa.selenium.JavascriptExecutor)getDriver()).executeScript("window.scrollBy(0, 300)");
        Thread.sleep(3000);
        WebElement ac = wait.until(
            ExpectedConditions.elementToBeClickable(filtersPage.getAC())
        );
        ac.click();
        Thread.sleep(2000);
    }

    @When("user also select Free Cancelation")
    public void user_also_select_free_cancelation() throws Exception {
    	log.info("User applied free cancelation");
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement fc = wait.until(
            ExpectedConditions.elementToBeClickable(filtersPage.getFC())
        );
        fc.click();
        Thread.sleep(2000);
    }

    @When("user also selects sleeper filter")
    public void user_also_selects_sleeper_filter() throws Exception {
      	log.info("User applied sleeper filter");
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement sleeper = wait.until(
            ExpectedConditions.elementToBeClickable(filtersPage.getSleeper())
        );
        sleeper.click();
        Thread.sleep(2000);
    }

    @Then("user sees all the available buses under these filters")
    public void user_sees_all_the_available_buses_under_these_filters() throws InterruptedException {
        Thread.sleep(2000);
    	List<WebElement> buses = getDriver().findElements(
            By.className("srpList__ind-search-styles-module-scss-EOdde"));
        Thread.sleep(2000);
        
        System.out.println(buses.size());
        Assert.assertTrue(buses.size() > 0, "No buses found after filters!");
        Thread.sleep(2000);
    }

    @When("user sort by price")
    public void user_sort_by_price() throws InterruptedException {
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));

        // Scroll to top where sort bar is visible
        ((org.openqa.selenium.JavascriptExecutor) getDriver())
            .executeScript("window.scrollTo(0, 0)");
        Thread.sleep(1000);

        WebElement sortPrice = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div[1]/div[3]/div/div/div[4]/fieldset/div/div[3]/div")
            )
        );
        Thread.sleep(3000);
        ((org.openqa.selenium.JavascriptExecutor) getDriver())
            .executeScript("arguments[0].click();", sortPrice);
            // JS click used instead of normal click
            // because element may be partially hidden
        
        Thread.sleep(2000);
    }
        

    @Then("user gets buses in sorted price")
    public void user_gets_buses_in_sorted_price() {
    	
//        List<WebElement> prices = getDriver().findElements(
//            By.className("finalFare")
//        );
//        System.out.println(prices.size());
//        Assert.assertTrue(prices.size() > 0, "Prices not visible!");
//    }
}
}
//}