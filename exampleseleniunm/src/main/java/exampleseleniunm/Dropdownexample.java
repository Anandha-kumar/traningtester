package exampleseleniunm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownexample {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\java jdk\\chrome driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.amazon.in/");
		
		WebElement dropdown= d.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select select = new Select(dropdown);
		
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByVisibleText("Electronics");
		
		d.close();
		
	}

}
