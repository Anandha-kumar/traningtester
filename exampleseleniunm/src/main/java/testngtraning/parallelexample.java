package testngtraning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelexample {
	@Test
	public void google() {
		System.setProperty("webdriver.chrome.driver","E:\\java jdk\\chrome driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.close();
	}
	@Test
	public void yahoo() {
		System.setProperty("webdriver.chrome.driver","E:\\java jdk\\chrome driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://in.search.yahoo.com/");
        driver.close();
	}

}
