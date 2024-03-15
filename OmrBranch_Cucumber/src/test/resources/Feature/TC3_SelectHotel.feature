Feature: Verifying Select Hotel Page

 
  Scenario Outline: Verify if filter listed same are checked in and hotel names end with same selected room type.
    Given User in OMR branch hotel page
    When User enter "<Username>" and "<Password>"
    Then User should verify after login success message "Welcome Kulasekaran"
    When User search by entering all the fields "<State>","<City>","<roomType>","<Check-in>","<Check-out>","<noRooms>","<noAdult>" and "<noChild>"
    Then User sould verify after select hotel success message "Select Hotel"
    And User should verify hotel names ended with selected "<roomTpe>" successfully

    Examples: 
      | Username                 | Password    | State      | City       | roomType | Check-in   | Check-out  | noRooms | noAdult | noChild |
      | praveenraj9747@gmail.com | Mightguy99* | Tamil Nadu | Puducherry | Standard | 2024-03-26 | 2024-03-29 | 2-Two   | 2-Two   |       2 |
	
  Scenario Outline: Verify if hotel names are sorted in ascending order in explore hotel page
    Given User in OMR branch hotel page
    When User enter "<Username>" and "<Password>"
    Then User should verify after login success message "Welcome Kulasekaran"
    When User search by entering all the fields with all rooms "<State>","<City>","<roomType>","<Check-in>","<Check-out>","<noRooms>","<noAdult>" and "<noChild>"
    Then User sould verify after select hotel success message "Select Hotel"
    When User click the name ascending button
    Then User should verify Hotel names after click the name ascending button if it has sorted in ascending order successfully
    Examples: 
      | Username                 | Password    | State      | City       | roomType                            | Check-in   | Check-out  | noRooms | noAdult | noChild |
      | praveenraj9747@gmail.com | Mightguy99* | Tamil Nadu | Puducherry | Standard/Deluxe/Suite/Luxury/Studio | 2024-03-26 | 2024-3-29 | 2-Two   | 2-Two   |       2 |
	@e2r
  Scenario Outline: Verify if hotel price is sorted in descending order in explore hotel page
    Given User in OMR branch hotel page
    When User enter "<Username>" and "<Password>"
    Then User should verify after login success message "Welcome Kulasekaran"
    When User search by entering all the fields "<State>","<City>","<roomType>","<Check-in>","<Check-out>","<noRooms>","<noAdult>" and "<noChild>"
    Then User sould verify after select hotel success message "Select Hotel"
    When User click the price high-low option button
    Then User should verify hotel price after click the price high-low option button if it is sorted descending order successfully

    Examples: 
      | Username                 | Password    | State      | City       | roomType                            | Check-in   | Check-out  | noRooms | noAdult | noChild |
      | praveenraj9747@gmail.com | Mightguy99* | Tamil Nadu | Puducherry | Standard/Deluxe/Suite/Luxury/Studio | 2024-03-26 | 2024-3-29 | 2-Two   | 2-Two   |       2 |

  Scenario Outline: Verify select hotel module by accepting alert
    Given User in OMR branch hotel page
    When User enter "<Username>" and "<Password>"
    Then User should verify after login success message "Welcome Kulasekaran"
    When User search by entering all the fields "<State>","<City>","<roomType>","<Check-in>","<Check-out>","<noRooms>","<noAdult>" and "<noChild>"
    Then User sould verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verify "Book Hotel" success message after navigate to book hotel

    Examples: 
      | username                 | password    | state      | city       | roomType                            | checkin    | checkout   | noRooms | noAdult | noChild |
      | praveenraj9747@gmail.com | Mightguy99* | Tamil Nadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-20 | 2024-03-24 | 2-Two   | 2-Two   |       4 |

  Scenario Outline: Verifying select hotel by giving cancel to alert
    Given User in OMR branch hotel page
    When User enter "<Username>" and "<Password>"
    Then User should verify after login success message "Welcome Kulasekaran"
    When User search by entering all the fields "<State>","<City>","<roomType>","<Check-in>","<Check-out>","<noRooms>","<noAdult>" and "<noChild>"
    Then User sould verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User cancel the alert to select hotel
    Then User should verify after select hotel success message "Select Hotel"

    Examples: 
      | username                 | password    | state      | city       | roomType                            | checkin    | checkout   | noRooms | noAdult | noChild |
      | praveenraj9747@gmail.com | Mightguy99* | Tamil Nadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-20 | 2024-03-24 | 2-Two   | 2-Two   |       4 |
