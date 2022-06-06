import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SOFTWARETEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\New DRIVER VERSION MAY\\chromedriver.exe");
		

        WebDriver driver=new ChromeDriver();
        
        driver.get("https://codeshare.io/");
        driver.findElement(By.xpath("//*[@id=\"home\"]/section[1]/div/div[1]/p[1]/a")).click();
        
    
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre"))).sendKeys("#include <stdio.h>").build().perform();
        
        driver.switchTo().newWindow(WindowType.WINDOW);
        
        Set<String> windows = driver.getWindowHandles();
        Iterator<String>it = windows.iterator();
        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);
        
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        
        driver.get("https://codeshare.io/kmqrew");
        
        Actions b=new Actions(driver);
        b.moveToElement(driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div[2]/pre"))).sendKeys("#include <conio.h>").build().perform();
        driver.switchTo().window(parentID);
        //driver.close();
	}
	
	}


