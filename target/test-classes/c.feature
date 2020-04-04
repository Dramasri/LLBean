
@tag
Feature: Search jeans for womens

  @jeans
  Scenario: Search jeans from search module
    Given Launch the application
    When Searching for jeans for women
    Then List of products appeared
    
    
    @login
    Scenario: To login the account
    Given Launch the webpage
    When Move the element to account
    And Click login and enter the details
    And click the login button
    Then Takes to the home page
    
    

 