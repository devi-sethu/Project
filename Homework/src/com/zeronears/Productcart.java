package com.zeronears;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Productcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\testing\\Homework1\\Homework\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://zeronears.brixhab.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("menu-item-7068")).click();
		driver.findElement(By.cssSelector("li.show-image:nth-child(1) > div:nth-child(2) > a:nth-child(1) > div")).click();
		driver.findElement(By.cssSelector(".swatch-medium")).click();
		WebElement qty = driver.findElement(By.cssSelector("input.input-text"));
	    qty.clear();
	    qty.sendKeys("2");
	    driver.findElement(By.cssSelector("button.single_add_to_cart_button")).click();
	    driver.findElement(By.cssSelector(".woocommerce-message > a")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
