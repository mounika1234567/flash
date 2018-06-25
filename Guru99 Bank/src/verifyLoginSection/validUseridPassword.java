package verifyLoginSection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validUseridPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//launch the application
		driver.get("http://www.demo.guru99.com/V4/");
		
		//verify the application
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//enter valid userid and password
		driver.findElement(By.name("uid")).sendKeys("mngr139341");
		driver.findElement(By.name("password")).sendKeys("UhyzezY");
		
		//click login
		driver.findElement(By.cssSelector("[name='btnLogin']")).click();
		
	}
}