import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassToDropDown {
    WebDriver driver;
        @BeforeTest
        public void setUp(){
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
             driver.get("http://192.168.34.89/ActionAutomationPage.html");
        }

        @Test
        public void dropDown(){
        Select drp = new Select(driver.findElement(By.id("dropdown-class-example")));
        drp.selectByIndex(0);
        drp.selectByValue("option2");
        drp.selectByVisibleText("Option3");
        System.out.printf(String.valueOf(drp.isMultiple()));
        drp.deselectByIndex(0);
        drp.deselectByValue("option2");
        drp.deselectAll();
        List<WebElement> allOpt = drp.getAllSelectedOptions();
        for(int i=0; i<allOpt.size();i++)
        {
            String options = allOpt.get(i).getText();
            System.out.println(options);
        }

        }

}
