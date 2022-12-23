package log4j_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class PageObject_Home {
	public  WebDriver driver;
	public PageObject_Home(WebDriver driver) {
		this.driver=driver;
		
	}
	By all= By.xpath("//*[@id=\"nav-hamburger-menu\"]");
	By text= By.xpath("//*[@id=\"hmenu-content\"]");
	By alexa= By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a");
	By menu_bar= By.xpath("//*[@id=\"nav-xshop\"]");
	public void All() {
//		driver.findElement(all).click();
//		driver.findElement(alexa).click();
		System.out.println(driver.findElement(menu_bar).getText());
	}

}
