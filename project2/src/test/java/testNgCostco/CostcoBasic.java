package testNgCostco;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CostcoBasic {
	
	@Test
	public void Costco() {
		
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.costco.com/");
		
		
	}

}
