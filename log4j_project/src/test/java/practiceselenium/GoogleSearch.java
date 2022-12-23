package practiceselenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("java");
		Thread.sleep(3000);
  List<WebElement>list=driver.findElements(By.xpath("(//*[@class='G43f7e'])[1]/li"));
  JavascriptExecutor js= (JavascriptExecutor) driver;
 System.out.println( list.size());
System.out.println(list.get(0).getText());
  for(WebElement e: list) {
	  String sr=e.getText();
	  System.out.println(sr);
	  if (sr.equalsIgnoreCase("javascript")) {
		  js.executeScript("arguments[0].click()",e);;
		  //e.click();
		  break;
		  }
	  }
   
	   
	   
	   
   }
  }
		
	


