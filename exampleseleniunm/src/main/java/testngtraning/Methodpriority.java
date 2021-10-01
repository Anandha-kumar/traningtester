package testngtraning;

import org.testng.annotations.Test;

public class Methodpriority {
	
	@Test(priority=0)
	public void anandh() {
		System.out.println("anandh run");
	}
	@Test(priority=1)
	public void anandh1() {
		System.out.println("anandh1 run");
	}
	@Test(priority=2)
	public void anandh2() {
		System.out.println("anandh2 run");
	}
	@Test(priority=3)
	public void anandh3() {
		System.out.println("anandh3 run");
	}
}
