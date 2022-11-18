Feature: Retail Home page

  Background: 
    Given User is on retail website

  @AllSection
  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @Department
  Scenario Outline: Verify department sidebar options
    When User click on All section
    And User is on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |

  @AddItemToCart
  Scenario: Verify User can add an item to cart
    When User click on Sign in option
    And user enter email 'shaheera.gh@gmail.com' and password 'Usa@1414'
    And User click on Login button
    And User should be logged in into account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @PlaceAnOrder
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'shaheera.gh@gmail.com' and password 'Usa@1414'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country     | fullName | phoneNumber | streetAddress | apt | city       | state  | zipCode |
      | Afghanistan | Eeraa    |  1234567898 | Macroyan      | 230 | lesemaryam | Parwan |   22193 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234557990798765 | sharbanoo  |              11 |           2022 |          786 |
    And User click on Add your card  button
    And User click on Place Your  Order
    Then a message should be displayed Order Placed,  Thanks

  @secondItemAddToCart
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'shaheera.gh@gmail.com' and password 'Usa@1414'
    And User click on login button
    And User should be logged in into Account
    And User change the category To 'Electronics'
    And User search For an item 'Apex Legends '
    And User click on Search ICON
    And User click on ITEM
    And User select Quantity '5'
    And User click ADD to Cart button
    Then the cart icon quantity should CHANGE to '5'
    And User click on Cart OPTION
    And User click on PROCEED to Checkout button
    And User click on Place Your ORDER
    Then a message should be displayed Order Placed, THANKS
