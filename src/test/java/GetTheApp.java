import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GetTheApp {
    WebDriver driver;

    @BeforeMethod
    public void Before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    public void implicitWait(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    @Test
    public void chekUrl(){
        implicitWait(5);
        naVesEkran();
        glavnayStranica();
        vsplivatelBaton();
        perehodVapp();
        polePhoneNamber();
        knopkaOk();
    }

    private void naVesEkran() {
        driver.manage().window().maximize();
    }

    private void knopkaOk() {
        driver.findElement(By.xpath("//a[@class=\"btn btn--orange btn-text-link full-width ng-binding\"]")).click();
    }

    private void polePhoneNamber() {

        driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("+380987687676");
    }

    private void perehodVapp() {

        driver.findElement(By.xpath("//a[@href=\"/get-the-app\"]")).click();
    }

    private void vsplivatelBaton() {

        driver.findElement(By.xpath("//button[@class='btn']")).click();
    }

    private void glavnayStranica() {
        driver.get("https://eatstreet.com");
    }

  //  @AfterMethod
  //  public void after(){
        // driver.quit();
   // }
}
