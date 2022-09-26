package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
			
		//Edit Lead
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Lead details are modified");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
	}
}
