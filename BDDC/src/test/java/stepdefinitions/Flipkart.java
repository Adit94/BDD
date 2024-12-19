package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Flipkart {
	WebDriver driver;
@Given("user is present in flipkart homepage")
public void user_is_present_in_flipkart_homepage() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
}

@When("he searches for mobiles")
public void he_searches_for_mobiles() {
	driver.findElement(By.name("q")).sendKeys("Mobiles"+Keys.ENTER);
}

@Then("the products should be displayed")
public void the_products_should_be_displayed() {
	System.out.println(driver.getTitle());
}
}