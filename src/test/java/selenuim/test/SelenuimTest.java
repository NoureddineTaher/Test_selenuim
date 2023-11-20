package selenuim.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SelenuimTest {
	
	 public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    	System.setProperty("webdriver.firefox.driver","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	    	 
	    	WebDriver driver = new FirefoxDriver();
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	    	driver.get("https://www.paruvendu.fr/");
	    	js.executeScript("cmp_pv.cookie.saveConsent(true);");
	    	driver.navigate().refresh();
	    	
	    	driver.findElement(By.cssSelector("a[href='href=/depose-annonce-gratuite/']")).click();
	    	
	    	driver.findElement(By.partialLinkText("Déposez vos annonces gratuites")).click();
	 }

}
