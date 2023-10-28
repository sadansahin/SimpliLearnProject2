package simplilearnSecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class project2 {

	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//sadansahin//Downloads//chromedriver-mac-arm64//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.costco.com/CheckoutCartDisplayView?catalogId=10701&storeId=10301&langId=-1&krypto=maEhM0hRq0Za5AUMiSa2lLIb2ioz13A1imG3uY%2BypEsTWulle5W4w56u4DWmGpF07zFcWc544KI0TN2I%2F85PeRawqJQ8ZdT7tmBzTTZ4%2Fi7Z77oqJ0y4zyXrJWGuUxNvLMVPY%2FgB%2BARjkGAeV508nc07e5Ver4lkd75tiGPLQ7PE%2B3HWdPLJfRgb7iR4yA5TysMIq0X1yT9YaMtd7WKhtygTF9A%2FdjqGyFEv%2BQg2n03BTASv8i23zObRAvT%2F64La4rygR5A2fIdsteMQpmDw8OYCIkPMkAEYUqZYeM6c2Y1eCNOtAww7dJfhYzQP9dRUefpZVEiRFc7hGf3eBC1johc%2B36FsXcfTAr0NAzueIlpny9f%2F3J73cVrb4e%2FR%2BsTgXKvuF3Qaka7u2KFFhe4a71WBgssUw8xehuAwBtLcJFBOniQg5noFExeYbzgP94A6n0NUgIH7h9GAqczGSJDqWYpnPHWZl6LUtd%2ByPpurIaO3%2BvHkcj1fQ2X4Tat5JSspzJGgJtd6zuu38PCDD%2FkQdpDlVHcTORAtxxjBhDe6wCrwCl%2BAUyFq3Pe7uvldgPHxjbn9Zp7eyfxZdcDi3z%2BvQcD1Thuen%2F4p%2BLWflgLsuHKOmjVDmSZzKIs2EiOUftdSzUo8RRrw8sK60an%2Bx7Cygsb5Fr7E3rWfKJ1p17523RVZa%2BQfEaYd%2Fn%2F3E%2FUoyTClEzGeqbSgBd7xTJXaM9Vq4%2BCCStDa891%2Bc6VFtDvNxFWB7zrv2bCI6XOW6yukL3z6dovck3dq8wvs8baxtEt6InVkB1EiK0E82ut7ecQiWC7UhIABQcZVoB3wHfebKd3L7p%2Bn1iMbogxRrjPnqyWi6g%3D%3D&ddkey=http%3ACheckoutCartView");
		
		//working with mause class
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='cart-d']"))).build().perform();
	

		

	}

}
