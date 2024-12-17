package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import generic.WebdriverUtility;
import hooks.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreatePotentialPage;
import pages.HomePage;
import pages.PotentialDetailsPage;
import pages.PotentialsPage;
import pages.RecycleBinPage;
public class AddAndDeletePotential {
	WebDriver driver=BaseClass.driver;
	WebdriverUtility w=new WebdriverUtility();
	CreatePotentialPage c;
	@Given("User should be present in homepage")
	public void user_should_be_present_in_homepage() {
		w.verifyTitle("Home Page");
		System.out.println();
	}@When("he clicks on potential")
	public void he_clicks_on_potential() {
		HomePage h=new HomePage(driver);
		h.setPotential();
	}@Then("Potential Page should be displayed")
	public void potential_page_should_be_displayed() {
		w.verifyTitle("View Details");
	}@When("he clicks on new Potential")
	public void he_clicks_on_new_potential() {
		PotentialsPage p=new PotentialsPage(driver);
		p.setNewPotential();
	}@Then("New Potential Page should be displayed")
	public void new_potential_page_should_be_displayed() {
		w.verifyTitle("Create Potential");
	}@When("He enters the potential name as {string}")
	public void he_enters_the_potential_name_as(String potentialName) {
		c=new CreatePotentialPage(driver);
		c.getPotentialNameTbx().sendKeys(potentialName);;
	}@And("He enters the account name as {string}")
	public void he_enters_the_account_name_as(String accName) {
		c.getAccNameTbx().sendKeys(accName);
	}@And("he enters the closing date as {string}")
	public void he_enters_the_closing_date_as(String closingDate) {
		c.getClosingDateTbx().sendKeys(closingDate);
	}@And("he select an option in the dropdown")
	public void he_select_an_option_in_the_dropdown() {
		WebElement stage = c.getStageDropdown();
		Select s=new Select(stage);
		s.selectByIndex(7);
	}@And("he clicks on save button")
	public void he_clicks_on_save_button() {
		c.getSaveBtn().click();
	}@Then("Potential details page should be displayed")
	public void potential_details_page_should_be_displayed() {
		w.verifyTitle("Potential Details");
	}@When("he clicks on delete button")
	public void he_clicks_on_delete_button() {
		PotentialDetailsPage d=new PotentialDetailsPage(driver);
		d.setDelete();
	}@And("Handles the alert popup")
	public void handles_the_alert_popup() {
		driver.switchTo().alert().accept();
	}@And("he clicks on recycle bin link")
	public void he_clicks_on_recycle_bin_link() {
		PotentialDetailsPage d=new PotentialDetailsPage(driver);
		d.getRecycleBinLink().click();
	}@Then("recycle bin page should be displayed")
	public void recycle_bin_page_should_be_displayed() {
		w.verifyTitle("Recycle Bin");
	}@When("he clicks on nect next button")
	public void he_clicks_on_nect_next_button() {
		RecycleBinPage r=new RecycleBinPage(driver);
		r.setNext();
	}	@Then("the deleted potential {string} should be displayed")
	public void the_deleted_potential_should_be_displayed(String lastPotential) {
		RecycleBinPage r=new RecycleBinPage(driver);
		String lastPotentialName = r.getLastPotential().getText();
		Assert.assertEquals(lastPotentialName, lastPotential,"The potential is not present in the recycle bin");
	}	
}