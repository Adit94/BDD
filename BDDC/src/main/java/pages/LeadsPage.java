package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage 
{
	@FindBy(xpath ="//input[@value='New Lead']")
	private WebElement newLeadsBtn;

	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setNewLead() {
		newLeadsBtn.click();
	}
}
