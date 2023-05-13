package utilities;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBase {
   protected WebDriver driver;
   @Before
    public void setup() {
       System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_win32/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
   }
       @After
       public void teardown(){
       driver.close();
       }

}
