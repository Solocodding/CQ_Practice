package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        // WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        try{
            driver.manage().window().maximize();
            
            driver.get("https://codequotient.com");
            Thread.sleep(1000);

            WebElement loginButton = driver.findElement(By.xpath("//a[@href='/login']"));
            loginButton.click();

            Thread.sleep(1000);

            WebElement emailField =driver.findElement(By.name("email"));
            WebElement passwordField = driver.findElement(By.name("passowrd"));

            emailField.sendKeys("narenderkumar2972002@gmail.com");
            passwordField.sendKeys("20@Karnal");

            WebElement submitButton = driver.findElement(By.xpath("//button[text()='Login']"));
            submitButton.click();

            Thread.sleep(1000);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            driver.quit();
        }
    }
}
