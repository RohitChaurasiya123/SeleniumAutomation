package testCases;
import org.testng.annotations.Test;
import pageObjects.SignInPage;
import testBase.BaseClass;

public class SignInPageTest extends BaseClass{
 public SignInPage lp;
 @Test(groups ={"Sanity","Regression"})

 void signIn() throws InterruptedException {
	 lp = new SignInPage(driver);
	 lp.signupLogo();
	 lp.userName("Test123");
	 lp.password("Rohit123");
	 lp.checkbox();
	 lp.signIn();
 }
}
