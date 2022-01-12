import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Rozetka{
     WebDriver driver;

    // @BeforeMethod
     public void before(){
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
     }
     public void implicitWait(int seconds){
          driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
     }
     @Test
     public void url(){
          implicitWait(5);
          stranicaSaita();
          oknoNaVesEkran();
          poleVvoda();
          knopka();
     }

     private void knopka() {
          driver.findElement(By.xpath("//button[@ class=\"button button_color_green button_size_medium search-form__submit ng-star-inserted\"]")).click();
     }

     private void poleVvoda() {
          driver.findElement(By.xpath("//input")).sendKeys("phone xiaomi");
     }

     private void oknoNaVesEkran() {
          driver.manage().window().maximize();
     }

     private void stranicaSaita() {
          openUrl("https://rozetka.com.ua");

         // chromeDriver;
       //  WebDriverWait wait = new WebDriverWait(chromeDriver. 10);
       //  wait.until(ExpectedCondition.);


     }

    private void openUrl(String s) {
    }

    // @AfterMethod
    // public void after(){
    //      driver.quit();
    // }
}
