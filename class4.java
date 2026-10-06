// TestCase:
// 1. Navigate to "https://shoppersstack.com/products_page/27"
// 2. Click on Compare icon
// 3. Get the parent window id and child window ids
// 4. Stop the server (quit driver)

package Basic_project.Basic_project;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class class4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://shoppersstack.com/products_page/27");

		new WebDriverWait(driver, Duration.ofSeconds(10));

		// Step 1: capture parent window handle BEFORE the click
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window ID: " + parentWindow);

		// Step 2: click the Compare icon
		// NOTE: verify this locator against the actual page in DevTools —
		// this is a placeholder since I can't inspect the live site directly.
		driver.findElement(By.xpath("//*[contains(@class,'compare') or contains(@title,'Compare')]"))
				.click();

		// Step 3: get all window handles (parent + any new child window)
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("All window IDs: " + allWindows);

		// Loop through and identify/switch to the child window
		for (String windowId : allWindows) {
			if (!windowId.equals(parentWindow)) {
				System.out.println("Child window ID: " + windowId);
				driver.switchTo().window(windowId);
				// you can now interact with the child window here if needed
			}
		}

		// Switch back to the parent window before quitting
		driver.switchTo().window(parentWindow);

		// Step 4: stop the server
		driver.quit();
	}

}