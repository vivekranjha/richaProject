package richaautomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vranjha.EAD\\eclipse-workspace\\richaautomation1\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi, India");
		
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Goa, India");
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		
		driver.findElement(By.xpath("//label[@for='departure']")).click(); 
		driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]//*[text()='20']")).click();
		
		driver.findElement(By.xpath("//div[@data-cy='returnArea']")).click(); 
		driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]//*[text()='22']")).click();
		
		driver.findElement(By.xpath("//div[@data-cy='flightTraveller']")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
		driver.findElement(By.xpath("//li[@data-cy='children-1']")).click();
		driver.findElement(By.xpath("//li[@data-cy='infants-2']")).click();
		driver.findElement(By.xpath("//li[@data-cy='travelClass-0']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}
