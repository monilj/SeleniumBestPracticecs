import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleCalenderUsingJavaScript {
    WebDriver driver;
    @BeforeTest
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("http://spicejet.com/");
        Thread.sleep(3000);
        WebElement dateElement= driver.findElement(By.id("ct100_mainContent_txt_Fromdate"));
        String dateValue="30-12-2019";
        selectDateUsingJs(driver,dateElement,dateValue);
    }

    public void selectDateUsingJs(WebDriver driver,WebElement element,String dateValue){
        JavascriptExecutor jse= ((JavascriptExecutor)driver);
        jse.executeScript("argument[0].serAttribute(value,'"+dateValue+"');",element);

    }
}
