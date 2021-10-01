package testngtraning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationexample {
	@Test
	@Parameters("name")
	public void jeep(String name) {
		System.out.println("name is"+ name);
	}

}
