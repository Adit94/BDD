import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LostLead 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.44.128:8080/crm/ShowHomePage.do");		
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//input[@value='New Lead']")).click();
		driver.findElement(By.xpath("//input[@name='property(Company)']")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@name='property(First Name)']")).sendKeys("Vignesh");
		driver.findElement(By.xpath("//input[@name='property(Last Name)']")).sendKeys("S");
		WebElement status = driver.findElement(By.name("property(Lead Status)"));
		Select s = new Select(status);
		s.selectByValue("Lost Lead");
		//WebElement st = s.getFirstSelectedOption();
		//System.out.println(st.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		String leadstatus = driver.findElement(By.xpath("//span[text()='Lost Lead']")).getText();
		System.out.println(leadstatus);
		
		
	}

}
