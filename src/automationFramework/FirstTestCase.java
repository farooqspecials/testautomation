package automationFramework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	    	WebDriver driver = new ChromeDriver();    
	        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    
	        driver.get("http://www.wikipedia.org");
	        //driver.close();
	       

	}

}
