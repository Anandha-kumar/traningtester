package testngtraning;

import org.testng.annotations.Test;

public class dependanciesmethod {
	
	@Test 
	public void firststandard() {
		System.out.println("first standard");
	}
	@Test(dependsOnMethods="firststandard")
	public void secondtstandard() {
		System.out.println("second standard");
	}
	@Test (enabled = false)
	public void thridtstandard() {
		System.out.println("third standard");
	}
	@Test (dependsOnMethods="thridtstandard")
	public void fourthstandard() {
		System.out.println("fourth standard");
	}
}
