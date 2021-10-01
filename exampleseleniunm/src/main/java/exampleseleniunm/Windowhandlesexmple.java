package exampleseleniunm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Windowhandlesexmple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\java jdk\\chrome driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("http://www.leafground.com/pages/Window.html");
		
		String currentwindow=d.getWindowHandle();
		
		WebElement button1 = d.findElement(By.xpath("//button[normalize-space()='Open Home Page']"));
		button1.click();
		
		Set<String> childwindow=d.getWindowHandles();
		
		for (String newwindow : childwindow) {
			d.switchTo().window(newwindow);
			
		}
		
		WebElement images=d.findElement(By.xpath("//a[@href='pages/Button.html']"));
		images.click();
		Thread.sleep(3000);
		d.close();
		
		
}

}
