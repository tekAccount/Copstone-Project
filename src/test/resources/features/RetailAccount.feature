Feature: Retail Account feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'shaheera.gh@gmail.com' and password 'Usa@16164'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @UpdatePassword
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'shuhuraj' and Phone '5715676782'
    And User click on Update button
    Then user profile information should be updated

  @changepassword
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Usa@1616         | Usa@16164   | Usa@16164       |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @Payment
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567899876546 | karimi     |              11 |           2022 |          498 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @UpdateCard
  Scenario: Verify User can edit Debit or Credit card
    And User select the payment Card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567891234568 | shaheera   |              11 |           2026 |          123 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @Removecard
  Scenario: Verify User can remove Debit or Credit card
    And User select the payment Card
    And User click on remove option of card section
    Then payment details should be removed

  @AddAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill address form with below information
      | country     | fullName    | phoneNumber | streetAddress | apt | city        | state | zipCode |
      | Afghanistan | shaheerajan |  9876543210 | 2nd           | 412 | khair khana | Kabul |   22191 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below information
      | country     | fullName | phoneNumber | streetAddress | apt | city       | state | zipCode |
      | Afghanistan | zarif    |  9876543210 | 3nd           | 430 | shar khana | Kabul |   22191 |
    And User click update Your Address button
    Then a message should be displayed Address Updated Successfully

  @removedaddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
