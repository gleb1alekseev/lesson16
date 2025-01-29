package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuAppTest {
    // 1. Open browser site https://the-internet.herokuapp.com/login
    // 2. Enter tomsmith for the username and SuperSecretPassword! for the password
    // 3. Click on 'login' button

    @Test
    public void herokuLoginTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();

    }
}