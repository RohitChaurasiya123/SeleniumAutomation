package pageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
			}	
	By mainLogo= By.xpath("(//a[@role ='link'])[13]");
	By ourProduct = By.xpath("(//a[@role ='link'])[12]");
	By specialOffer = By.xpath("(//a[@role ='link'])[11]");
	By popularItem = By.xpath("(//a[@role ='link'])[10]");
	By ContactUs = By.xpath("(//a[@role ='link'])[9]");
	By searchbox = By.xpath("(//*[name()='svg'][@id='menuSearch'])[1]");
	By enterInSearchBox = By.xpath("(//input[@id='autoComplete'])[1]");
	By searchCanceleIcon = By.xpath("(//img[@src='../../css/images/closeDark.png'])[1]");
	By backToHomePage= By.xpath("(//a[@role ='link'])[13]");
	By speakers = By.xpath("(//span[@id='speakersTxt'])[1]");
	By clickLaptop = By.xpath("//span[@id='laptopsTxt']");
	By clickOnProduct = By.xpath("//a[normalize-space()='HP Chromebook 14 G1(ENERGY STAR)']");
	By laptopModelText = By.xpath("(//h1[@class='roboto-regular screen768 ng-binding'])[1]");
	By AddTOCart  = By.xpath("(//button[normalize-space()='ADD TO CART'])[1]");
	By mainLogo1= By.xpath("(//a[@role ='link'])[13]");
	By headphones = By.xpath("(//span[@id='headphonesTxt'])[1]");
	By specialOfferText = By.xpath("(//h3[normalize-space()='SPECIAL OFFER'])[1]");
	By contactUsText = By.xpath("//h1[normalize-space()='CONTACT US']");
    By selectCategories= By.xpath("(//select[@name='categoryListboxContactUs'])[1]");
    By selectHeadphes = By.xpath("//option[@label='Headphones']");
    By selectProducDrop =  By.xpath("//select[@name='productListboxContactUs']");
    By selectProduct = By.xpath("//option[@label='Beats Studio 2 Over-Ear Matte Black Headphones']");
    By enterEmailId = By.xpath("(//input[@name='emailContactUs'])[1]");
    By enterText = By.xpath("//textarea[@name='subjectTextareaContactUs']");
    By sendBtn = By.xpath("(//button[normalize-space()='SEND'])[1]");
    By successfullMessage = By.xpath("//p[@class='roboto-regular successMessage ng-binding']");
    By followUstext = By.xpath("//h3[normalize-space()='FOLLOW US']");
    
    
    
    public void  mainLogo() {
    	driver.findElement(mainLogo).getText();
    }
    public void  ourProduct() {
    	driver.findElement(ourProduct).getText();
    }
    public void  specialOffer() {
    	driver.findElement(specialOffer).getText();
    }
    public void  popularItem() {
    	driver.findElement(mainLogo).getText();
    }
    public void  ContactUs() {
    	driver.findElement(mainLogo).getText();
    }
    public void  searchbox() {
    	driver.findElement(searchbox).click();
    }
    public void  enterInSearchBox(String text) {
    	driver.findElement(enterInSearchBox).sendKeys(text);
    }

    public void  searchCanceleIcon() throws InterruptedException {
    	Thread.sleep(3000);
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(searchCanceleIcon));
	    Actions action = new Actions(driver);
	    action.moveToElement(element).click().perform();
    	
    }

    public void  speakers() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(speakers));
	    Actions action = new Actions(driver);
	    action.moveToElement(element).perform();
	    String text = element.getText();
	    System.out.println("speaker text : "+ text);
    	
    }
    public void  clickLaptop () throws InterruptedException {
    	Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(clickLaptop));
	    Actions action = new Actions(driver);
	    action.moveToElement(element).click().perform();
    	
    }
    public void clickOnProduct () {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(clickOnProduct));
	    Actions action = new Actions(driver);
	    action.moveToElement(element).click().perform();
    	
    }
    public void laptopModelText() throws InterruptedException {
    	Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(laptopModelText));
	    Actions action = new Actions(driver);
	    action.moveToElement(element).perform();
	    String text = element.getText();
	    System.out.println("laptopModel Text : "+ text);
    	
    }
    public void  AddTOCart() {
    	driver.findElement(AddTOCart ).click();
    	  	  	
    }
    public void  mainLogo1() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(mainLogo1).click();
    }
      
    public void  headphones () {
    	driver.findElement(headphones ).getText();
    }
    public void  specialOfferText() {
    	driver.findElement(specialOfferText).getText();
    }
    public void  contactUsText() {
    	driver.findElement(contactUsText).getText();
    }
    public void  selectCategories() {
    	driver.findElement(selectCategories).click();
    }
    public void  selectHeadphes() {
    	driver.findElement(selectHeadphes).click();
    }
    
    public void  selectProducDrop() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(selectProducDrop).click();
    }
    public void  enterEmailId(String email) {
    	driver.findElement(enterEmailId).sendKeys(email);
    }
    public void   enterText(String text) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(enterText).sendKeys(text);
    }
    public void  sendBtn() {
    	driver.findElement(sendBtn).click();
    }
    public void successfullMessage() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(successfullMessage));
        String message = element.getText();
        System.out.println("Contact us submit message: " + message);
    }
    
    public void  followUstext() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(followUstext));
	    Actions action = new Actions(driver);
	    action.moveToElement(element).perform();
	    String text = element.getText();
	    System.out.println("laptopModel Text : "+ text);
    	
    }
    
    
   
      
    
}
