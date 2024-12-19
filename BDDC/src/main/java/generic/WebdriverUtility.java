package generic;
	import org.jspecify.annotations.Nullable;
	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;

	import hooks.BaseClass;

	public class WebdriverUtility {
	/**
	 * It is used to compare the actual title and expected title
	 * It will compare the partial entered expected title is present in the actual title
	 */
	WebDriver driver=BaseClass.driver;
	public void verifyTitle(String expectedTitle) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		String actualTitle = driver.getTitle();
		boolean res = actualTitle.contains(expectedTitle);
		Assert.assertTrue(res,expectedTitle+" is not matching with actual title");
	}
	}

