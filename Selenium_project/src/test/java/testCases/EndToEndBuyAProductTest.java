package testCases;

import org.testng.annotations.Test;
import pageObjects.EndToEndBuyAProduct;
import testBase.BaseClass;

public class EndToEndBuyAProductTest extends BaseClass {
	
	  EndToEndBuyAProduct bp;
	  
	  @Test
	 void  verifyBuyProduct() throws InterruptedException{
		  
		  bp = new  EndToEndBuyAProduct(driver);
		  bp.clickLaptop();
		  bp.clickOnProduct();
		  bp.laptopModelText();
		  bp.AddTOCart();
		  bp.clickOnCart();
		  bp.checkOut();
		  bp.shippingPageNextBtn();
		  bp.safePayUsername("Rohit123");
		  bp.safePayPassword("Rohit123");
		  bp.payBtn();
		  bp.successMessage();
		  bp.trackingIdAndOrderNum();
		  
	  }
	  
	  
	
	
	
}

