import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAndDeletePotential 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.44.128:8080/crm/ShowHomePage.do");		
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		driver.findElement(By.linkText("Potentials")).click();
		driver.findElement(By.xpath("//input[@value='New Potential']")).click();
		driver.findElement(By.name("property(Potential Name)")).sendKeys("Anything");
		driver.findElement(By.name("property(Account Name)")).sendKeys("Google");
		driver.findElement(By.name("property(Closing Date)")).sendKeys("12/25/2024");
		WebElement stage = driver.findElement(By.name("property(Stage)"));
		Select s = new Select(stage);
		s.selectByIndex(7);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.findElement(By.name("Delete2")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Recycle Bin")).click();
		String DeletedPotential = driver.findElement(By.xpath("(//td[@class='tabledata'][3])[last()]")).getText();
		System.out.println(DeletedPotential);
	}
}
