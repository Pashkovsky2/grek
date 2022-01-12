
    

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing extends TestInit {

        @Test
        public void Clickable(){
            navigateQa2EatStreet();
            openFullScreen();
            getCloseCookiesWarning().click();
            getLinkCity().click();
            getFood().click();

            Assert.assertTrue(getTextDisp());
        }

        @Test
        public void Visibility(){
            navigateQa2EatStreet();
            openFullScreen();
            getCloseCookiesWarning().click();
            getLink().click();

            Assert.assertTrue(getBtnText());
        }


        @Test
        public void testFooter(){
            navigateQa2EatStreet();
            openFullScreen();
            getCloseCookiesWarning().click();
            getLinkBlog().click();
            number();
            Assert.assertEquals(driver.getWindowHandles().size(),2);
        }

        @Test
        public void checkTextInUrl(){
            navigateQa2EatStreet();
            openFullScreen();
            getCloseCookiesWarning().click();
            getRestauran().click();

            Assert.assertTrue(explicitWaitUrlContains());
        }



        @Test
        public void TextPrivacy(){
            navigateQa2EatStreet();
            openFullScreen();
            getCloseCookiesWarning().click();
            getPrivacy().click();

            Assert.assertTrue(explicitWaitTitleContains());
        }

        private WebElement getPrivacy() {
            return driver.findElement(By.xpath("//a[@ui-sref='privacy']"));
        }


        private WebElement getRestauran() {
            return driver.findElement(By.xpath("//a[@ng-click='linkToDashboardSupport()']"));
        }

        private WebElement getLinkBlog() {
            return driver.findElement(By.xpath("//a[text()='Blog']"));
        }

        private WebElement getLinkSportsAndHobbies() {
            return driver.findElement(By.xpath("//a[text()='Спорт и увлечения' and @class='menu-categories__link']"));
        }

        private void navigateRozetkaUa() {
            openUrl("https://rozetka.com.ua/");
        }

        private boolean getBtnText() {
            return explicitWaitLocated("//a[@href=\"/get-the-app\"]").isDisplayed();
        }

        private WebElement getLink() {
            return explicitWaitLocated("//a[text()='Get The App']");
        }

        private boolean getTextDisp() {
            return explicitWaitClickable("//a[@class=\"btn btn--orange btn-text-link full-width ng-binding\"]").isDisplayed();
        }

        private WebElement getFood() {
            return explicitWaitClickable("//button[contains(text(),'Asian Food')]");
        }

        private WebElement getLinkCity() {
            return driver.findElement(By.xpath("//a[text()='Omaha, NE']"));
        }

        private WebElement getCloseCookiesWarning() {
            return driver.findElement(By.xpath("//button[@class='btn']"));
        }

        private void navigateQa2EatStreet() {
            openUrl("https://qa2.eatstreet.com/");
        }
    }

