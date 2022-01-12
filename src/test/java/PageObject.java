import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.menu;

public class PageObject {

    WebDriver driver;

    @BeforeMethod
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void implicitWait(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
    @Test
    public void checkLoginUrl() {
        implicitWait(5);
        glavnayStranyca();
        clicSignIn();
        clicEmail();
        zapolnitEmail();
        clicPassword();
        Assert.assertEquals(getURL(),"https://qa2.eatstreet.com/signin");
    }
    private String getURL() {
        return driver.getCurrentUrl();
    }

    @Test
    public void checkSigninButton() {
        glavnayStranyca();
        clicSignIn();
        clicEmail();
        zapolnitEmail();
        clicPassword();
        signinIsDisplayed();
        Assert.assertTrue(signinIsDisplayed());
    }

    private boolean signinIsDisplayed() {
       return driver.findElement(By.xpath("//button[@id='signin']")).isDisplayed();
    }

    private void glavnayStranyca() {
        driver.get("https://qa2.eatstreet.com");
    }

    private void zapolnitEmail() {
        driver.findElement(By.xpath("//input")).sendKeys("grekos@ukr.net");
    }

    private void clicPassword() {
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Qq19791983");
    }

    private void clicEmail() {
        driver.findElement(By.xpath("//input[@id=\"email\"]")).click();
    }

    private void clicSignIn() {
        driver.findElement(By.xpath("//a[@id=\"menu-signin\"]")).click();
    }

   // @AfterMethod
  //  public void after(){
   //     driver.quit();
    //}
}
