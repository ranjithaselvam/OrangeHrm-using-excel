package com.orange;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ranjitha.selvam\\eclipse-workspace\\OrangeHrm\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		boolean logo = driver.findElement(By.className("nav-logo")).isDisplayed();
		if (logo == true) {
			System.out.println("logo is available");
		} else {
			System.out.println("logo is not available");
		}
		driver.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[2]/li[1]/a")).click();
		boolean enabled = driver.findElement(By.name("firstname")).isEnabled();
		if(enabled==true)
		{
			System.out.println("text box is enable to print");
		}
		else
		{
			System.out.println("not enable");
		}
		driver.findElement(By.name("firstname")).sendKeys("ranjitha");
		driver.findElement(By.name("lastname")).sendKeys("selvam");
		driver.findElement(By.name("company")).sendKeys("abc technology");
		String attribute = driver.findElement(By.name("firstname")).getAttribute("value");
        String attribute2 = driver.findElement(By.name("lastname")).getAttribute("value");
		String attribute3 = driver.findElement(By.name("company")).getAttribute("value");
		System.out.println(attribute);
		System.out.println(attribute2);
		System.out.println(attribute3);
		WebElement w = driver.findElement(By.name("numemployees"));
		Select s = new Select(w);

		s.selectByIndex(3);
		List<WebElement> allSelectedOptions2 = s.getAllSelectedOptions();
		for (WebElement y : allSelectedOptions2) {
			System.out.println(y.getText());

		}
		driver.findElement(By.name("phone")).sendKeys("7558106561");
		String attribute4 = driver.findElement(By.name("phone")).getAttribute("value");
		driver.findElement(By.name("jobtitle")).sendKeys("software tester");
		String attribute5 = driver.findElement(By.name("jobtitle")).getAttribute("value");
		driver.findElement(By.name("email")).sendKeys("ranjitha666@gmail.com");
		String attribute6 = driver.findElement(By.name("email")).getAttribute("value");
		System.out.println(attribute4);
		System.out.println(attribute5);
		System.out.println(attribute6);
		WebElement w1 = driver.findElement(By.name("country"));
		Select s1 = new Select(w1);
		s1.selectByValue("India");
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> options = s1.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getAttribute("value"));
		}

		driver.findElement(By.name("message")).sendKeys("comitt");
		// driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.className("link")).click();
		driver.findElement(By.xpath("//*[@class=\"text-center module-title\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"btn-orange header-button \"]")).click();
		driver.findElement(By.name("subdomain")).sendKeys("ranjitha");
		driver.findElement(By.name("FirstName")).sendKeys("ranjitha");
		driver.findElement(By.name("LastName")).sendKeys("selvam");
		driver.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[1]/li[2]/a")).click();
		

		Thread.sleep(1000);
		driver.close();

	}

}
