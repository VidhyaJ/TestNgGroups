package Groups.test;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class diceTest {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
//	System.setProperty("webdriver.chrome.driver",Constants.CHROMEDRIVER_EXE_PATH);
	driver = new FirefoxDriver();
	driver.get("http://www.dice.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
  	driver.findElement(By.xpath("//*[@id='search-field-keyword']")).sendKeys("java");
  	Thread.sleep(3000);
  	
  	String part1="//*[@id='search-form']/fieldset/div[2]/div/div[1]/ul/li[";
  	String part2="]/a";
  	int i=1;
  	while(isElementPresent(part1+i+part2)){
   	   String text = driver.findElement(By.xpath(part1+i+part2)).getText();
   	   System.out.println("Checking git also");
   	   System.out.println(text);
   	   i++;
  	}
   	 
  	
   	/*driver.findElement(By.xpath(".//input[@class='form-control input-lg' and @name='l']")).clear();
  	driver.findElement(By.xpath(".//input[@class='form-control input-lg' and @name='l']")).sendKeys("New Jersey");
   	driver.findElement(By.xpath("//*[@id='search-form']/fieldset/div[4]/div/div[1]/button")).click();
  	Thread.sleep(2000);
  	String xpath1=".//*[@id='dice_paging_top']/ul/li[";
  	String xpath2="]/a";
  	
  	int i=1;
  	
  	while(isElementPresent(xpath1+i+xpath2)){
  	   String text = driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
  	   System.out.println(text);
  	   driver.findElement(By.xpath(xpath1+i+xpath2)).click();
  	   System.out.println(driver.getTitle());
  	  
  	   i++;    System.out.println("********************");
  	 driver.findElement(By.xpath("//input [@class='form-control input-lg' and @name='q']")).clear();
  	 driver.findElement(By.xpath("//input [@class='form-control input-lg' and @name='q']")).sendKeys("java");
   	Thread.sleep(2000);
   	driver.findElement(By.xpath(".//input[@class='form-control input-lg' and @name='l']")).clear();
   	driver.findElement(By.xpath(".//input[@class='form-control input-lg' and @name='l']")).sendKeys("New Jersey");
   	driver.findElement(By.xpath("//*[@id='searchJob']/div/div[3]/input")).click();
  	  }*/
  	driver.quit();
  	}

  	 public static boolean isElementPresent(String element_xpath){
  	  int count = driver.findElements(By.xpath(element_xpath)).size();
  	    if(count == 0)    return false;
  	  else    return true; 
  	    } 
}
  	/* public static boolean checkResponse(String url){
  	  try {
  	            int resp_code= Request.Get(url).execute().returnResponse().getStatusLine()
  	                    .getStatusCode();
  	            System.out.println("Respose code for URL "+ url +" is -> "+ resp_code);
  	           if(resp_code == 200)             return true;
  	           else              return false;
  	       } catch (Exception e) {           return false;        }  }*/
  	
