package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {
public static void main(String[] args) {
	//setup the path using web driver manager
	WebDriverManager.chromedriver().setup();
	//Launch the Chrome browser
	ChromeDriver driver = new ChromeDriver();
	//Open the url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//Maximize the window
	driver.manage().window().maximize();
	//Verify the title
	String title = driver.getTitle();
	System.out.println(title);
	//find the username
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	//find the password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
//click on submit button
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//click on crmfa
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	//click on CreateLead
	driver.findElement(By.linkText("Create Lead")).click();
	
	//Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BNY Mellon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Indira");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priyadarshini");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Create Lead Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyaindrarajan@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	
	
//	//setup the path using web driver manager
//	WebDriverManager.edgedriver().setup();"
//	//Launch the Edge browser
//	EdgeDriver driver1 = new EdgeDriver();
//	//Open the url
//	driver1.get("http://leaftaps.com/
	
	//opentaps/control/main");
//	//Maximize the window
//	driver1.manage().window().maximize();
}
}
