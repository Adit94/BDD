package stepdefinitions;

import java.util.Set;

import org.openqa.selenium.By;
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
import pages.AccountsPage;
import pages.ConvertLeadPage;
import pages.CreateLeadPage;
import pages.HomePage;
import pages.LeadDetailsPage;
import pages.LeadsPage;

public class ConvertLeadToPotentialClosure 
{
	WebDriver driver=BaseClass.driver;
	WebdriverUtility w=new WebdriverUtility();
	CreateLeadPage c;
	
	
	@Given("User is present in homepage")
	public void user_is_present_in_homepage() 
	{
		w.verifyTitle("Home Page");
		System.out.println();
	}
	@When("he click on Leads")
	public void he_click_on_leads() 
	{
		HomePage h=new HomePage(driver);
		h.setLead(); 
	}
	@Then("Leads page must be displayed")
	public void leads_page_must_be_displayed() 
	{
		w.verifyTitle("View Details");
	}
	@When("he click on New Lead")
	public void he_click_on_new_lead() 
	{
		LeadsPage p=new LeadsPage(driver);
		p.setNewLead(); 
	}
	@Then("Create Lead page must be displayed")
	public void create_lead_page_must_be_displayed() 
	{
		w.verifyTitle("Create Lead");
	}
	@And("He enter the Company name as {string}")
	public void he_enter_the_company_name_as(String name) 
	{
		c=new CreateLeadPage(driver);
		c.getCompanyTbx().sendKeys(name);
	}
	@And("He enter the First Name as {string}")
	public void he_enter_the_first_name_as(String FirstName) 
	{
		c.getFirstNameTbx().sendKeys(FirstName);
	}
	@And("He enter the Last Name as {string}")
	public void he_enter_the_last_name_as(String LastName) 
	{
	    c.getLastNameTbx().sendKeys(LastName);
	}
	@And("he selects option in the dropdown")
	public void he_selects_option_in_the_dropdown() 
	{
		WebElement status = c.getStatusDropdown();
		Select s=new Select(status);
		s.selectByIndex(3);
	}
	@When("he click on Save button")
	public void he_click_on_save_button() 
	{
		c.getSaveBtn().click();
	}
	@Then("Lead Details page must be displayed")
	public void lead_details_page_must_be_displayed() 
	{
		w.verifyTitle("Lead Details");
	}
	@When("he clicks on Convert button")
	public void he_clicks_on_convert_button() 
	{
		LeadDetailsPage l=new LeadDetailsPage(driver);
		l.getConvert().click();
	}
	@Then("Convert Lead page should be displayed")
	public void convert_lead_page_should_be_displayed() 
	{
		w.verifyTitle("Leads Conversion");
	}
	@When("he handles the calender popup")
	public void he_handles_the_calender_popup() 
	{
		ConvertLeadPage C =new ConvertLeadPage(driver);
		C.getCalender().click();
		Set<String>allwid = driver.getWindowHandles();
		String date = driver.getWindowHandle();
		for(String d: allwid)
			driver.switchTo().window(d);
		C.getDate().click();
		driver.switchTo().window(date);
	}
	@And("he select option in the dropdown")
	public void he_select_option_in_the_dropdown() 
	{
		ConvertLeadPage C =new ConvertLeadPage(driver);
		C.getStage().click();
		WebElement stage = driver.findElement(By.id("probability"));
		Select st = new Select(stage);
		st.selectByIndex(10);
		
	}
	@And("he clicks Save button")
	public void he_clicks_save_button() 
	{
		ConvertLeadPage C =new ConvertLeadPage(driver);
		C.getSaveBtn().click();

	}
	@Then("Potential stage {string} should be displayed in Account Details page")
	public void potential_stage_should_be_displayed_in_account_details_page(String potentialStage) 
	{
		AccountsPage a = new AccountsPage(driver);
		String Stage = a.getPotentialStage().getText();
		Assert.assertEquals(Stage, potentialStage,"The potential is not present in the Account Details page");
	}
}
