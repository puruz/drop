package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.K.MASS\\eclipse-workspace\\Web\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://output.jsbin.com/osebed/2");
		d.manage().window().maximize();
		WebElement drop = d.findElement(By.id("fruits"));
        Select w = new Select(drop);
		w.selectByIndex(0);
		w.selectByIndex(1);
		w.selectByIndex(2);
		Thread.sleep(3000);
		w.deselectAll();
		
		
		
		
		
	}

}
