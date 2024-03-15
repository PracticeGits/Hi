Feature: Verify Book Hotel page

  Scenario Outline: Verifying Book hotel module by entering debit card with special request
    Given User is in OMR Branch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Chiran"
    When User search by entering all the fields "<state>","<city>","<roomType>","<checkin>","<checkout>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verif "Book Hotel" success message after navigate to book hotel
    When User add the guest details "<salution>","<firstname>","<lastname>","<mobile>"and"<email>"
    And User add GST details "<reqNo>","<companyName>"and"<companyAddress>"
    And User add special request "<otherReq>"
    And User add the payment details "<cardType>"
      | card       | cardNumber       | NameOnCard  | month | year | cvv |
      | visa       | 5555555555552222 | chiranjeevi | Oct   | 2026 | 222 |
      | masterCard | 5666323243232390 | chiranjeevi | Oct   | 2026 | 222 |
      | amex       | 5666323243232316 | chiranjeevi | Oct   | 2026 | 222 |
      | masterCard | 5666323243232332 | chiranjeevi | Oct   | 2026 | 222 |
    Then User should verify after booking hotel success message "Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username                  | password  | state      | city       | roomType                            | checkin    | checkout   | noRooms | noAdult | noChild | Salutation | firstName   | lastName | Mobile     | email                     | regNo      | companyName            | companyAddress | otherReq                                                                 | cardType  |
      | praveenraj9747@gmail.com | Mightguy99* | Tamil Nadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-20 | 2024-03-24 | 2-Two   | 2-Two   |       4 | Mr.        | Chiranjeevi | R        | 8220549878 | praveenraj9747@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | DebitCard |

  Scenario Outline: Verifying Book hotel module by entering credit card with special request
    Given User is in OMR Branch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Chiran"
    When User search by entering all the fields "<state>","<city>","<roomType>","<checkin>","<checkout>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verif "Book Hotel" success message after navigate to book hotel
    When User add the guest details "<salution>","<firstname>","<lastname>","<mobile>"and"<email>"
    And User add GST details "<reqNo>","<companyName>"and"<companyAddress>"
    And User add special request "<otherReq>"
    And User add the payment details "<cardType>"
      | card       | cardNumber       | NameOnCard  | month | year | cvv |
      | visa       | 5555555555552222 | chiranjeevi | Oct   | 2026 | 222 |
      | masterCard | 5666323243232390 | chiranjeevi | Oct   | 2026 | 222 |
      | amex       | 5666323243232316 | chiranjeevi | Oct   | 2026 | 222 |
      | masterCard | 5666323243232332 | chiranjeevi | Oct   | 2026 | 222 |
    Then User should verify after booking hotel success message "Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username                  | password  | state      | city       | roomType                            | checkin    | checkout   | noRooms | noAdult | noChild | Salutation | firstName   | lastName | Mobile     | email                     | regNo      | companyName            | companyAddress | otherReq                                                                 | cardType   |
      | praveenraj9747@gmail.com | Mightguy99* | Tamil Nadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-20 | 2024-03-24 | 2-Two   | 2-Two   |       4 | Mr.        | Chiranjeevi | R        | 8220549878 | praveenraj9747@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | CreditCard |

  Scenario Outline: Verifying Book Hotel module by entering debit card without special request
    Given User is in OMR Branch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Chiran"
    When User search by entering all the fields "<state>","<city>","<roomType>","<checkin>","<checkout>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verif "Book Hotel" success message after navigate to book hotel
    When User add the guest details "<salution>","<firstname>","<lastname>","<mobile>"and"<email>"
    And User add GST details "<reqNo>","<companyName>"and"<companyAddress>"
    And User click next without entering special request
    And User add the payment details "<cardType>"
      | card       | cardNumber       | NameOnCard  | month | year | cvv |
      | visa       | 5555555555552222 | chiranjeevi | Oct   | 2026 | 222 |
      | masterCard | 5666323243232390 | chiranjeevi | Oct   | 2026 | 222 |
      | amex       | 5666323243232316 | chiranjeevi | Oct   | 2026 | 222 |
      | masterCard | 5666323243232332 | chiranjeevi | Oct   | 2026 | 222 |
    Then User should verify after booking hotel success message "Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username                  | password  | state      | city       | roomType                            | checkin    | checkout   | noRooms | noAdult | noChild | Salutation | firstName   | lastName | Mobile     | email                     | regNo      | companyName            | companyAddress | otherReq                                                                 | cardType  |
      | praveenraj9747@gmail.com | Mightguy99* | Tamil Nadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-20 | 2024-03-24 | 2-Two   | 2-Two   |       4 | Mr.        | Chiranjeevi | R        | 8220549878 | praveenraj9747@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | DebitCard |

  Scenario Outline: Verifying Book Hotel module by entering credit card without special request
    Given User is in OMR Branch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Chiran"
    When User search by entering all the fields "<state>","<city>","<roomType>","<checkin>","<checkout>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verif "Book Hotel" success message after navigate to book hotel
    When User add the guest details "<salution>","<firstname>","<lastname>","<mobile>"and"<email>"
    And User add GST details "<reqNo>","<companyName>"and"<companyAddress>"
    And User click next without entering special request
    And User add the payment details "<cardType>"
      | card       | cardNumber       | NameOnCard  | month | year | cvv |
      | visa       | 5555555555552222 | chiranjeevi | Oct   | 2026 | 222 |
      | masterCard | 5666323243232390 | chiranjeevi | Oct   | 2026 | 222 |
      | amex       | 5666323243232316 | chiranjeevi | Oct   | 2026 | 222 |
      | masterCard | 5666323243232332 | chiranjeevi | Oct   | 2026 | 222 |
    Then User should verify after booking hotel success message "Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username                  | password  | state      | city       | roomType                            | checkin    | checkout   | noRooms | noAdult | noChild | Salutation | firstName   | lastName | Mobile     | email                     | regNo      | companyName            | companyAddress | otherReq                                                                 | cardType   |
      | praveenraj9747@gmail.com | Mightguy99* | Tamil Nadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-20 | 2024-03-24 | 2-Two   | 2-Two   |       4 | Mr.        | Chiranjeevi | R        | 8220549878 | praveenraj9747@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | CreditCard |

  Scenario Outline: Verifying Book hotel module by entering debit card and special request without GST
    Given User is in OMR Branch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Chiran"
    When User search by entering all the fields "<state>","<city>","<roomType>","<checkin>","<checkout>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verif "Book Hotel" success message after navigate to book hotel
    When User add the guest details "<salution>","<firstname>","<lastname>","<mobile>"and"<email>"
    And User Click next without entering GST Details
    And User add special request "<otherReq>"
    And User add the payment details "<cardType>"
      | card       | cardNumber       | NameOnCard  | month | year | cvv |
      | visa       | 5555555555552222 | chiranjeevi | Oct   | 2026 | 222 |
      | masterCard | 5666323243232390 | chiranjeevi | Oct   | 2026 | 222 |
      | amex       | 5666323243232316 | chiranjeevi | Oct   | 2026 | 222 |
      | masterCard | 5666323243232332 | chiranjeevi | Oct   | 2026 | 222 |
    Then User should verify after booking hotel success message "Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username                  | password  | state      | city       | roomType                            | checkin    | checkout   | noRooms | noAdult | noChild | Salutation | firstName   | lastName | Mobile     | email                     | regNo      | companyName            | companyAddress | otherReq                                                                 | cardType  |
      | praveenraj9747@gmail.com | Mightguy99* | Tamil Nadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-20 | 2024-03-24 | 2-Two   | 2-Two   |       4 | Mr.        | Chiranjeevi | R        | 8220549878 | praveenraj9747@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | DebitCard |

  Scenario Outline: Verifying Book hotel module by entering credit card without GST and special request
    Given User is in OMR Branch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Chiran"
    When User search by entering all the fields "<state>","<city>","<roomType>","<checkin>","<checkout>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verif "Book Hotel" success message after navigate to book hotel
    When User add the guest details "<salution>","<firstname>","<lastname>","<mobile>"and"<email>"
    And User Click next without entering GST Details
    And User Click next without entering special request
    And User add the payment details "<cardType>"
      | card       | cardNumber       | NameOnCard  | month | year | cvv |
      | visa       | 5555555555552222 | chiranjeevi | Oct   | 2026 | 222 |
      | masterCard | 5666323243232390 | chiranjeevi | Oct   | 2026 | 222 |
      | amex       | 5666323243232316 | chiranjeevi | Oct   | 2026 | 222 |
      | masterCard | 5666323243232332 | chiranjeevi | Oct   | 2026 | 222 |
    Then User should verify after booking hotel success message "Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username                  | password  | state      | city       | roomType                            | checkin    | checkout   | noRooms | noAdult | noChild | Salutation | firstName   | lastName | Mobile     | email                     | regNo      | companyName            | companyAddress | otherReq                                                                 | cardType  |
      | praveenraj9747@gmail.com | Mightguy99* | Tamil Nadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-20 | 2024-03-24 | 2-Two   | 2-Two   |       4 | Mr.        | Chiranjeevi | R        | 8220549878 | praveenraj9747@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | DebitCard |

  Scenario Outline: Verifying Book hotel module without special request, GST details and payment details
    Given User is in OMR Branch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Chiran"
    When User search by entering all the fields "<state>","<city>","<roomType>","<checkin>","<checkout>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verif "Book Hotel" success message after navigate to book hotel
    When User add the guest details "<salution>","<firstname>","<lastname>","<mobile>"and"<email>"
    And User Click next without entering GST Details
    And User Click next without entering special request
    And User submit without entring payment details
    Then User should verify after booking hotel error message "Please select your card type","please select your card","please your card number","please provide name on your card","please provide your card expiry date"and "please provide your card security's code"
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username                  | password  | state      | city       | roomType                            | checkin    | checkout   | noRooms | noAdult | noChild | Salutation | firstName   | lastName | Mobile     | email                     | regNo      | companyName            | companyAddress | otherReq                                                                 | cardType  |
      | praveenraj9747@gmail.com | Mightguy99* | Tamil Nadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-20 | 2024-03-24 | 2-Two   | 2-Two   |       4 | Mr.        | Chiranjeevi | R        | 8220549878 | praveenraj9747@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | DebitCard |
