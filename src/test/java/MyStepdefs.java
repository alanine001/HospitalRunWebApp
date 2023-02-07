import Pages.CommonMethods;
import Pages.DashboardPage;
import Pages.PatientsPage;
import Util.Constants;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
//import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    WebDriver driver;
    DashboardPage dashboardPage;
    PatientsPage PatientsPage;

    @BeforeStep
    public void start()
    {
    driver =TestRunner.driver;
    dashboardPage = new DashboardPage(driver);
    PatientsPage = new PatientsPage(driver);

    }
    @Given("user navigates to the application")
    public void userNavigatesToTheApplication() {

        driver.get(Constants.url);
    }
    @Then("user is navigated to the Dashboard page")
    public void userIsNavigatedToTheDashboardPage() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        String DPText= dashboardPage.dashboard_text.getText();
        System.out.println("HospitalRun Test ........." + DPText);
        assertTrue(DPText.equals("Dashboard"));
    }

    @When("the user clicks on Patients under the Menu")
    public void theUserClicksOnPatientsUnderTheMenu()
    {
        CommonMethods.elementsclick(PatientsPage.Patients);
    }

    @Then("The user is navigated to Patients page")
    public void theUserIsNavigatedToPatientsPage()
    {

        assertTrue(PatientsPage.PatientsText.equals("Patients"));
    }

    @When("the user clicks New patient button")
    public void theUserClicksNewPatientButton()
    {
        CommonMethods.elementsclick(PatientsPage.NewPatientButton);
    }

    @Then("The user is navigated to New Patient page")
    public void the_user_is_navigated_to_new_patient_page() {
        assertTrue(PatientsPage.NewPatientText.equals("New Patient"));
    }
    @When("The user fills in mandatory field Given name")
    public void theUserFillsInMandatoryFieldGivenName()
    {
        String GivenName = "Sam";
        PatientsPage.GivenNameField.sendKeys(GivenName);

    }

    @And("Clicks Create Patients Button")
    public void clicksCreatePatientsButton()
    {
        CommonMethods.elementsclick(PatientsPage.CreatePatientButton);
    }

    @Then("The user is able to see the Patient page with Patient details")
    public void theUserIsAbleToSeeThePatientPageWithPatientDetails()
    {
        assertTrue(PatientsPage.PatientDetailsPage.equals("PatientDetailsPage"));
    }


}
