package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class FileUploadExample extends CommonMethods {
	
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	
	
	click(driver.findElement(By.linkText("File Upload")));
	
	String filePath= System.getProperty("user.dir")+"/screenshots/HRM_2023_09_25_11_01_51.png";
	
	sendText(driver.findElement(By.id("file-upload")), filePath);
	wait(3);
	
	click(driver.findElement(By.id("file-submit")));
	wait(3);
	
	tearDown();
}
}
