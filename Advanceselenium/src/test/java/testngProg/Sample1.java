package testngProg;

import org.testng.annotations.Test;

public class Sample1 {

	
	@Test 
	public void createcontact() {
		
		System.out.println("contact created");
	}
	@Test (dependsOnGroups = "createcontact")
	public void modifycontact() {
		
		System.out.println("7799157969");
	}
	
	@Test (dependsOnGroups = "createcontact")
	public void detailcontact() {
		
		System.out.println("Bala");
	}
	
	
}
