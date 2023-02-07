Feature: User is able to create a patient

  Scenario: Crerating a patient with mandatory field
    Given user navigates to the application
    And user is navigated to the Dashboard page
    When the user clicks on Patients under the Menu
    Then  The user is navigated to Patients page
    When the user clicks New patient button
    Then The user is navigated to New Patient page
    When The user fills in mandatory field Given name
    And Clicks Create Patients Button
    Then The user is able to see the Patient page with Patient detailss
