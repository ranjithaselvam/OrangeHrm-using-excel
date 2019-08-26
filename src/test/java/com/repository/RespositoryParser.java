package com.repository;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.repository.ObjectRepository;

public class RespositoryParser {
	 private RespositoryParser parser;
	 private WebDriver driver;
	 
	
	public RespositoryParser(String string) {
		// TODO Auto-generated constructor stub
	}
	@BeforeClass
	 public void setUp() throws IOException
	 {
	 driver = new ChromeDriver();
	 driver.get("https://www.orangehrm.com/");
	 parser = new RespositoryParser("path.properties");
	 }
	 @Test
	 public void EnterValue()
	 {
	 
	 WebElement FirstName = driver.findElement(parser.getbOjectLocator("FirstName"));
	 WebElement LastName = driver.findElement(parser.getbOjectLocator("LastName"));
	 FirstName.sendKeys("ranjitha");
	 LastName.sendKeys("selvam");
	 }
	private By getbOjectLocator(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
