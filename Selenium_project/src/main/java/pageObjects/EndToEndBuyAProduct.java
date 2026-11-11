package pageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

     public class EndToEndBuyAProduct {
	         public WebDriver driver;
	           public EndToEndBuyAProduct(WebDriver driver){
		             this.driver = driver;
	                  } 
	
	        By clickLaptop = By.xpath("//span[@id='laptopsTxt']");
	       	By clickOnProduct = By.xpath("//a[normalize-space()='HP Chromebook 14 G1(ENERGY STAR)']");
	       	By laptopModelText = By.xpath("(//h1[@class='roboto-regular screen768 ng-binding'])[1]");
	       	By AddTOCart  = By.xpath("(//button[normalize-space()='ADD TO CART'])[1]");
	        By clickOnCart = By.xpath("//a[@id='shoppingCartLink']//*[name()='svg']");
	        By checkOut= By.xpath("(//button[@id='checkOutButton'])[1]");
	        By shippingPageNextBtn = By.xpath("(//button[@id='next_btn'])[1]");
	        By safePayUsername = By.xpath("//input[@name='safepay_username']");
	        By safePayPassword = By.xpath("//input[@name='safepay_password']");
	        By payBtn = By.xpath("//sec-sender[@id='payNowSPDrtv' or sec-send ='payNow_SafePay()']");
	        By successMessage = By.xpath("(//span[@class='roboto-regular ng-scope'])[1]");
	        By trackingIdAndOrderNum = By.xpath("//p[@class='roboto-regular ng-binding']");
	        
	    public void  clickLaptop() {
	    	driver.findElement(clickLaptop).click();
	    }
	    public void clickOnProduct() {
	    	driver.findElement(clickOnProduct).click();
	    }
	    public void  laptopModelText() {
	    String element =	driver.findElement(laptopModelText).getText();
	    System.out.println("product text : " + element);
	    }
	    public void  AddTOCart() {
	    	driver.findElement(AddTOCart).click();
	    }
	    public void  clickOnCart() throws InterruptedException {
	    	Thread.sleep(3000);
	    	driver.findElement(clickOnCart).click();
	    }
	    public void  checkOut() {
	    	driver.findElement(checkOut).click();
	    }
	    public void  shippingPageNextBtn() {
	    	driver.findElement(shippingPageNextBtn).click();
	    }
	    public void  safePayUsername(String username) {
	    	driver.findElement(safePayUsername).clear();
	    	driver.findElement(safePayUsername).sendKeys(username);
	    }
	    public void  safePayPassword(String password) {
	    	driver.findElement(safePayPassword).clear();
	    	driver.findElement(safePayPassword).sendKeys(password);
	    }
	    public void payBtn() {
	        WebDriverWait wait =
	            new WebDriverWait(driver, Duration.ofSeconds(15));

	        wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.cssSelector("div.loader")
	        ));

	        WebElement element = wait.until(
	            ExpectedConditions.elementToBeClickable(payBtn)
	        );

	        System.out.println("Button text: " + element.getText());

	        String oldUrl = driver.getCurrentUrl();

	        element.click();

	        try {
	            wait.until(ExpectedConditions.or(
	                ExpectedConditions.urlToBe(oldUrl) == null
	                    ? ExpectedConditions.urlToBe(oldUrl)
	                    : ExpectedConditions.urlToBe(oldUrl)
	            ));
	        } catch (Exception e) {
	            System.out.println("Current URL: " + driver.getCurrentUrl());
	        }
	    }
	    public void  successMessage() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(successMessage));
		    Actions action = new Actions(driver);
		    action.moveToElement(element).click().perform();
		    String Message = element.getText();
		    System.out.println("Success message : "+ Message);
	    }
	    public void  trackingIdAndOrderNum() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(trackingIdAndOrderNum));
		    Actions action = new Actions(driver);
		    action.moveToElement(element).click().perform();
		    String trckingAndOrderID = element.getText();
		    System.out.println(" trcking id And Order ID : "+  trckingAndOrderID);
	    }
	    
	

}
