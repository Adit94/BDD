package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConvertLeadPage 
{
	@FindBy(xpath = "//img[@src='/crm/images/cal.gif']")
	private WebElement CalIcon;

	@FindBy(linkText = "25")
	private WebElement Date;

	@FindBy(id = "probability")
	private WebElement PotentialStage;
	
	@FindBy(name ="save")
	private WebElement SaveBtn;

	public ConvertLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getCalender() {
		return CalIcon;
	}
	public WebElement getDate() {
		return Date;
	}
	public WebElement getStage() {
		return PotentialStage;
	}
	public WebElement getSaveBtn() 
	{
		return SaveBtn;
	}
}


