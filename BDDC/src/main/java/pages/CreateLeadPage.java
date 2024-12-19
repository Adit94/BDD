package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage 
{
	@FindBy(name ="property(Company)")
	private WebElement companyTbx;
	@FindBy(name ="property(First Name)")
	private WebElement firstNameTbx;
	@FindBy(name ="property(Last Name)")
	private WebElement lastNameTbx;
	@FindBy(name ="property(Lead Status)")
	private WebElement leadStatusDropdown;
	@FindBy(xpath ="//input[@value='Save']")
	private WebElement SaveBtn;

	public CreateLeadPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCompanyTbx() 
	{
		return companyTbx;
	}

	public WebElement getFirstNameTbx() 
	{
		return firstNameTbx;
	}

	public WebElement getLastNameTbx() 
	{
		return lastNameTbx;
	}

	public WebElement getStatusDropdown() 
	{
		return leadStatusDropdown;
	}

	public WebElement getSaveBtn() 
	{
		return SaveBtn;
	}

}
