package practiceselenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://js.devexpress.com/Demos/WidgetsGallery/Demo/DropDownBox/MultipleSelection/jQuery/Light/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		driver.switchTo().frame(0);
//		
	Actions act = new Actions(driver);
//		
		WebElement r= driver.findElement(By.xpath("//span[@class='dx-icon dx-icon-clear']"));
//		
		act.scrollToElement(r);
		r.click();
//		List <WebElement>lo=driver.findElements(By.xpath("//*[@class='dx-field-value']"));
//		for(WebElement ai:lo) {
//			
//			String sr= ai.getText();
//			System.out.println(sr);
//			if (ai.)
//			ai.click();
//		
		driver.findElement(By.xpath("(//*[@class='dx-field-value'])[1]")).click();
		Thread.sleep(2000);
		List <WebElement> ele=driver.findElements(By.xpath("//*[@class='dx-treeview-toggle-item-visibility']"));
		//js.executeScript("arguments[0].click()",ele);
		for(WebElement e:ele) {
			Thread.sleep(2000);
			act.moveToElement(e);
			js.executeScript("arguments[0].click()",e);
//						//js.executeScript("window.scrollBy(0,200)");
//						//e.click();
					}
		List<WebElement> li= driver.findElements(By.xpath("//*[@class='dx-item-content dx-treeview-item-content']"));
		
	   for(WebElement elemt:li) {
		   
		   String s1=elemt.getText();
		   if(s1.equalsIgnoreCase("Projector PlusHD")) {
			   act.moveToElement(elemt).build().perform();
			   js.executeScript("arguments[0].click()",elemt);
			   elemt.click();
		   }else if(s1.equalsIgnoreCase("SuperLED 42")) {
			   act.scrollToElement(elemt);
			   elemt.click();
		   }else if(s1.equalsIgnoreCase("HD Video Player")) {
			   act.scrollToElement(elemt);
			   elemt.click();
		   }else if(s1.contains("19")) {
			   act.scrollToElement(elemt);
			   elemt.click();
		   }
		   
		   
	   }
	   driver.findElement(By.xpath("(//*[@class='dx-field-value'])[1]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//*[@class='dx-field-value'])[2]")).click();
//	   Thread.sleep(2000);
////	   driver.findElement(By.xpath("(//*[@class='dx-texteditor-input-container'])[3]")).sendKeys("ElectrixMax");
////	   Thread.sleep(2000);
////	   driver.findElement(By.xpath("(//*[@class='dx-texteditor-input-container'])[4]")).sendKeys("Warner Robbins");
////	   Thread.sleep(2000);
////	   driver.findElement(By.xpath("(//*[@class='dx-texteditor-input-container'])[5]")).sendKeys("(408) 996-1010");
//	   
//	   ===============================================================
	  int i= driver.findElements(By.xpath("(//tbody)[2]/tr")).size();
	 // int j= driver.findElements(By.xpath("(//tbody)[2]/tr[2]/td")).size();
	  System.out.println(i);
	  for(int x=1;x<=i;x++) {
		 driver.findElement(By.xpath("(//tbody)[2]/tr["+x+"]"));
		  int j= driver.findElements(By.xpath("(//tbody)[2]/tr[2]/td")).size();
		  
		  //System.out.println(j);
		  
		  for(int y=1;y<=j;y++) {
			WebElement oi=  driver.findElement(By.xpath("(//tbody)[2]/tr["+x+"]/td["+y+"]"));
			String eli=  driver.findElement(By.xpath("(//tbody)[2]/tr["+x+"]/td["+y+"]")).getText();
			System.out.print( eli);
			act.scrollToElement(oi).build();
			if (eli.equalsIgnoreCase("Cupertino")) {
				oi.click();
				
			}
			  
		  }
		  System.out.println();
		  
	  }
//	   =========================================
//	List <WebElement>st=   driver.findElements(By.xpath("(//tbody)[2]/tr/td"));
//	for(WebElement d:st) {
//		String f= d.getText();
//		System.out.println(f);
//		if (f.contains("Cupertino")) {
//			d.click();
//		}
//		if (f.contains("PriceCo")) {
//			act.moveToElement(d);
//			d.click();
//		}
//		
//		
//	}
//=============================================================	   
//	   
//	   List<WebElement>st=   driver.findElements(By.xpath("(//tbody)[2]/tr/td"));
//	   
//	   Iterator<WebElement> it= st.iterator();
//	  while(it.hasNext()) {
//		//String sr=  (String) it.next();
//		 System.out.println(it.next().getText() );
//	  }
	   
}
		
	}
