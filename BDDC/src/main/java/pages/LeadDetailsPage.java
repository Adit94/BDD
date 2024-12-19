package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadDetailsPage 
{
	@FindBy(xpath = "//span[text()='Lost Lead']")
	private WebElement leadStatus;

	@FindBy(name = "Convert2")
	private WebElement ConvertBtn;
	
	public LeadDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getLeadStatus() {
		return leadStatus;
	}
	public WebElement getConvert() {
		return ConvertBtn;
	}
}
