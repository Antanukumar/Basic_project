package Basic_project.Basic_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class9 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		WebElement email= driver.findElement(By.name("email"));
		email.sendKeys("Antanu");
		email.click();
		
		WebElement password= driver.findElement(By.name("pass"));
		password.sendKeys("password1");
		password.click();
		
		
		WebElement log= driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div"));
		
		log.click();
		
		
		System.out.println(log.isEnabled());
		
		if(log.isEnabled()) {
			log.click();
			
		}else {
			System.out.println("log in disable");
			
			
		}
		
		driver.quit();
		
		
		

	}

}
