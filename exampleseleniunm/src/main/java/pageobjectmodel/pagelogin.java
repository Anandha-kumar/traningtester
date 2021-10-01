package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pagelogin {
         public static WebElement txt_unam;
         public static WebElement txt_pass;
         public static WebElement Button3;
    @Test     
	public void login() {
		 System.setProperty("webdriver.chrome.driver","E:\\java jdk\\chrome driver\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
			PageFactory.initElements(d,pagelogin.class);
			
			txt_unam.sendKeys("sylix");
			txt_pass.sendKeys("admin");
			Button3.click();
	}
}
