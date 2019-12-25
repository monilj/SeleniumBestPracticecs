import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class googleSearchAutomator {
    WebDriver driver;
@BeforeTest
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();
    driver.get("https://www.google.com/");
}
@Test
    public void searchTest(){
    driver.findElement(By.name("q")).sendKeys("testing");
    driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sb1']/span")).get(0).click();
}

}

