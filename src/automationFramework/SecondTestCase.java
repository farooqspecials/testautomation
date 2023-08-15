package automationFramework;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// path C:\Users\Farooq\eclipse-workspace\Demo\Drivers
		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		 driver.get("https://demoqa.com/login");
		 //maximizing window
		 driver.manage().window().maximize();
		 //retrieving title of webpage
		 String title=driver.getTitle();
		 System.out.print("The Title of the Page is " +title);
		//locating webelements
		 WebElement uName=driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		 WebElement pswd=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"login\"]"));	 
		// performing actions on web elements
		 uName.sendKeys("testuser");
		 pswd.sendKeys("Password@123");
		 
		 loginBtn.click();
		
		 
		//Putting implicit wait
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			
		try {
			
			//locating logout button
			WebElement logoutBtn=driver.findElement(By.xpath("//*[@id=\"submit\"]"));
			if(logoutBtn.isDisplayed()) {
				// performing action on web element
				logoutBtn.click();
				System.out.print("Logout is successfully executed");
			}
			
		}
		catch (Exception e) {
			System.out.print("Incorrect Login");
			
		}
		
		driver.quit();
		
		
		}
		 
				 
	}


