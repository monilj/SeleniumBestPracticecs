import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

import javax.swing.*;

public class MouseMovement {
    WebDriver driver;
    @BeforeTest
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("http://spicejet.com/");
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("About us"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Fleet")).click();

    }
}
