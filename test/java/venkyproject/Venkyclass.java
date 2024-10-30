package venkyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Venkyclass {
	
	@Test
public void basicPrograme() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
//	driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div/div[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("xyzqwer");
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1234");
	driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	
	}
	}
