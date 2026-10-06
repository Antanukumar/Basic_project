// TestCase:
// 1. Navigate to the url "https://demowebshop.tricentis.com/"
// 2. Capture the title
// 3. Capture the url
// 4. Capture page source
// 5. Display/print the captured values
// 6. Stop the server (quit driver)

package Basic_project.Basic_project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");

//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("Current URL: " + currentUrl);
//
//		String title = driver.getTitle();
//		System.out.println("Title: " + title);
//
//		String pageSource = driver.getPageSource();
//		System.out.println("Page Source: " + pageSource);
//		
		
//		
//		String  currenturl= driver.getCurrentUrl();
//		
//		System.out.println("current Url" + currenturl);
		
		
//		String title=driver.getTitle();
//		
//		System.out.println("Title" + title);
		
		
		
		String pagesource =driver.getPageSource();
		
		System.out.println("pagesource" + pagesource);
		

		driver.quit();
	}

}