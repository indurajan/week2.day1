package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {
	public static void main(String[] args) {
		//setup the path using web driver manager
		WebDriverManager.chromedriver().setup();
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		//Open the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the window
		driver.manage().window().maximize();
		//to get the attribute
//		String attribute = driver.findElement(By.id(id)).getAttribute("placeholder");
	//	System.out.println(attribute);
	//get the text	
	}
	
}

