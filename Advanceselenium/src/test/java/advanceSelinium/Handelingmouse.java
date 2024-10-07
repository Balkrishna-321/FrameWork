package advanceSelinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handelingmouse {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
//		//driver.get("https://www.amazon.in/");
//		//WebElement mob = driver.findElement(By.linkText("Mobiles"));
//		
//		//for making actions
		Actions act = new Actions(driver);
//		
//		//for right click
//		//act.contextClick(mob).perform();
//		
//		// to move pointer
//		//act.moveToElement(mob).perform();
//		
//		
//		driver.get("https://www.saucedemo.com/v1/");
//		WebElement USERNAME = driver.findElement(By.id("user-name"));
//		WebElement PASSWORD = driver.findElement(By.id("password"));
//		WebElement LOGIN = driver.findElement(By.className("btn_action"));
//		
		//ACTION = SENDKEYS
		
//		//APPROACH 1 (SENDKEYS)
//		act.sendKeys(USERNAME, "bala").perform();
//		act.sendKeys(PASSWORD, "1234").perform();
//		act.click(LOGIN).perform();
		
		//APPROACH 2 (SENDKEYS)
//		//act.sendKeys(USERNAME, "Bala").sendKeys(PASSWORD, "1234").click(LOGIN).build().perform();
		
////----------------------------------------------------------------------------------------------------------------------------------------	
////		
		//driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//	WebElement dragelement = driver.findElement(By.id("draggable"));
//		WebElement dropelement = driver.findElement(By.id("droppable"));
//		Actions act = new Actions(driver);
////		
////		//ACTION = DRAG AND DROP
////		
////		//APPROACH 1 (DRAG AND DROP)
//		act.clickAndHold(dragelement).release(dropelement);
////		
////		//APPROACH 2 (DRAG AND DROP)
//		act.dragAndDrop(dragelement, dropelement).perform();
////------------------------------------------------------------------------------------------------------------------------------------------------------		
////	
		driver.get("https://demo.guru99.com/test/simple_context_menu.html ");
////		WebElement cli = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
////		
////		//ACTION = DOUBLE CLICK
////		act.doubleClick(cli).perform();
////---------------------------------------------------------------------------------------------------------------
//		driver.get("https://www.makemytrip.com/");
//		Thread.sleep(2000);
		
		//HANDELING POP-UP SCREEN
		act.moveByOffset(15, 20).click().perform();
		
		
		
		
		
		

	}

}
