package advanceSelinium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingScroolbar {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Robot scrl = new Robot();
		
		Thread.sleep(1000);
		
		//APPROACH  ->1  
		
		scrl.keyPress(KeyEvent.VK_PAGE_DOWN);
		scrl.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(1000);
		
		scrl.keyPress(KeyEvent.VK_PAGE_DOWN);
		scrl.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(1000);
		
		scrl.keyPress(KeyEvent.VK_PAGE_DOWN);
		scrl.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		

	}

}
