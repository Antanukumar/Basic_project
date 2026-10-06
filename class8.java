package Basic_project.Basic_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class8 {

	public static void main(String[] args) throws InterruptedException {
	
//		TestCase :
//			1. Navigate to amazon. in
//			2. Capture the attribute value for hello sign in WebE1ement .
//			3. capture the css value for Fashion link in Header .
//			4. Capture the tagname for fashion.
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement searchbtn=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		
		String placeholder= searchbtn.getAttribute("placeholder");
		
		System.out.println(placeholder);
		
		
	    Thread.sleep(3000);
		
		driver.close();
	

	}

}
