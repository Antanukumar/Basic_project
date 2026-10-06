// 1. Navigate to MakeMyTrip
// 2. Close the popup using xpath by attribute
// 3. Click on Search using xpath by text

package Basic_project.Basic_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class class6 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.makemytrip.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement closeBtn = wait.until(
			ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-cy='closeModal']"))
		);
		closeBtn.click();

		
		

		driver.quit();
	}

}