package Basic_project.Basic_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class de {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        
        driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
        
        driver.findElement(By.id("gender-male")).click();
        
        driver.findElement(By.id("FirstName")).sendKeys("Antanu");
        
        
        driver.findElement(By.id("LastName")).sendKeys("Thakur");
        
        

        driver.findElement(By.id("Email")).sendKeys("antanu@gmail.com");
        
        
        
        driver.findElement(By.id("Password")).sendKeys("antanukumar@");
        
        
        driver.findElement(By.id("ConfirmPassword")).sendKeys("antanukumar@");
        
        
        
        driver.findElement(By.id("register-button")).click();
        
  
        
        
        driver.findElement(By.id("small-searchterms")).sendKeys("phone");
        
        
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
        
        
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[3]/div/div[2]/div[3]/div[2]/input")).click();
        
        
        
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        
        driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
        
        
        
        driver.findElement(By.xpath("//input[@name=\"discountcouponcode\"]")).sendKeys("pp12");
        
        
        
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        
        
        
        driver.findElement(By.id("id=\"CountryId\"")).click();
        
        
        driver.findElement(By.xpath("//input[@id=\"termsofservice\"]")).click();
        
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        
        
        
        
        
        

    }
}