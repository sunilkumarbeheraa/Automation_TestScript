
package test.muvi6.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class NextButton 
{
	



	
	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.allthingsott.com/");
		driver.findElement(By.linkText("Start free trial")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("xxxxaaa");
		driver.findElement(By.xpath(".//*[@id='companyname']")).sendKeys("bnbanbvb");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sunilaa.xyz@muvi.com");
		driver.findElement(By.xpath(".//*[@id='inputPassword']")).sendKeys("sdgfahfjd12345");
		driver.findElement(By.xpath(".//*[@id='userinfo']/div[3]/div/input")).sendKeys("9879543212");
		driver.findElement(By.xpath(".//*[@id='userinfo']/div[7]/div/label/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='nextbtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='updateTemplate']/div[2]/div[2]/div")).click();
		driver.findElement(By.xpath(".//*[@id='updateTemplate']/div[2]/div[3]/div")).click();
		driver.findElement(By.xpath(".//*[@id='updateTemplate']/div[2]/div[4]/div")).click();
		driver.findElement(By.xpath(".//*[@id='updateTemplate']/div[4]/div[2]/div/div[1]/div")).click();
		driver.findElement(By.xpath(".//*[@id='updateTemplate']/div[4]/div[2]/div/div[2]/div")).click();
		driver.findElement(By.xpath(".//*[@id='updateTemplate']/div[4]/div[2]/div/div[3]/div")).click();
		driver.findElement(By.xpath(".//*[@id='updateTemplate']/div[4]/div[2]/div/div[4]/div")).click();
		driver.findElement(By.xpath(".//*[@id='updateTemplate']/div[4]/div[2]/div/div[5]/div")).click();
		driver.findElement(By.xpath(".//*[@id='updateTemplate']/div[4]/div[2]/div/div[6]/div")).click();
		driver.findElement(By.xpath(".//*[@id='updateTemplate']/div[4]/div[2]/div/div[7]/div")).click();
		driver.findElement(By.xpath(".//*[@id='updateTemplate']/div[4]/div[2]/div/div[8]/div")).click();
		driver.findElement(By.xpath(".//*[@id='nextbtn']")).click();
		
		
		
	}
	
	
	

	
	
	
	
	
}
