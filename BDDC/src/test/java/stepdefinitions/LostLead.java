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
import pages.CreateLeadPage;
import pages.CreatePotentialPage;
import pages.HomePage;
import pages.LeadDetailsPage;
import pages.LeadsPage;
import pages.PotentialsPage;
import pages.RecycleBinPage;

public class LostLead 
{
	WebDriver driver=BaseClass.driver;
	WebdriverUtility w=new WebdriverUtility();
	CreateLeadPage c;
	
	@Given("User must be present in homepage")
	public void user_must_be_present_in_homepage() 
	{
		w.verifyTitle("Home Page");
		System.out.println();
	}
	
	@When("he clicks on Leads")
	public void he_clicks_on_leads() 
	{
		HomePage h=new HomePage(driver);
		h.setLead();
	}

	@Then("Leads page should be displayed")
	public void leads_page_should_be_displayed() 
	{
		w.verifyTitle("View Details");
	}

	@When("he clicks on New Lead")
	public void he_clicks_on_new_lead() 
	{
		LeadsPage p=new LeadsPage(driver);
		p.setNewLead();
	}

	@Then("Create Lead page should be displayed")
	public void create_lead_page_should_be_displayed() 
	{
		w.verifyTitle("Create Lead");
	}

	@When("He enters the Company name as {string}")
	public void he_enters_the_company_name_as(String name) 
	{
		c=new CreateLeadPage(driver);
		c.getCompanyTbx().sendKeys(name);
	}

	@And("He enters the First Name as {string}")
	public void he_enters_the_first_name_as(String FirstName) 
	{
		c.getFirstNameTbx().sendKeys(FirstName);
	}

	@And("He enters the Last Name as {string}")
	public void he_enters_the_last_name_as(String LastName) 
	{
	    c.getLastNameTbx().sendKeys(LastName);

	}

	@And("he selects an option in the dropdown")
	public void he_selects_an_option_in_the_dropdown() {
		WebElement status = c.getStatusDropdown();
		Select s=new Select(status);
		s.selectByValue("Lost Lead");
	}
	
	@When("he clicks on Save button")
	public void he_clicks_on_save_button() 
	{
		c.getSaveBtn().click();
	}

	@Then("Lead Details page should be displayed")
	public void lead_details_page_should_be_displayed() 
	{
		w.verifyTitle("Lead Details");
	}

	@And("Lead Status {string} should be displayed")
	public void lead_status_should_be_displayed(String leadStatus) 
	{
		LeadDetailsPage l=new LeadDetailsPage(driver);
		String LeadStatus = l.getLeadStatus().getText();
		Assert.assertEquals(LeadStatus, leadStatus,"The lead status is not displayed in the page");
		System.out.println(LeadStatus);
	}

}
