
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/HospitalRunWebApp/report.html"},
        features = {"src/test/resources/features"},
        glue = {"java"}

)
public class TestRunner
{
    /**
     * *Rigorous Test
     */
    public static WebDriver driver;

    @Before
    public static void startBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

@After
public static void stopBrowsing (){
    // driver.close();

}

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(true);
    }

}

