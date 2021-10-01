package testngtraning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	public class Suitexample {
	@Test
	public void google() {
		System.setProperty("webdriver.chrome.driver","E:\\java jdk\\chrome driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.close();
	}
	@Test
	public void yahoo() {
	
	System.setProperty("webdriver.chrome.driver","E:\\java jdk\\chrome driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://in.yahoo.com//");
	d.close();
		
	}

}
