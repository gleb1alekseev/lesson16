package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleAppTest {
    // 1. Open browser site http://www.uitestingplayground.com/sampleapp
    // 2. Enter any non-empty user name and `pwd` as password
    // 3. Click on 'log in' button

    @Test
    public void SampleAppLoginTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/sampleapp");
        driver.findElement(By.name("UserName")).sendKeys("Gleb");
        driver.findElement(By.name("Password")).sendKeys("pwd");
        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

        String expectedResult = "Welcome, Gleb!";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"loginstatus\"]")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}