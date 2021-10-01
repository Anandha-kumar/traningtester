package exampleseleniunm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniunmstartingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver","E:\\java jdk\\chrome driver\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          
          System.setProperty("webdriver.gecko.driver","E:\\java jdk\\chrome driver\\chromedriver.exe");
          WebDriver driver1=new FirefoxDriver();
	}

}
