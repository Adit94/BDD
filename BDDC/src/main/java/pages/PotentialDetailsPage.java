package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PotentialDetailsPage {
	@FindBy(name ="Delete2")
	private WebElement deleteBtn;
	@FindBy(linkText ="Recycle Bin")
	private WebElement recycleBinLink;
	public PotentialDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setDelete() {
		deleteBtn.click();
	}
	public WebElement getRecycleBinLink() {
		return recycleBinLink;
	}
}
