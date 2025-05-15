package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition; //interface to create custom wait
import org.openqa.selenium.support.ui.ExpectedConditions; //class  and provide redimade methods  for wait 

import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.Keys;


public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        try{
            driver.manage().window().maximize();
            //driver.get("https://flipkart.com");
            //driver.navigate().to("https://flipkart.com");
            
            URL url = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.navigate().to(url);

            System.out.println(driver.getPageSource());


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"))).click();
            
            // driver.navigate().refresh();
            
            // driver.navigate().back();
            // driver.navigate().forward();

            ArrayList<String> Ids=new ArrayList<>(driver.getWindowHandles());
            System.out.println("Window Ids: "+Ids);
            driver.switchTo().window(Ids.get(0));
            System.out.println(driver.getTitle());
            driver.switchTo().window(Ids.get(1));
            System.out.println(driver.getTitle());

            if(driver.getTitle().equals("Human Resources Management Software | OrangeHRM HR Software")){
                driver.close();
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage()); 
        }finally{
            // driver.quit();
        }   

    }

}
