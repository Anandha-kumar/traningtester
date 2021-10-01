package exampleseleniunm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolltipexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\java jdk\\chrome driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement name=d.findElement(By.id("age"));
		
		String tooltip=name.getAttribute("title");
		System.out.println(tooltip);
	}

}
