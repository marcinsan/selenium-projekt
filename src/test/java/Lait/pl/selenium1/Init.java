package Lait.pl.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Init {

	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.out.println("wewnatrz getDriver");
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumkurs\\chromedriver.exe");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        System.out.println("new ChromeDriver");
        if(driver == null) {
        	 driver = new ChromeDriver();
             driver.get("http://newtours.demoaut.com/");
             driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
             sleep(2); 
             return driver;
        }else{
        	
        	return driver;
        }
        
        
	}		
       public static void sleep (int seconds) {
        	try {
        		Thread.sleep(1000);
        	}catch (InterruptedException e) {
        		//TODO Auto-generated catch block
        		e.printStackTrace();
        	}
        }
       
       public static void endTest() {
    	   
    	   driver.quit();
    	   driver = null;
    	   
    	  
       }
        
     
        
	}

