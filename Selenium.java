package program;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) throws InvalidArgumentException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\spide\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://auth.geeksforgeeks.org");
		driver.manage().window().maximize();
		driver.findElement(By.id("luser")).sendKeys("sit22cs142@sairamtap.edu.in");
		driver.findElement(By.id("password")).sendKeys("Abinaya@123");
		driver.findElement(By.className("signin-button")).click();
		driver.close();
       
			}
}
