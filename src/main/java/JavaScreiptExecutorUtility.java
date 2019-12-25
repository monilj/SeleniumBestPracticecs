import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScreiptExecutorUtility {
    WebDriver driver;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver();
    }
    @Test
    public static void drawBorder(WebElement element, WebDriver driver){
         JavascriptExecutor jse = ((JavascriptExecutor)driver);
         jse.executeScript("argument[0].style.border=3px solid red",element);
    }
    @Test
    public void generateAlert(WebDriver driver, String message){
        JavascriptExecutor jse = ((JavascriptExecutor)driver);
        jse.executeScript("alert('"+message+"')") ;

    }
    @Test
    public void javascriptClick(WebDriver driver, WebElement element){
        JavascriptExecutor jse = ((JavascriptExecutor)driver);
        jse.executeScript("argument[0].click();",element);

    }
    @Test
    public void javascriptRefresh(WebDriver driver){
        JavascriptExecutor jse = ((JavascriptExecutor)driver);
        jse.executeScript("history.go(0)");

    }
}
