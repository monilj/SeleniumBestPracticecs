import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Date;

public class TakeScreenshotInSelenium extends  SelectClassToDropDown{
    SelectClassToDropDown selectClassToDropDown = new SelectClassToDropDown();
    @BeforeTest
    public void start()
    {
        selectClassToDropDown.setUp();
    }
    @Test
    public  void takeScreenshot(){
        Date d = new Date();
        String d1 = d.toString().replaceAll(":","_");
         TakesScreenshot ts =(TakesScreenshot) driver;
        File scFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("");
    }


}
