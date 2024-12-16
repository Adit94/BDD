package hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	public static WebDriver driver;
	@Before(order=0)
public void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://192.168.61.129:8080/crm/ShowHomePage.do");
	System.out.println("openBrowser");
}
	@Before(order=1)
public void login() {
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@title='Sign In']")).click();
	System.out.println("login");
}
	@After(order=1)
public void logout() {
	driver.findElement(By.partialLinkText("Logout")).click();
	System.out.println("logout");
}
	@After(order=0)
public void closeBrowser() {
	driver.quit();
	System.out.println("closeBrowser");
}
}
