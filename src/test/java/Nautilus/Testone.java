package Nautilus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testone {
	
	@Test
	public void mvntest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		String htitle = driver.getTitle();
		System.out.println(htitle);
		String etitle = "actiTIME - Enter Time-Track";
		if (htitle.equals(etitle)) {
			System.out.println("Homepage is Verified");
		} else {
			System.out.println("Homepage is Not Verified");
		}
		driver.findElement(By.id("logoutLink")).click();
		driver.close();

	}

}
