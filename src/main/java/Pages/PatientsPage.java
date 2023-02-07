package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientsPage {

    WebDriver driver;

    public PatientsPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this );

    }


         @FindBy(xpath="//*[@class='nav-item list-group-item'][2]")
         public WebElement Patients;

         @FindBy(xpath = "//*[contains(text(),'Patients')]")
         public WebElement PatientsText;

         @FindBy(xpath = "//*/main/div[1]/h1")
         public WebElement NewPatientText;


        @FindBy(xpath= "//*[@type='button'][1] ")
        public WebElement NewPatientButton;


        @FindBy(xpath ="//*[@id='givenNameTextInput']")
        public WebElement GivenNameField;

        @FindBy(xpath = "//*[@class='btn-save mr-2 btn btn-success']")
        public WebElement CreatePatientButton;

        @FindBy(xpath = "//*/main/div[2]/div/div/div/div/div/h3")
        public WebElement PatientDetailsPage;




}
