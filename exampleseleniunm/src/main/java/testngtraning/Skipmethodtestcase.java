package testngtraning;

import org.testng.annotations.Test;

public class Skipmethodtestcase {
	private static final boolean fales = false;
	@Test(priority=0)
	public void jeep() {
		System.out.println("jeep method run");
	}
	@Test(priority=1)
	public void bmw() {
		System.out.println("bmw method run");
	}
	@Test(priority=2)
	public void audi() {
		System.out.println("audi method run");
	}
	@Test(priority=3)
	public void tvs() {
		System.out.println("tvs method run");
	}
	@Test(priority=4,enabled= fales)
	public void honda() {
		System.out.println("honda method run");
	}
}
