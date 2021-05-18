package org.test.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Divakar\\FrameworkProject2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void afterScenario() {
		System.out.println("Close the browser");
		driver.quit();
	}

}
