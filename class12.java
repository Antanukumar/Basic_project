package Basic_project.Basic_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class class12 {

    public static void main(String[] args) throws IOException {
        
        // Setup ChromeDriver executable
//        WebDriver.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");
        
        // Capture screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        
        // Target destination (Cross-platform compatible pathing)
        File trg = new File(System.getProperty("user.dir") + "/screenshot1/homepage.png"); 
        
        // Must use copyFile because 'src' is an image file, not a directory
        FileUtils.copyFile(src, trg);
        
        System.out.println("Screenshot saved to: " + trg.getAbsolutePath());
        
        // Cleanly close all browser windows and terminate WebDriver process
        driver.quit();
    }
}