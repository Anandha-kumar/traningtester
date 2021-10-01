package testngtraning;

import org.testng.annotations.Test;

public class groupingexample {
	@Test (groups={"audi"})
	public void adui7() {
		System.out.println("audi7 tested");
	}
	@Test (groups={"audi"})
	public void adui8() {
		System.out.println("audi8 tested");
	}
	@Test (groups={"bmw"})
	public void bmwxm() {
		System.out.println("xm tested");
	}
	@Test (groups={"bmw"})
	public void bmwy() {
		System.out.println("bmwy tested");
	}
	@Test (groups={"toyota"})
	public void toyotaxw() {
		System.out.println("toyota xw tested");
		
	}
	@Test (groups={"toyota"})
	public void toyotauv() {
		System.out.println("toyota uv tested");
	}
	
}
