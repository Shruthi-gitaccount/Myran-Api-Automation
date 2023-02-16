Feature: Login Functionality
  @validLogin
  Scenario: User Should Login With Valid Credentials
    Given Post Login API
    When Provide Valid Credential
    Then Status_code equals 200
  @invalidLogin
  Scenario Outline: Email and Password Validation in Login API
    Given Post Login API
    When Provide different combinations to "<email>", "<password>"
    Then Status_code equals <statuscode>
    And  Response contains message equals "<message>"
    Examples:
      | email        | password | statuscode | message                      |
      | abc@mail7.io | password | 400        | invalid_username_or_password |