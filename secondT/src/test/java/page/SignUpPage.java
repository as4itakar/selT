package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class SignUpPage {

    WebDriver driver;
    @FindBy(id = "text")
    WebElement login;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(how = How.XPATH, using = ".//input[@type='submit']")
    WebElement button;

    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }


    public void signUp() {
        driver.get("http://localhost:8080/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login.sendKeys("pojiloy");
        password.sendKeys("borov");
        button.click();
    }

}