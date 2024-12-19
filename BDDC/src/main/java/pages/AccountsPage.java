package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage 
{
	@FindBy(xpath ="(//td[@class='tableData'])[4]")
	private WebElement potentialStage;


	public AccountsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPotentialStage() 
	{
		return potentialStage;
	}
}
