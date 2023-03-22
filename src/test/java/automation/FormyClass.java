package automation;

import java.time.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import static  org.junit.Assert.*;
import pages.ConfirmationPage;
import pages.FromPage;

public class FormyClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Bala\\Selenium\\ChromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String baseUrl = "https://formy-project.herokuapp.com/";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/li[14]/a")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
        option.click();

        FromPage fromPage = new FromPage();
        fromPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        driver.close();
        driver.quit();
    }
}
