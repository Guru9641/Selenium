package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
					
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.className("inputBox")).sendKeys("TestLeafs");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kumaraguru");
		
		Select obj = new Select (driver.findElement(By.id("createLeadForm_dataSourceId")));
		obj.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@id= 'createLeadForm_firstNameLocal']")).sendKeys("Guru"); // attribute based
		driver.findElement(By.xpath("//input[contains (@id, 'createLeadForm_personalTitle')]")).sendKeys("Mr"); // contains 
		driver.findElement(By.xpath("(//input[@class= 'inputBox']) [9]")).sendKeys("Project Manager");
				
		Select industry = new Select (driver.findElement(By.id("createLeadForm_industryEnumId")));
		industry.selectByValue("IND_HARDWARE");
		
		Select ownership = new Select (driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		ownership.selectByVisibleText("Public Corporation");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());

	}

}
