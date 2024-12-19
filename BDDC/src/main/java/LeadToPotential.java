import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeadToPotential 
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//input[@value='New Lead']")).click();
		driver.findElement(By.xpath("//input[@name='property(Company)']")).sendKeys("QSpiders");
		driver.findElement(By.xpath("//input[@name='property(First Name)']")).sendKeys("Aditya");
		driver.findElement(By.xpath("//input[@name='property(Last Name)']")).sendKeys("Arun");
		WebElement status = driver.findElement(By.name("property(Lead Status)"));
		Select s = new Select(status);
		s.selectByIndex(3);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.findElement(By.name("Convert2")).click();
		driver.findElement(By.xpath("//img[@src='/crm/images/cal.gif']")).click();
		Set<String>allwid = driver.getWindowHandles();
		String date = driver.getWindowHandle();
		for(String d: allwid)
			driver.switchTo().window(d);
		driver.findElement(By.linkText("25")).click();
		driver.switchTo().window(date);
		WebElement stage = driver.findElement(By.id("probability"));
		Select st = new Select(stage);
		st.selectByIndex(10);
		driver.findElement(By.name("save")).click();
	}

}
