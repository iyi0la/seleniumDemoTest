package seleniumEasyTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleniumTestChrome {
	
	 static WebDriver driver = null;
			
			@BeforeTest
			public static void setUpTest() {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			}
			
			@Test
			
			public void formTest() throws Exception  {
			        
		   driver.navigate().to("https://demo.seleniumeasy.com/input-form-demo.html");
		   
		   driver.findElement(By.name("first_name")).click()
		   ;
		    driver.findElement(By.name("first_name")).sendKeys("Tesleem")
		    ;
		    driver.findElement(By.xpath("//form[@id='contact_form']/fieldset/div")).click();
		    
		    driver.findElement(By.name("last_name")).click();
		    
		    driver.findElement(By.name("last_name")).clear();
		    
		    driver.findElement(By.name("last_name")).sendKeys("Isiaq");
		    
		    driver.findElement(By.xpath("//form[@id='contact_form']/fieldset")).click();
		    
		    driver.findElement(By.name("email")).click();
		    
		    driver.findElement(By.name("email")).clear();
		    
		    driver.findElement(By.name("email")).sendKeys("tesleemisiaq1@gmail.com");
		    
		    driver.findElement(By.name("phone")).click();
		    
		    Thread.sleep(3000);
		
		    driver.findElement(By.name("phone")).clear();
		    
		    driver.findElement(By.name("phone")).sendKeys("8109468243");
		    
		    driver.findElement(By.name("address")).click();
		    driver.findElement(By.name("address")).clear();
		    
		    driver.findElement(By.name("address")).sendKeys("Eden garden");
		    
		    driver.findElement(By.name("city")).clear();
		    
		    driver.findElement(By.name("city")).sendKeys("Lagos");
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("10128");
		    
		    driver.findElement(By.xpath("//form[@id='contact_form']/fieldset/div[8]")).click();
		   
		    Thread.sleep(3000);
		    
		    driver.findElement(By.name("website")).click();
		    
		    driver.findElement(By.xpath("//form[@id='contact_form']/fieldset/div[10]/div/div[2]/label/input")).click();
		    
		    driver.findElement(By.xpath("//form[@id='contact_form']/fieldset/div[13]/div/button")).click();
		    driver.findElement(By.name("state")).click();
		    new Select(driver.findElement(By.name("state"))).selectByVisibleText("Texas");
		    
		    driver.findElement(By.name("comment")).click();
		    driver.findElement(By.name("comment")).clear();
		    
		    driver.findElement(By.name("comment")).sendKeys("Testing project");
		    driver.findElement(By.xpath("//form[@id='contact_form']/fieldset/div[13]/div/button")).click();

		    Thread.sleep (5000);
		    
		    System.out.println("Congratulations, Tests Complete...");
		    driver.quit();

   }
			
			@AfterTest
			public void tearDownTest() throws Exception{
				
				Thread.sleep (5000);
				
				driver.quit();
			}
}
