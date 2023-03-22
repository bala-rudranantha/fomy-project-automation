package automation;
import java.time.*;
import java.util.*;
import java.util.concurrent.*;

import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

public class TestClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Bala\\Selenium\\ChromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver=new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String baseUrl = "https://turbotax.intuit.com/personal-taxes/online/";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();

        //Thread.sleep(1000);

   /*     String defaultHandle = driver.getWindowHandle();
        for (String winhandle: driver.getWindowHandles()) {
            driver.switchTo().window(winhandle);
            System.out.println("Window Switch");
            Thread.sleep(2000);

            driver.findElement(By.className("cgmt-modal__header-close")).click();

        }*/

        Thread.sleep(5000);
        driver.findElement(By.className("cgmt-modal__header-close")).click();
        System.out.println(driver.getTitle().toString());
        Thread.sleep(3000);
        driver.findElement(By.name("have-job")).click();
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }


    public void closePopUpWindowsByClassName(String[] classNames){

    }
}
