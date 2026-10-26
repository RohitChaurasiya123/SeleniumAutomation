package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	public WebDriver driver;
	public SignInPage (WebDriver driver) {
	    this.driver = driver;
	}
	
	By signupLogo= By.xpath("//a[@id='hrefUserIcon']//*[name()='svg']");
	By userName = By.xpath("(//input[@name='username'])[1]");
	By password = By.xpath("(//input[@name='password'])[1]");
	By checkbox = By.xpath("//input[@name='remember_me']");
	By signIn = By.xpath("(//button[normalize-space()='SIGN IN'])[1]");
	
	public void signupLogo() {
		driver.findElement(signupLogo).click();
	}
	public void userName(String user) {
		driver.findElement(userName).sendKeys(user);
	}
	public void password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void checkbox() {
		driver.findElement(checkbox).click();
	}
	public void signIn() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(signIn).click();
	}

}
