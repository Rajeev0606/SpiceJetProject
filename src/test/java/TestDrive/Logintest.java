package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.Loginpage;


public class Logintest extends Baseclass {

	@Test
	public void Login() {

		Loginpage login = new Loginpage(driver);
		login.Login("rajeevraj@gmail.com", "Rajeevraj@");
	}
}
