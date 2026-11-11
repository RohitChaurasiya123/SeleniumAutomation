package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.SignupPage;
import testBase.BaseClass;

public class SignupPageTest  extends BaseClass {

	SignupPage sp;
	
	@Test (groups = "Regression")
	void signupPage() throws InterruptedException {
		 sp = new SignupPage(driver);
		sp.signupLogo();
		sp.createNewAccount();
		sp.setUserName("Rohit");
		sp.emailId("rohit011@gmail.com");
		sp.password("Rohit123");
		sp.confirmPass("Rohit123");
		sp.firtsName("rohit");
		sp.lastName("test");
		sp.phoneNum("8392839282");
		sp.country("India");
		sp.city("Delhi");
		sp.address("new delhi");
		sp.state("Delhi");
		sp.postalCode("110043");
		sp.agreeCheckBox();
		sp.RegisterButton();
		sp.signupLogo1();
		sp.myAccount();
		sp.deleterBTN();
		sp.yesButton();
		String actualMessage = sp.successMessage();
		System.out.println("Success message: " + actualMessage);
		Assert.assertEquals(actualMessage, "Account deleted successfully");
		
		
	}

}
