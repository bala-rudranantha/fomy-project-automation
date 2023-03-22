package pages;

import java.time.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class FromPage {
    public static void submitForm(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
        driver.findElement(By.id("first-name")).sendKeys("Bala");

        driver.findElement(By.id("last-name")).sendKeys("Test");

        driver.findElement(By.id("job-title")).sendKeys("QA");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='4']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("03/21/2023");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
