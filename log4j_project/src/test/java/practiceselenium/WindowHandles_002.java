package practiceselenium;



import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import log4j_practice.BaseClass;

public class WindowHandles_002 extends BaseClass {
   public static void main(String[] args) throws InterruptedException {
	
	   setup();
	   navigateURL("https://demoqa.com/browser-windows");
	  String parentWin= driver.getWindowHandle();
	  System.out.println(driver.getTitle());
	   driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"messageWindowButton\"]")).click();
	   Set<String>win= driver.getWindowHandles();
	   
	   System.out.println(win.size());
	   System.out.println(parentWin);
	  Iterator<String>ci= win.iterator();
	  while(ci.hasNext()) {
		  String sr=ci.next();
		  if(!sr.equalsIgnoreCase(parentWin)) {
			  Thread.sleep(2000);
			  driver.switchTo().window(sr);
			  System.out.println(sr);
			  System.out.println(driver.findElement(By.xpath("//html/body")).getText());
			  
			 // System.out.println(driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).getText());
		  }
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='windowButton']")));
		 // System.out.println(driver.findElement(By.xpath("//*[@id='windowButton']")).getText());
		  Thread.sleep(2000);
		  System.out.println(driver.getTitle());
		  driver.switchTo().window(parentWin);
		  Thread.sleep(2000);
		  System.out.println(driver.getTitle());
		  //
		 
		  
	  }
}
}
   