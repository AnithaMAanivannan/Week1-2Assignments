package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	
		
		ChromeDriver driver = new ChromeDriver();
		
driver.get("http://leaftaps.com/opentaps/");

   driver.manage().window().maximize();
   
   
   driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
   driver.findElement(By.id("password")).sendKeys("crmsfa");
   driver.findElement(By.className("decorativeSubmit")).click();   
   driver.findElement(By.linkText("CRM/SFA")).click();
   driver.findElement(By.linkText("Leads")).click();
   driver.findElement(By.linkText("Create Lead")).click();
   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TechM");
   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ram");
   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rami");
   driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ramudu");
   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
   driver.findElement(By.id("createLeadForm_description")).sendKeys("this is the test for description");
   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anithamani@gmail.com");
   
   WebElement eleSource =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
   Select  nn = new Select(eleSource);
   nn.selectByVisibleText("New York");
   driver.findElement(By.name("submitButton")).click();
   System.out.println("the title is :" +driver.getTitle());
   driver.findElement(By.linkText("Duplicate Lead")).click();
   driver.findElement(By.id("createLeadForm_companyName")).clear();
   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New infotain");
   driver.findElement(By.id("createLeadForm_firstName")).clear();
   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Radha");
   driver.findElement(By.name("submitButton")).click();
   
 
 
	}




}
