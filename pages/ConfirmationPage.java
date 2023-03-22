package pages;

import java.time.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;


public class ConfirmationPage {
    public static void waitForAlertBanner(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }

    public static String getAlertBannerText(WebDriver driver){
        return driver.findElement(By.className("alert")).getText();
    }
}
