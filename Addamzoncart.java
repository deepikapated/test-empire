package foodcenter;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addamzoncart {

	public static void main(String[] args) 
 {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5km84u9k2k_e&adgrpid=61666692631&hvpone=&hvptwo=&hvadid=676704164802&hvpos=&hvnetw=g&hvrand=6144506249740033738&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-304880464215&hydadcr=14450_2367558");
		driver.findElement(By.xpath(" //span[@id=\"nav-cart-count\"]")).click();
		driver.findElement(By.xpath("  //input[@name=\"proceedToRetailCheckout\"]")).click();
		driver.findElement(By.xpath(" //span[text()='Use this address '")).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement element=driver.findElement(By.xpath("//input[@id=\"pp-xo83un-132\"]"));
	       js.executeScript("arguments[0].scrollIntoView();", element);
	        element.click();
	        driver.findElement(By.xpath("//span[@id=\"pp-XraMdF-134-announce\"]")).click();
	        driver.findElement(By.xpath("//span[@id=\"orderSummaryPrimaryActionBtn-announce\"]")).click();
	        driver.quit();
	        
	       
		
 
 }}