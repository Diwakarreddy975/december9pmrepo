package log4j_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
 
	public static WebDriver driver;
	public static Properties p;
	public static void scrollBy(int y_axis) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y_axis +")");
	}
	public static void JsClick(WebElement WebElement) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click",WebElement);
	}
	public static void JsScrolltoElement(WebElement ele) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
	}
	public static void init() throws Exception {
		//String sr= "\"C:\\Users\\91789\\java workspace\\log4j_project\\src\\test\\resources\\data.properties";
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\data.properties");
//		p.load(fis);
		 p= new Properties();
		p.load(fis);
		//System.out.println(System.getProperty("user.dir"));
		//Logger log = Logger.getLogger("devpinoyLogger");
	}
	public static void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		/*if(p.getProperty(browser).equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		}
		
	
		else if(p.getProperty(browser).equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();}*/
		}
		
	
	public static void navigateURL(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
	public static void explictwait(String ele) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ele)));
	}
	
}
	
	
	

