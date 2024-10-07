package pomclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabs {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("./src/test/resources/swaglab.properties");
		Properties pro = new Properties();
		
		pro.load(fis);
		
		String URL =pro.getProperty("url");
		String username = pro.getProperty("username");
		String password= pro.get("password");
		
		
		
		
		
		

	}

}
