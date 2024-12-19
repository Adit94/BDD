package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecycleBinPage {
	@FindBy(xpath ="(//td[@class='tableData'][3])[last()]")
	private WebElement lastPotential;
	@FindBy(partialLinkText = "Logout")
	private WebElement logoutLink;
	@FindBy(linkText ="Next")
	private WebElement nextLink;
	public RecycleBinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setNext() {
		nextLink.click();
	}
	public void setLogout() {
		logoutLink.click();
	}
	public WebElement getLastPotential() {
		return lastPotential;
	}
	
}
