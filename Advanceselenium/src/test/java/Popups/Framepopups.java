package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framepopups {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
									// FOR SINGLE FRAME
		
//		driver.get("https://jqueryui.com/droppable/");
//		driver.switchTo().frame(0);
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		Actions act = new Actions(driver);
//		act.dragAndDrop(drag, drop).perform();
		
									//FOR MULTIPLE FRAMES 
					//USING INDEX VALUE
		
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.switchTo().frame(1);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
					//USING ID ATTRIBUTE
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("lleo");
		
					//USING NAME ATTRIBUTE
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.switchTo().frame("SingleFrame");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("lleoneo");
		
					//USING WEBELEMENT
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement FRAME = driver.findElement(By.cssSelector("[id=\"singleframe\"]"));
		driver.switchTo().frame(FRAME);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tera suroor");
		
		
		
		
		
	}

}
