package testBase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    protected WebDriver driver;
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(15));
        // Reduce browser zoom to 80%
        driver.get("https://advantageonlineshopping.com/");
     // Reduce browser zoom to 80%
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='80%';");
        
        signInVerify();
    }
    public void signInVerify() {

       // signupLogo= 
        		driver.findElement(By.xpath("//a[@id='hrefUserIcon']//*[name()='svg']")).click();
    	//By userName = 
    			driver.findElement(By.xpath("(//input[@name='username'])[1]")).sendKeys("Test123");
    	//By password =
    			driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("Rohit123");
//    	//By checkbox = 
//    			driver.findElement(By.xpath("//input[@name='remember_me']")).click();
    	//By signIn = 
    			driver.findElement(By.xpath("(//button[normalize-space()='SIGN IN'])[1]")).click();
    }
    
    
    

   
}