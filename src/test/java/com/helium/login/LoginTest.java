package com.helium.login;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/user/Documents/chromedriver");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://members.helium10.com/user/signin");

        driver.manage().window().maximize();

        Assert.assertEquals("Sign In", driver.getTitle());

        driver.findElement(By.id("loginform-email")).sendKeys("username");
        driver.findElement(By.id("loginform-password")).sendKeys("passwordincorrect");
        driver.findElement(By.className("btn-success")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("loginform-email")).clear();
        driver.findElement(By.id("loginform-password")).clear();

        driver.findElement(By.id("loginform-email")).sendKeys("onofrei_94@mail.ru");
        driver.findElement(By.id("loginform-password")).sendKeys("7051994a");

        driver.findElement(By.className("btn-success")).click();

    }


}
