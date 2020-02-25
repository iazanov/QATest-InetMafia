Feature: Login User

  Scenario: Login User
    Then Click "Вход" Button
    Then Input Login
    Then Input Password
    Then Click Button "Enter"
    Then Click Profile
    Then Content with "Azanov Ilya" visible

