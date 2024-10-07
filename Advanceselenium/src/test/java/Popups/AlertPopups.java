package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopups {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//FOR ACCEPTING THE POPUP
		//Alert alt = driver.switchTo().alert();
		//alt.accept();
		
		//Thread.sleep(2000);
		
		// FOR CLICKING OK
		//driver.switchTo().alert().accept();
		
		//FOR CLICKING CANCLE
		//driver.switchTo().alert().dismiss()
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("balle balle");

	}

}
