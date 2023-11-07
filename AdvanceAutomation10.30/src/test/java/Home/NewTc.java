package Home;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class NewTc extends BaseClass {
	@Test
	public void demo() {
		driver.navigate().to("https://www.instagram.com");
	}
}
