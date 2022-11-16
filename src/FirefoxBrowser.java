import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {

    public static void main(String[] args) {

        //1. Setup firefox browser
        String baseURL = "https://www.saucedemo.com/";
        System.setProperty("Webdriver.firefox.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //2. Open URL
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        //3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("page title is" + title);

        //4. Print the current ur
        System.out.println("Current URl :" + driver.getCurrentUrl());

        //5. Print the page source
        System.out.println("page source : " + driver.getPageSource());


        //6. Enter the email to email field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("kishan_0204@yahoo.co.in");


        //7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("123456");

        //8. Close the browser
        driver.quit();


    }
}
