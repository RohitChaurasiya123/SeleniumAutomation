package testCases;

import org.testng.annotations.Test;
import pageObjects.EndToEndBuyAProduct;
import testBase.BaseClass;

public class EndToEndBuyAProductTest extends BaseClass {
	
	  EndToEndBuyAProduct bp;
	  
	  @Test(groups = {"Sanity","Regression"})
	 void  verifyBuyProduct() throws InterruptedException{
		  logger.info("***** Starting  Test  ****");
		  bp = new EndToEndBuyAProduct(driver);
		  logger.info("clicking on laptop");
		  bp.clickLaptop();
		  bp.clickOnProduct();
		  bp.laptopModelText();
		  logger.info("add to cart");
		  bp.AddTOCart();
		  bp.clickOnCart();
		  logger.info("checkout");
		  bp.checkOut();
		  bp.shippingPageNextBtn();
		  bp.safePayUsername("Rohit123");
		  bp.safePayPassword("Rohit123");
		  bp.payBtn();
		  logger.info("***** Ending  Test  ****");
		 
		  
	  }	
	
}

