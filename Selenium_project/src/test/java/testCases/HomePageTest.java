package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class HomePageTest extends BaseClass{
	
	HomePage hp;
	@Test(groups = {"Sanity","Regression"})
	void HomePageVerify() throws InterruptedException {
		hp = new HomePage(driver);
		hp.mainLogo();
		hp.ourProduct();
		hp.specialOffer();
		hp.popularItem();
		hp.ContactUs();
		hp.searchbox();
		hp.enterInSearchBox("Headphones");
		hp.searchCanceleIcon();
		hp.speakers();
		hp.clickLaptop ();
		hp.clickOnProduct();
		hp.laptopModelText();
		hp.AddTOCart();
		hp.mainLogo1();
		hp.headphones();
		hp.specialOfferText();
		hp.contactUsText();
		hp.selectCategories();
		hp.selectHeadphes();
		hp.selectProducDrop();
		hp.enterEmailId("rohit0202@gmail.com");
		hp.enterText("buy this product");
		hp.sendBtn();
		hp.successfullMessage();
		hp.followUstext();
		
	}
}
