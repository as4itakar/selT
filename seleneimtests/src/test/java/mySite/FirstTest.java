package mySite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void registration() {
        driver.get("http://localhost:8080/login");
        driver.findElement(By.cssSelector("[href=\"/registration\"]")).click();
        driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("pojiloy");
        driver.findElement(By.name("password")).sendKeys("borov");
        driver.findElement(By.xpath(".//input[@type='submit']")).click();

    }
    @Test
    public void signIn() {
        driver.get("http://localhost:8080/login");
        driver.findElement(By.id("text")).sendKeys("pojiloy");
        driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("borov");
        driver.findElement(By.xpath(".//input[@type='submit']")).click();
        driver.findElement(By.cssSelector("[href=\"/main\"]")).click();
    }
    @After
    public void close() {
        driver.quit();
    }
}
