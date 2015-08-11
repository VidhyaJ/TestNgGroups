package Groups.test;
import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class gmailPagination {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@class='gstl_0 sbib_a]/div[3]/div/input")).sendKeys("selenium");
		//driver.findElement(By.className("sbib_b")).sendKeys("Hello");
		driver.findElement(By.xpath("//div[@class='gstl_0 sbib_a']/div[3]/div/input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id='sblsbb']/button")).click();
		//.//*[@id='rso']/div[2]/div[10]/div/h3/a
		/*for(int i=1 ; i<=10 ; i++){
			WebElement cell = driver.findElement(By.xpath("//*[@id='rso']/div[2]/div["+i+"]/div/h3/a"));
			java.util.List<WebElement> links = cell.findElements(By.tagName("a"));
			System.out.println("Total links -- "+links.size());
		}*/
		
	/*	String part1="//*[@id='rso']/div[2]/div[";
		String part2="]/div/h3/a";
		int i=1;
		while(isElementPresent(part1+i+part2)){
		   	   String text = driver.findElement(By.xpath(part1+i+part2)).getText();
		   	   System.out.println(text);
		   	   i++;
		  	}*/
		
	//	WebElement cell=driver.findElement(By.xpath("//*[@id='rso']/div[2]/div/div/h3"));
		//java.util.List<WebElement> links=cell.findElements(By.tagName("a"));
		
		WebElement cell=driver.findElement(By.xpath("//*[@id='rso']/div[2]"));
		java.util.List<WebElement> links=cell.findElements(By.xpath("//div[@class='rc']/h3/a"));
		System.out.println("Size : " +links.size());
		for (WebElement link : links){
			System.out.println(link.getText());
		}
		//System.out.println("Size : " +size);
		
		driver.quit();
	}
	 public static boolean isElementPresent(String element_xpath){
		 System.out.println("Element : " +element_xpath);
	  	  int count = driver.findElements(By.xpath(element_xpath)).size();
	  	    if(count == 0)    return false;
	  	  else    return true; 
	  	    } 
}


