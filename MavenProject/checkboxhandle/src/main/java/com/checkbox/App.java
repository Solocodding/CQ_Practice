package com.checkbox;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;

public class App 
{   
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        try{
            driver.manage().window().maximize();
            // driver.get("https://testautomationpractice.blogspot.com/");
            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            // // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
            // // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Sunday']"))).click();
            // List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox'][@class='form-check-input']"));
            // for(WebElement checkbox : checkboxes){
            //     checkbox.click();
            // }
            // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
            // driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            // driver.findElement(By.xpath("//li[3]/button")).click();
            // Thread.sleep(2000);
            // Alert myalert=driver.switchTo().alert();
            // System.out.println(myalert.getText());
            // myalert.sendKeys("data");
            // myalert.accept();
            // WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
            // Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
            // myalert.sendKeys("data");
            // myalert.accept();
            
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.navigate().to("https://ui.vision/demo/webtest/frames/");

            System.out.println("Page Title: " + driver.getTitle());
            System.out.println(driver.getWindowHandle());

            // WebElement frame1=driver.findElement(By.xpath("//frameset/frame[1]"));
            // driver.switchTo().frame(frame1);

            // WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
            // driver.switchTo().frame(frame2);
            // driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hello Frame1");

            // WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
            // driver.switchTo().frame(frame3);
            // driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Hello Frame3");
            // WebElement cbtn=driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']"));
            // JavascriptExecutor js=(JavascriptExecutor)driver;
            // js.executeScript("arguments[0].click()", cbtn);

            WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
            driver.switchTo().frame(frame5);
            driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
            driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")).click();
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            // driver.quit();
        }
    }
}
