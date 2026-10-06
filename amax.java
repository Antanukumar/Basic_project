
package Basic_project.Basic_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amax {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        
        driver.manage().window().maximize();

         
        driver.get("https://www.amazon.in/");

       
        WebElement searchBar = driver.findElement(
                By.id("twotabsearchtextbox")
        );


        searchBar.sendKeys("iphone 18");

        
        WebElement clickBtn = driver.findElement(
                By.id("nav-search-submit-button")
        );

        
        clickBtn.click();

       
    
} }
