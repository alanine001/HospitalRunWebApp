package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class DashboardPage {
    WebDriver driver;
    public DashboardPage(WebDriver Driver)
    {
        this.driver = Driver;

        PageFactory.initElements(driver, this);

    }

        @FindBy(xpath= "//*[@data-icon=\"chevron-left\"]")
        public WebElement left_cursor;

        @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
        public WebElement dashboard_text;





}