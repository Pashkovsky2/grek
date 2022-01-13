import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ViborGoroda {
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
    public void checkURL(){
        implicitWait(5);
        glavnaStranica();
        vsplivausheOkno();
        poiscGorodov();
        knopkaNaitiGorod();

       // Assert.assertTrue(vsplivausheOkno());
        //driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
    }

    private void knopkaNaitiGorod() {
        driver.findElement(By.xpath("//a[@id=\"find-restaurants\"]")).click();
    }

    private void poiscGorodov() {
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Boston");
    }
    private void vsplivausheOkno() {
        driver.findElement(By.xpath("//button[@class=\"btn\"]")).click();

    }
    private void glavnaStranica() {
        driver.get("https://qa2.eatstreet.com");
    }

   // @AfterMethod
   // public void after(){
        //driver.quit();

   // }


}
