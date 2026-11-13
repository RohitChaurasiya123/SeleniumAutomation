package testBase;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public Logger logger;
    public static WebDriver driver;
    public Properties p;
    @BeforeClass(groups={"Sanity","Regression","Master","DataDriven"})
    @Parameters({"os", "browser"})
    public void setup(String os, String br) throws IOException {
    	FileReader file = new FileReader("./src//test//resources//config.properties");
    	p = new Properties();
    	p.load(file);
        logger = LogManager.getLogger(this.getClass());
        WebDriverManager.chromedriver().setup();
        switch (br.toLowerCase()) {
        case "chrome": driver = new ChromeDriver(); break;
        case "edge": driver = new EdgeDriver(); break;
        case "firefox": driver = new FirefoxDriver(); break;
        default: throw new IllegalArgumentException("Invalid browser name: " + br);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(p.getProperty("url"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='80%'");
    }
  
    public WebElement waitForElementVisible(By locator, int timeout) {
      WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    public String captureScreen(String tname) throws IOException {

        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        File folder = new File(System.getProperty("user.dir"), "screenShots");
        folder.mkdirs();
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = folder.getAbsolutePath() + File.separator + tname + "-" + timeStamp + ".png";
        java.nio.file.Files.copy(source.toPath(), new File(path).toPath());

        return path;
    }

    @AfterClass
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
