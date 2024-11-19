package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GuviLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guvi.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()=\"Sign up\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Siddhartha");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("siddharthkannad830@gmail.com");
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Siddhartha@123");
		
		driver.findElement(By.xpath("//input[@id=\"mobileNumber\"]")).sendKeys("8553702954");
		
		driver.findElement(By.xpath("//a[@id=\"signup-btn\"]")).click();
		
		WebElement Selectcls = driver.findElement(By.id("profileDrpDwn"));
		Select Profile = new Select(Selectcls);
		Profile.selectByValue("Working professional in IT");
		
		Select degree = new Select(driver.findElement(By.id("degreeDrpDwn")));
		degree.selectByValue("B.E. / B.Tech. Mechanical Engineering");
		
		driver.findElement(By.id("year")).sendKeys("2022");
		
		driver.findElement(By.id("details-btn")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		driver.findElement(By.id("login-btn")).click();
		
		driver.findElement(By.id("email")).sendKeys("siddharthasiddu2804@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Siddu@123");
		Thread.sleep(5000);
		driver.findElement(By.id("login-btn")).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}


}
