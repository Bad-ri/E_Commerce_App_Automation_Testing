package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePom {
    public WebDriver open_browser(WebDriver driver){
        String path = System.getProperty("user.dir")+"\\src\\main\\resources\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}