package com.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;

public class Screen1 {
	public static void main(String args[]) throws IOException{
	{
	System.setProperty("webdriver.chrome.driver", "./Chrome_driver_jars/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com");
	
	File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("./SS/GoogleHomepage.png"));
	driver.quit();
}
}
}