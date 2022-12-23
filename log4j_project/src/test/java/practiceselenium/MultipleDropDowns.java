package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDowns {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://formstone.it/components/dropdown/demo/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		WebElement el=driver.findElement(By.xpath("//*[@id='demo_basic_2']"));
		js.executeScript("arguments[0].scrollIntoView(true)",el);
		js.executeScript("arguments[0].click()",el );
		
		Thread.sleep(5000);
		WebElement ele= driver.findElement(By.xpath("//*[@id='demo_basic_2']"));
		System.out.println(  ele.isEnabled());
		Select select = new Select(ele);
		
		Thread.sleep(2000);
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByValue("KY");
		System.out.println( select.getAllSelectedOptions());
//		select.selectByValue("4");
//		select.selectByVisibleText("Health & Beauty");
		
		//driver.findElement(By.xpath("//*[@id=\"demo_groups-dropdown\"]/div/div[2]/button[10]")).click();
}
}