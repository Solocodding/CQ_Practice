package mypackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class App 
{
    public static void main( String[] args )
    {
        // System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        try{
            driver.manage().window().maximize();
            
            driver.get("https://codequotient.com/login");
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("loginIframe")));

            driver.findElement(By.id("email")).sendKeys("narenderkumar2972002@gmail.com");
            driver.findElement(By.id("password")).sendKeys("20@Karnal");
            driver.findElement(By.id("submit")).click();

            Thread.sleep(5000);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            driver.quit();
        }
    }
}
