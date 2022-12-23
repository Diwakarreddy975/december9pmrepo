package practiceselenium;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import log4j_practice.BaseClass;

public class FileUpload extends BaseClass{
	//=========BySendKeys==============//
	public static void main(String[] args) throws Exception {
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
		//=======//explictwait//===========
		driver.findElement(By.xpath("//*[@id=\"testWait123\"]")).click();
	  explictwait("//*[@id='timeout_text']");
	  System.out.println(driver.findElement(By.xpath("//*[@id='timeout_text']")).getText());
		driver.close();
	}
	//=================ByRobot=======================//
	/*public static void main(String[] args) throws Exception {
		setup();
		navigateURL("https://ps.uci.edu/~franklin/doc/file_upload.html");
		Actions act= new Actions(driver);
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("/html/body/form/input[1]"));
	 JsScrolltoElement(ele);
		
	  Thread.sleep(3000);
	  act.moveToElement(ele).click().perform();
	 // ele.click();
	  Thread.sleep(3000);
	  uploadfile("C:\\Users\\91789\\OneDrive\\Desktop\\books\\A Top stocks.txt");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/form/input[2]")).click();
	  
	}
	public static void setclipboard(String file) {
		StringSelection obj = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}
		
	public static void uploadfile(String filepath) throws AWTException {
		setclipboard( filepath);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}*/
		
		
		
		
		
	
	

}
