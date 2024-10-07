package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class WritingDatainFile {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\saal.properties");
		
		
		Properties pro = new Properties();
		pro.setProperty("URL", "https://www.saucedemo.com/v1/");
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		
		FileOutputStream fos = new FileOutputStream("./src\\test\\resources\\saal.properties");
		pro.store(fos, "SWAG  LABS CREDENTIALS");
		//NOT COMPLETE

	}

}
