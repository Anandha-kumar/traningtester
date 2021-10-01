package exampleseleniunm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.TreeBasedTable;

public class Alertboxexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\java jdk\\chrome driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		
		
		d.findElement(By.xpath("//input[@id='txt_unam']")).sendKeys("sylix");
		
		d.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("anandh");
		
		d.findElement(By.cssSelector("#Button3")).click();
		
		//d.switchTo().alert().accept();
		
		d.switchTo().alert().dismiss();

}
}