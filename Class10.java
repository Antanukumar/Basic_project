package Basic_project.Basic_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class10 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");

		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchBox.sendKeys("Mobile");

		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		searchButton.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(searchBox));


		
		searchBox.click();
		
		Actions act =new Actions(driver);
		
		act.scrollByAmount(0, 100).perform();
		
		Thread.sleep(5000);
		
		act.scrollByAmount(0, -500).perform();
		
		
		
		
	}

}