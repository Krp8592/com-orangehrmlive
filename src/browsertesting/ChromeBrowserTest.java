package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the Url into Browser
        driver.get(baseUrl);
        //Maximize the Browser
        driver.manage().window().maximize();
        //We give Implicit wait to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the Title of the Page
        String title = driver.getTitle();
        System.out.println(title);

        //Get the current Url
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the username field element and type the username into the username field
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Find the password field element and type the password into the password field
        driver.findElement(By.name("password")).sendKeys("admin123");

        //Close the Browser
        driver.close();
    }
}
