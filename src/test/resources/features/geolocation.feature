Feature: Geolocation test

  Scenario: Test option geolocation
    Given that deisy enters the geolocation option
    When she clicked on the Where am I button
    Then she should see the latitude and longitude value

