package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AppTest 
{
    
    @Test
    public void FirstTestCase() throws InterruptedException
    {
    	 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.rushitpatel.com/");
		 	 
		 Thread.sleep(15000); 
		 driver.quit();
    }
    
    
    @Test
    public void SecondTestCase() throws InterruptedException
    {
    	 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.cricbuzz.com/");
		 	 
		 Thread.sleep(15000); 
		 driver.quit();
    }
    
    
    
    
    
    
    
    
    
    
    
}
