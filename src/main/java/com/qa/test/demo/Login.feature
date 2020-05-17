#Author: ujjwal.saxena


Feature: Login Page Verification

  
  Scenario: Achieve application Media processor Login scenario
    Given I am on Achieve Int environment
    And   I want Title of page
    When  I provide "sfqatest13mqy20@yopmail.com" and "Qait@123"
    Then  I lands on Homepage of Achieve Media processeor 
    Then  I close the browser

    
    