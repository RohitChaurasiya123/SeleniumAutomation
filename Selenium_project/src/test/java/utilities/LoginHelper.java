
package utilities;

import org.openqa.selenium.WebDriver;
import pageObjects.SignInPage;

public class LoginHelper {

    private WebDriver driver;
    private SignInPage signInPage;

    public LoginHelper(WebDriver driver) {
        this.driver = driver;
        this.signInPage = new SignInPage(driver);
    }

    public void loginAsUser(String username, String password) throws InterruptedException {

        signInPage.signupLogo();

        signInPage.userName(username);

        signInPage.password(password);

        signInPage.checkbox();

        signInPage.signIn();
    }
}
