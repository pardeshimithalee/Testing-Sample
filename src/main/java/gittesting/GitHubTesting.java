package gittesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitHubTesting {
	
	protected WebDriver driver;
	@Test
	public void guru99tutorials() {
		WebDriver driver= new FirefoxDriver();
		String eTitle= "Meet Guru99";
		String aTitle= "";
		driver.get("http://www.guru99.com/");
		driver.manage().window().maximize();
		aTitle= driver.getTitle();
		
		if(aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.close();
		}
		
	}
	

