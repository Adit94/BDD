package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePotentialPage {
	@FindBy(name ="property(Potential Name)")
	private WebElement potentialNameTbx;
	@FindBy(name ="property(Account Name)")
	private WebElement accNameTbx;
	@FindBy(name ="property(Closing Date)")
	private WebElement closingDateTbx;
	@FindBy(name ="property(Stage)")
	private WebElement stageDropdown;
	@FindBy(xpath ="//input[@value='Save']")
	private WebElement saveBtn;
	public CreatePotentialPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getPotentialNameTbx() {
		return potentialNameTbx;
	}
	public WebElement getAccNameTbx() {
		return accNameTbx;
	}
	public WebElement getClosingDateTbx() {
		return closingDateTbx;
	}
	public WebElement getStageDropdown() {
		return stageDropdown;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
}
