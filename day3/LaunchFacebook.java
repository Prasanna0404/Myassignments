package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFacebook {
	
	public static void main(String[] args) {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		String text=driver.findElement(By.className("pam _3-95 _9ay3 uiBoxRed")).getText();
		System.out.println(text);
		//Not able read the error message 
		
		
		
	}

}
