package practiceselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import log4j_practice.BaseClass;

public class Alerts extends BaseClass{
public static void main(String[] args) throws Exception {
	setup("firefoxbrowser");
	navigateURL("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	WebElement ele=driver.findElement(By.xpath("//*[@id='simpleAlert']"));
	Actions act= new Actions(driver);
	Thread.sleep(3000);
	//act.scrollToElement(ele).perform();
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",ele);
	ele.click();
	Thread.sleep(3000);
	Alert aler=driver.switchTo().alert();
	aler.dismiss();
	driver.findElement(By.xpath("//*[@id='confirmationAlert']")).click();
		Thread.sleep(3000);
	aler.accept();
	driver.findElement(By.xpath("//*[@id='promptAlert']")).click();
	aler.sendKeys("yes");
	Thread.sleep(3000);
	aler.accept();
	driver.close();
}
}
