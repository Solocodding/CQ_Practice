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

public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        System.out.println();
        
        try{
            driver.manage().window().maximize();
            driver.get("https://pdf.cqtestga.com/login");

            if(driver.getTitle().equals("PDF SUMMARY")){
                System.out.println("Page accessed successfully.");    
            }

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("narenderkumar2972002@gmail.com");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Holmes@221");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            WebElement project_name=driver.findElement(By.xpath("//div[contains(text(),'Shikayat Seva')]"));

            if(project_name.isDisplayed()){
                System.out.println("Logged in Succesfuly.");
            }

            driver.findElement(By.xpath("//button[@class='ant-btn css-1m63z2v ant-btn-primary ant-btn-color-primary ant-btn-variant-solid']")).click();
            driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Automation Testing");
            driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Automation Testing Description");
            WebElement uploadfile = driver.findElement(By.id("attachments"));
            uploadfile.sendKeys("C:\\Users\\naren\\Downloads\\newWritten.pdf");
            driver.findElement(By.xpath("//span[normalize-space()='Create']")).click();

            //delete all requests
            deleteAllRequests(driver);
            System.out.println("All requests deleted successfully.");
           

        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            // driver.quit();
        }  
    }
    public static void deleteAllRequests(WebDriver driver){
        try{
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            List<WebElement> arr= driver.findElements(By.xpath("//td[@class='ant-table-cell']/div[1]/button[3]"));
            System.out.println("Total number of requests: " + arr.size());

            for(WebElement delbtn:arr){
                delbtn.click();
                WebElement innerdel=driver.findElement(By.xpath("//div[@class='ant-modal-footer']//button[2]"));

                Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(2));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='ant-modal-footer']//button[2]")));
                innerdel.click();
                
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            // driver.quit();
        }
    }
}
