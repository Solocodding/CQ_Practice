package pdf.cqtestga;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

public class Admin {
    public static void main(String[] args) {
        try{
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://pdf.cqtestga.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("arun.goyat@gmail.com");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Holmes@221");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            driver.findElement(By.xpath("//li//span[text()='Users']")).click();

            for(int i=0;i<20;i++){
                driver.findElement(By.xpath("//button[@class='ant-btn css-1m63z2v ant-btn-primary ant-btn-color-primary ant-btn-variant-solid']")).click();
                driver.findElement(By.xpath("//input[@id='name'][@placeholder='Enter name']")).sendKeys("abc"+i);
                driver.findElement(By.xpath("//input[@id='email'][@placeholder='Enter email']")).sendKeys("abc"+i+"@gmail.com");
                driver.findElement(By.xpath("//button[@type='submit']/span[text()='Add User']")).click();
            }

        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            // driver.quit();
        }   
    }
}
