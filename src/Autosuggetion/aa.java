package Autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aa 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.screener.in/");
	
	driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("reliance");
	
	driver.findElement(By.xpath(""));
	

}
}
