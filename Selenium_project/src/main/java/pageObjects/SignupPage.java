package pageObjects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
	public WebDriver driver;
	public SignupPage(WebDriver driver) {
	    this.driver = driver;
	}
	
	// locators
	By signupLogo= By.xpath("//a[@id='hrefUserIcon']//*[name()='svg']");
	By createNewAccount = By.xpath("//a[normalize-space()='CREATE NEW ACCOUNT']");
	By userName= By.xpath("//input[@name='usernameRegisterPage']");
    By emailId= By.xpath("//input[@name='emailRegisterPage']");
    By password= By.xpath("//input[@name='passwordRegisterPage']");
    By confirmPass= By.xpath("//input[@name='confirm_passwordRegisterPage']");
    By firtsName= By.xpath("//input[@name='first_nameRegisterPage']");
    By lastName= By.xpath("//input[@name='last_nameRegisterPage']");
    By phoneNum= By.xpath("//input[@name='phone_numberRegisterPage']");
    By country= By.xpath("//select[@name='countryListboxRegisterPage']");
    By city= By.xpath("//input[@name='cityRegisterPage']");
    By address= By.xpath("//input[@name='addressRegisterPage']");
    By state= By.xpath("//label[normalize-space()='State / Province / Region']");
    By postalCode= By.xpath("//input[@name='postal_codeRegisterPage']");
    By agreeCheckBox= By.xpath("(//input[@name='i_agree'])[1]");
    By RegisterButton= By.xpath("(//button[normalize-space()='REGISTER'])[1]");
    By signupLogo1= By.xpath("//a[@id='hrefUserIcon']//*[name()='svg']");
    By myAccount = By.xpath("//label[@role='link'][normalize-space()='My account']");
    By deleterBTN = By.xpath("(//div[@class='deleteBtnText'])[1]");
    By yesButton = By.xpath("//div[@class ='deletePopupBtn deleteRed']");
    By successMessage = By.xpath("//p[normalize-space()='Account deleted successfully']");
	
	// methods
    public void signupLogo() {
    	driver.findElement(signupLogo).click();
    }

    public void createNewAccount() throws InterruptedException {
    	Thread.sleep(2000);
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    	    // Wait until the loader disappears
    	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
    	            By.cssSelector("div.loader")));

    	    // Wait until the link is clickable
    	    WebElement element = wait.until(
    	            ExpectedConditions.elementToBeClickable(createNewAccount));

    	    element.click();
    }
    public void  setUserName(String username) {
    	
    	 driver.findElement(userName).sendKeys(username);
    }
    public void emailId(String email)  {
    	
    	driver.findElement(emailId).sendKeys(email);
    }
    public void  password(String pass) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(password).sendKeys(pass);
    }
    public void  confirmPass(String cpass) {
    	driver.findElement(confirmPass).sendKeys(cpass);
    }
    
    public void firtsName(String firstname) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(firtsName).sendKeys(firstname);
    }
    public void lastName(String lastname) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(lastName).sendKeys(lastname);
    }

    public void phoneNum(String num) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = wait.until(
            ExpectedConditions.elementToBeClickable(phoneNum)
        );

        element.click();
        element.sendKeys(num);
        wait.until(d -> !element.getAttribute("value").isEmpty());
        System.out.println("Entered phone number: " +
                element.getAttribute("value"));
    }
    public void country(String countryName) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(country).click();
    	 WebElement dropdown = driver.findElement(country);

    	    Select select = new Select(dropdown);
    	    select.selectByVisibleText(countryName);
    }
    public void city(String City) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(city).sendKeys(City);
    }
    public void address(String Address) {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(address));
	    Actions action = new Actions(driver);
	    action.moveToElement(element).click().sendKeys(Address).perform();
    	
    }
    public void state(String State) {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(state)  );
	    Actions action = new Actions(driver);
	    action.moveToElement(element).click().sendKeys(State).perform();
    	
    }
    public void postalCode(String postalcode)  {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(postalCode));
	    Actions action = new Actions(driver);
	    action.moveToElement(element).click().sendKeys(postalcode).perform();

    }
    public void agreeCheckBox() {
    	driver.findElement(agreeCheckBox).click();
    }
    public void RegisterButton()  {
    	
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         wait.until(ExpectedConditions.invisibilityOfElementLocated( By.cssSelector(".loader")));
         WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(RegisterButton));
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
         wait.until(ExpectedConditions.elementToBeClickable(RegisterButton)).click();
    }
    public void signupLogo1() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(signupLogo1).click();
    	
    }
    public void myAccount() {
    	
    	driver.findElement(myAccount).click();
    }
    public void deleterBTN() {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         wait.until(ExpectedConditions.invisibilityOfElementLocated( By.cssSelector(".loader")));
         WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(deleterBTN));
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
         wait.until(ExpectedConditions.elementToBeClickable(deleterBTN)).click();
    }
    public void yesButton() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(yesButton).click();
    }
    public String successMessage()  {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    	    WebElement message = wait.until(
    	        ExpectedConditions.visibilityOfElementLocated(successMessage)
    	    );

    	    return message.getText();
    }


}
