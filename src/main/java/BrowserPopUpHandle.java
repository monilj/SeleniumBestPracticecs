import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class BrowserPopUpHandle {
    WebDriver driver;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void testPop()
    {
        driver.get("");
        Set<String> handler =  driver.getWindowHandles();
        Iterator<String> it =handler.iterator();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);

    }

}
