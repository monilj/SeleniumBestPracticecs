import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleDynamicWebTable {

    WebDriver driver;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void testPop()
    {
        driver.findElement(By.xpath("//a [contains(text(),test2_test2']/parent::parent_tag//preceding-sibling::tagname//input[@name='']"));
    }

}
