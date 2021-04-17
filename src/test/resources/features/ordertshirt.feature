Feature: ordertshirt

  Scenario: Order TShirt (and Verify in Order History)
    Given User is on Home Screen using "UserName" and "Password"
    And User clicks on Tshirt Tab
    When User select Tshirt And click on Add to the Cart
    Then Item is added to Cart
    Example:
    |UserName|Password|
    |deepqa86@gmail.com|Asdf@1234|

  Scenario: Update Personal Information
    Given User navigate to Personal Information Page
    When User update first name using "First Name" and "Old Password" and click on save button
    Then User is able to see a success message.
    Example
    |First Name|Old Password|
    |DeepakShan|Asdf@1234|
