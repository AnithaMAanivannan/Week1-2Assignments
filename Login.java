package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		//set up the driver 
		WebDriverManager.chromedriver().setup();
		//		launch the browser
		ChromeDriver driver = new ChromeDriver();
		//open webpage
driver.get("http://leaftaps.com/opentaps/");

//maximize the window
   driver.manage().window().maximize();
   
   //identify the username field and enter the username
   driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
   driver.findElement(By.id("password")).sendKeys("crmsfa");
   //login button
   driver.findElement(By.className("decorativeSubmit")).click();
   
   //get the title of the application
   String title = driver.getTitle();
   System.out.println(title);
   
   //click on CRM/sfa
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
   
 //  WebElement eledp = driver.findElement(By.id("createLeadForm_dataSourceId"));
    //Select dd=new Select(eledp);
   // dd.selectByVisibleText("Conference");
  
  driver.findElement(By.name("submitButton")).click();
 // driver.findElement(By.linkText("Create Lead")).click();
  System.out.println("the title is :" +driver.getTitle());
   
 //String text=  driver.findElement(By.id("viewLead_firstName_sp")).getText();
 //System.out.println(text);

 //driver.close();
 
	}

}
