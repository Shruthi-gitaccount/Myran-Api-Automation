Feature: Login Functionality
  @testFollowups
  Scenario: Authorized user able to access folloups details
    Given Get a organization details with orgaizationId 1283
    Then Organization should be found and Status_code equals 100
    Then id equlas to "[5a17f806-5601-4076-d6eb-08db0da9fb55, ff026c2a-b721-4443-f78d-08db09a8ceea, bb55b2cc-baca-4ce1-d4f7-08db08461644, 008eac97-561d-4217-d4f6-08db08461644, 5934cac9-c52d-42ef-da9b-08db02c9aeb0]"
    #Given A list of latest followups are available
    #Then Status_code equals 200
    #Given A list of all followups are available
    #Then Status_code equals 200
    #When Add a followup to an organization
    #Then Status_code equals 204
    #When Update a followp for an organization with ID
    #Then Status_code equals 204
    #When Delete a followup with an ID
    #Then Status_code equals 204