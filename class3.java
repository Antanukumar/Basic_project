
//navigate the facebook string url
//
//navigate the amazon url
//
//perform backowrd , forward ,refresh action 
//
//stop the server



package Basic_project.Basic_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.navigate().to("https://www.facebook.com/");
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().to("https://www.amazon.com/");
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		
//		
//		driver.navigate().forward();
		
		
//		driver.navigate().refresh();
		
		
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.amazon.com/");
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		
		driver.quit();
		
		

	}

}
