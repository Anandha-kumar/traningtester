package exampleseleniunm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragananddropexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\java jdk\\chrome driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.leafground.com/pages/drop.html");
		
		WebElement to = d.findElement(By.xpath("//div[@id='droppable']"));
		WebElement from = d.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions dragan =new  Actions(d);
		
		dragan.dragAndDrop(from, to).build().perform();
	}

}
