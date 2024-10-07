package Handelingmultiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handelingmultiplewebelements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		int count=0;
		for (WebElement links : alllinks) {
			// For printing all partial texts from the links
			System.out.println(links.getText());
			
			// For printing all the links available on the page
			System.out.println(links.getAttribute("href"));
			count++;
			
		}
		System.out.println("No of links available is-------"+count);
		
		

	}

}