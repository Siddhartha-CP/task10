package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//switching frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		// Select the date "22"
        driver.findElement(By.xpath("//a[text()='22']")).click();
        
       String selectedDate = driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).getAttribute("value");
       System.out.println(selectedDate);
       
       driver.quit();
	}

}
