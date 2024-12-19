package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PotentialsPage {
	@FindBy(xpath ="//input[@value='New Potential']")
	private WebElement newPotentialBtn;
	
	public PotentialsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setNewPotential() {
		newPotentialBtn.click();
	}
}
