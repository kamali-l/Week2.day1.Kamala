package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		//webdriver setup
		WebDriverManager.chromedriver().setup();
		
		//Open Browser
		ChromeDriver driver = new ChromeDriver();
		
		//open URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximise window
		driver.manage() .window() .maximize();
		
		//find elements
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Click 7 Studio");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramkumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raju");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Estimation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Dummy");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("ram@gmail.com");
		
		//select dropdown
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(stateProvince);
		dropdown.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//print title
		System.out.println(driver.getTitle());
	}
}
