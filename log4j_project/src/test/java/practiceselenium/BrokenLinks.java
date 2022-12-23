package practiceselenium;

import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import log4j_practice.BaseClass;

public class BrokenLinks extends BaseClass{
	 static List<WebElement> activeLinkImage = null;
public static void main(String[]arg) throws IOException {
	setup();
	navigateURL("https://www.google.com/");
	List<WebElement>totallinks=driver.findElements(By.tagName("a"));
	//totallinks.addAll(driver.findElements(By.tagName("img")));
	System.out.println(totallinks.size());
	for(WebElement links:totallinks) {
		String urllink=links.getAttribute("href");
		URL url = new URL(urllink);
		URLConnection urlconnection= url.openConnection();
		HttpURLConnection httpconnection = (HttpURLConnection) urlconnection;
		httpconnection.setConnectTimeout(5000);
		httpconnection.connect();
		if(httpconnection.getResponseCode()==200) {
			System.out.println(urllink +" "+httpconnection.getResponseMessage() );
		}else {
			System.out.println(urllink +" "+httpconnection.getResponseCode()+ ""+httpconnection.getResponseMessage() );
		}
	}
	
}
}
