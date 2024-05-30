package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchAlibaba_Test {
  

		@Test
		public void flipkart()throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.alibaba.com/");
			Thread.sleep(2000);
			driver.quit();
			
		}}
	
