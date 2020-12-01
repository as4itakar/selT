package page;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.settings;

public class SignUp extends settings {


    WebDriver driver;

    @Test
    public void signUp(){
    SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
    signUpPage.signUp();
    }
}