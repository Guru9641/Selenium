package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("All")).click();
		driver.findElement(By.linkText("Best Sellers")).click();
		driver.findElement(By.linkText("Grocery & Gourmet Foods")).click();
		driver.findElement(By.linkText("Tata Salt, 1kg")).click();
		

	}

}
