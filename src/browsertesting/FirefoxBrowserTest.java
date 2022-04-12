package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current URL = " + driver.getCurrentUrl());
        String loginUrl ="https://www.saucedemo.com/";

        driver.navigate().to(loginUrl);
        System.out.println("Current URL = " +driver.getCurrentUrl());


        System.out.println(driver.getPageSource());
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("Admin");

        WebElement passwordlField = driver.findElement(By.name("password"));
        passwordlField.sendKeys("admin123");
        driver.close();
    }
    }

