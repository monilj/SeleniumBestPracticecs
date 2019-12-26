import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalenderAutomator {
    WebDriver driver;
    @BeforeTest
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://freecrm.com/");
        driver.findElement(By.name("username")).sendKeys("naveenk");
        driver.findElement(By.name("password")).sendKeys("test@123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);
    }
    @Test
    public void handleCalender(){
        String date="18-September-2019";
        String dateArray[]=date.split("-"); //{18,September,2019}
        String day=dateArray[0];
        String month=dateArray[1];
        String year=dateArray[2];

        Select selectMonth = new Select(driver.findElement(By.name("slctMonth")));
        selectMonth.selectByVisibleText(month);

        Select selectYear = new Select(driver.findElement(By.name("slctYear")));
        selectYear.selectByVisibleText(year);
        final int noOfWeekDays=7;
        String beforeXpath= "";
        String afterXpath="";
        boolean flag=false;
        String dayVal=null;
        for(int rowNum=2;rowNum<=7;rowNum++){
            for(int colNum=1; colNum<=noOfWeekDays;colNum++){
                try {
                    dayVal= driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
                }
                catch (NoSuchElementException nse){
                    System.out.println("Please enter correct date ");
                    flag=false;
                    break;
                }
                if(dayVal.equals(date)){
                    driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }



    }
}
