import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage 
{
	@FindBy(id = "userName")
	private WebElement uNtbx;
	@FindBy(id = "passWord")
	private WebElement pWtbx;
	@FindBy(xpath = "//input[@title='Sign In']")
	private WebElement SIbtn;
	@FindBy(linkText = "Potentials")
	private WebElement Potltb;
	@FindBy(xpath = "//input[@value='New Potential']")
	private WebElement NewPotltb;
	@FindBy(name = "property(Potential Name)")
	private WebElement PotlNmtbx;
	@FindBy(name = "property(Account Name)")
	private WebElement AccNmtbx;
	@FindBy(name = "property(Closing Date)")
	private WebElement ClsDttbx;
	@FindBy(name = "property(Stage)")
	private WebElement Stglbx;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement Savebtn;
	@FindBy(name = "Delete2")
	private WebElement Delbtn;
	@FindBy(linkText = "Recycle Bin")
	private WebElement Recbnicn;
	@FindBy(xpath = "(//td[@class='tabledata'][3])[last()]")
	private WebElement DelPtl;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getName() 
	{
		return uNtbx;
	}
	public WebElement getpWd() 
	{
		return pWtbx;
	}
	public WebElement getSignIn() 
	{
		return SIbtn;
	}

	public WebElement getPotl() 
	{
		return Potltb;
	}

	public WebElement getNewPotl() 
	{
		return NewPotltb;
	}

	public WebElement getPotlName() 
	{
		return PotlNmtbx;
	}

	public WebElement getAccName() 
	{
		return AccNmtbx;
	}

	public WebElement getDelPtl() 
	{
		return DelPtl;
	}

	public WebElement getClsDate() 
	{
		return ClsDttbx;
	}

	public WebElement getStage() 
	{
		return Stglbx;
	}

	public WebElement getSave() 
	{
		return Savebtn;
	}

	public WebElement getDelete() 
	{
		return Delbtn;
	}

	public WebElement getRecbin() 
	{
		return Recbnicn;
	}
}


