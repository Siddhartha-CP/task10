package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(source, target).perform();
		
		// Verify the success of the drag-and-drop operation
        String targetText = target.getText();
        String targetColor = target.getCssValue("background-color");

        // Print results
        System.out.println("Text after drop: " + targetText);
        System.out.println("Background color after drop: " + targetColor);

        // Validation
        if (targetText.equals("Dropped!")) {
            System.out.println("Drag-and-drop operation successful!");
        } else {
            System.out.println("Drag-and-drop operation failed.");
        }
	}

}
