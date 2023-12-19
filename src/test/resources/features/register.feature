@regression
Feature: Register
  As a User i would like to test register functionality


  @author_RegisterTeam @sanity
  Scenario: Verify user should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    Then I verify the register text is displayed

  @author_RegisterTeam @smoke
  Scenario: Verify that Firstname Lastname Email Password and Confirm Password fields are mandatory
    Given I am on homepage
    When I click on register link
    And I click on register button
    Then I get a error message for first name is required
    And I get error message for last name is required
    And I get error message for email is required
    And I get error message for password is required
    And I get error message for confirm password is required

  @author_RegisterTeam @sanity
  Scenario: Verify that user should create account successfully
    Given I am on homepage
    When I click on register link
    And I click on gender female radio button
    And I enter first name "Indu"
    And I enter last name "Sharma"
    And I click on date tab from dropDown menu
    And I click on month tab from dropDown menu
    And I click on year tab from dropDown Menu
    And I enter email "xyz123@gmail.com"
    And I enter password "Abc123"
    And I enter confirm password "Abc123"
    Then I click on register Tab
    Then I verify registration successful
