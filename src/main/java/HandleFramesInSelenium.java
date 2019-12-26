import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HandleFramesInSelenium {
    WebDriver driver;
    @BeforeTest
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("http://spicejet.com/");
        Thread.sleep(3000);
        driver.switchTo().frame("FrameName");
        driver.findElement(By.name("")).click();
    }
}
