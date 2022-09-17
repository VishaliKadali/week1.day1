package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assginment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		https://leafground.com/input.xhtml
			
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://leafground.com/input.xhtml");
			driver.manage().window().maximize();
			
		String city=	driver.findElement(By.xpath("//input[@value='Chennai']")).getAttribute("value");
		
		String country= "+ India";
		
		String appendCountry= city.concat(country);
		
		System.out.println(appendCountry);
		
		
		//Boolean isTextboxDisabled=true;
		
		WebElement disabledTextbox=driver.findElement(By.xpath("//input[@placeholder='Disabled']"));
		
		if(disabledTextbox.isEnabled()==true) {
			
		System.out.println("Textbox is enabled");
		}
		else {
			
			System.out.println("Text box is diabled");
			
		}
		
		//Clear the textbox
		
		driver.findElement(By.xpath("//h5[.='Clear the typed text.']/following::div[1]")).clear();
		
		//Retrieve the typed text
		
		WebElement typetext=driver.findElement(By.xpath("//h5[.='Retrieve the typed text.']/following::input[1]"));
		
		String typedText=	driver.findElement(By.xpath("//h5[.='Retrieve the typed text.']/following::input[1]")).getAttribute("value");
		
		System.out.println(typedText);
	
		//Type email and tab
		
		typetext.sendKeys(Keys.TAB);
	
		driver.findElement(By.xpath("//h5[contains(text(),'Type email')]")).sendKeys("info@testleaf.com");
		
		//Type about yourself
		driver.findElement(By.xpath("/h5[contains(text(),'yourself')]")).sendKeys("I am student at testleaf");
		
		//Just press enter and confirm error message
		driver.findElement(By.xpath("//h5[contains(text(),'Press Enter')]/following::input[2]")).sendKeys(Keys.ENTER);
		
		//Mandatory Age
		String mandatoryAge=driver.findElement(By.xpath("//h5[contains(text(),'Press Enter')]/following::input[2]/following::span[2]")).getAttribute("span");
		
		if(mandatoryAge.equalsIgnoreCase("Age is mandatory")) {
			
			System.out.println("Error message is displayed");
		}
		
		else {
			
			System.out.println("Error message is not displayed");
		}
		
		
		
	}

}
