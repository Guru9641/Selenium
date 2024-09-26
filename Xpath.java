package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCsr"); // attribute based 
		driver.findElement(By.xpath("//input[@name= 'PASSWORD']")).sendKeys("crmsfa"); // attribute based
		driver.findElement(By.xpath("//input[@class= 'decorativeSubmit']")).click();  // attribute based
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();  // partial text based
		driver.findElement(By.xpath("//a[text()= 'Leads']")).click(); // text based 
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_companyName')]")).sendKeys("Teatleafs"); // contains
		driver.findElement(By.xpath("(//input[@class= 'inputBox'])[3]")).sendKeys("kumaraguru"); // index based 
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
				
			

	}

}
