package Groups.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestA1 {
	WebDriver driver;
	
	@BeforeTest
	     public void setup(){
         
        System.out.println("Set up test cases");
        
        System.out.println("Set up test cases : Arjun");
    }
 
	@BeforeGroups
    public void GroupsTest(){
    
   System.out.println("Before Groups");
}
 
    @Test(groups={"A"})
     public void Login1Test(){
 
    	System.out.println("Inside Login1 test");
      }
    @Test(groups={"B"})
    public void Login2Test(){

   	System.out.println("Inside Login2 test");}
    
    @Test(groups={"A","B"})
    public void Login3Test(){

   	System.out.println("Inside Login3 test");
   	
		
   }
	
	@AfterTest
	public void testB1(){
		System.out.println("In tear down");
	}
	@AfterGroups
    public void AfterGroupsTest(){
    
   System.out.println("After Groups");
}

}
