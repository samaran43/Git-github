package loginPage;

import org.testng.annotations.Test;
import configs.setupDetails;

public class VerifyLoginScreen extends setupDetails {

	
	@Test
	public void TGG_001()
	{
		driver.get("https://testtgg.goodgrid.com");
	}
	
}
