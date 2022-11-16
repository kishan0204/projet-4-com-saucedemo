import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {

    static String browser = "Edge";
    static String baseURl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        //1. Setup chrome browser
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("Webdriver.Chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("Webdriver.Firefox.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("Webdriver.Edge.driver","drivers/msedgedriver.exe" );
            driver = new EdgeDriver();
        }else {
            System.out.println("wrong browser name");
        }

        // 2.launch the url
        driver.get(baseURl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        //3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("page title is" + title);

        //4. Print the current url
        System.out.println("Current URL" + driver.getCurrentUrl());

        //5. Print the page source
        System.out.println("page source" + driver.getPageSource());

        //6. Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("kishan_0204@yahoo.co.in");


        //7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("123456");

        //8. Close the browser


    }
}
