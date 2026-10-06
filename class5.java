package Basic_project.Basic_project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class5 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
	String parentid =	driver.getWindowHandle();
	
	System.out.println(parentid);
	
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/header/div[1]/div[1]/a")).click();
	
	
	
	
	Set<String> parentchild=driver.getWindowHandles();
	
	System.out.println(parentchild);
	
	
	parentchild.remove(parentchild);
	
	for(String windowid : parentchild) {
		
		driver.switchTo().window(windowid);
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
	
	
	driver.quit();
	
	
		
		

	}

}
