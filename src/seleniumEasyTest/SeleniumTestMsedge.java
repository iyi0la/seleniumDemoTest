package seleniumEasyTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SeleniumTestMsedge {
	
	static WebDriver driver = null;
	 
		@BeforeTest
		public static void setUpTest() {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\selenium-java-3.141.59\\edgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		}
		
		@Test
		public void formTest() throws InterruptedException {
		
		driver.get("https://demo.seleniumeasy.com/jquery-dual-list-box-demo.html");
		
		
		WebElement isis = driver.findElement(By.xpath("//div[@id='pickList']/div/div/select"));
		Select isisSelect = new Select(isis);
		isisSelect.selectByVisibleText("Isis");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='pickList']/div/div/select/option")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='pickList']/div/div[2]/button")).click();
		
		Thread.sleep(2000);
		
		WebElement luiza = driver.findElement(By.xpath("//div[@id='pickList']/div/div/select"));
		Select luizaSelect = new Select(luiza);
		luizaSelect.selectByVisibleText("Maria Luiza");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='pickList']/div/div/select/option[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='pickList']/div/div[2]/button")).click();
		
		Thread.sleep(2000);
		
		WebElement marialu = driver.findElement(By.xpath("//div[@id='pickList']/div/div[3]/select"));
		Select marialuSelect = new Select(marialu);
		marialuSelect.selectByVisibleText("Maria Luiza");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='pickList']/div/div[3]/select/option[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='pickList']/div/div[2]/button[3]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='pickList']/div/div[2]/button[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='pickList']/div/div[2]/button[4]")).click();
		
		Thread.sleep(5000);
		
		System.out.println("Congratulations, Tests Complete...");
		
		driver.quit();

    }
		
		@AfterTest
		public void tearDownTest() throws Exception{

			Thread.sleep (5000);
			driver.quit();
		}
	
}
