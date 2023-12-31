package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_2 {
	
	public static void main(String[] args) throws InterruptedException {
		//HW2: Facebook sign up:
		//Open chrome browser
		//Go to "https://www.facebook.com/"
		//Click on Sign Up link
		//Enter first name
		//Enter last name
		//Enter email address
		//Re-enter email address
		//Click on Sign Up button
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("websubmit")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("emine");
		
		driver.findElement(By.name("lastname")).sendKeys("firik");
		
		driver.findElement(By.name("reg_email__")).sendKeys("emine@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
