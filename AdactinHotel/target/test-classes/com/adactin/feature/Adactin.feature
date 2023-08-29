Feature: Booking Hotel In Adactin Website

#Scenario Outline: Login Functionality
#Given user Launch The Adactin Applicaton
#When user Enter The "<Username>" In Username Field
#And user Enter The "<Password>" In Password Field
#Then user Click On The Login Button And It Navigate To Search Hotel Page
#
#Examples:
#
#        |Username  | Password  |
#        |Balaji001 | balaji003 |
#        |Balaji00  | bala001   |
#        |Balaji001 | balaji001 |
#        |Balaji00  | balaji003 |
#        |Balaji001 | balaji003 |
        
Scenario: Login Functionality
Given user Launch The Adactin Applicaton
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click On The Login Button And It Navigate To Search Hotel Page


Scenario: Searching Hotel

When user Select The Location In Select Location Field
And user The Hotel In Select Hotel Field
And user Select The Room Type In Select Room Type Field
And user Select Number Of Rooms In Drop Down
And user Enter The Check In Date
And user Enter Check Out Date
And user Enter Adult Per Rooms
And user Enter Children Per Rooms
Then user Click On The Search Button And It Naviagate To Select Hoetel Page


Scenario: Select Hotel

When user Click On The Radio Button Select Field
Then user Click On The Continue Button It Navigate To Hotel Review Page



Scenario: Hotel Review

When user Enter The First Name In User Field
And user Enter The Last Name In User Field
And user Enter The Billing Address
And user Enter The Credit Card Number
And user Enter The Card Type
And user Select Expiry Date And Expiry Year
And user Enter The Cvv
Then user Click On The Book Now Button





