package practiceselenium;


import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import log4j_practice.BaseClass;

public class FileUpload extends BaseClass{
	//=========BySendKeys==============//
	/*public static void main(String[] args) throws Exception {
		setup();
		navigateURL("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		//Actions act= new Actions(driver);
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("fileupload1"));
	 JsScrolltoElement(ele);
		
	  Thread.sleep(3000);
	  
		//JsClick(ele);
//		Robot robo =new Robot();
    		ele.sendKeys("C:\\Users\\91789\\OneDrive\\Desktop\\books\\A Top stocks.txt");
		Thread.sleep(3000);
		driver.close();
	}*/
	//=================ByRobot=======================//
	public static void main(String[] args) throws Exception {
		setup();
		navigateURL("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		//Actions act= new Actions(driver);
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("fileupload1"));
	 JsScrolltoElement(ele);
		
	  Thread.sleep(3000);
	  JsClick(ele);
	}

}
