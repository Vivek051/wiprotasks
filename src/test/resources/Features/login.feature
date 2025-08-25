Feature: Login Functionality

Scenario: Verify Login Successful
  Given Launch the Browser
  And Navigate to the URL
  When Enter the valid username and password
  And Click on Login Button
  Then Login should be successful
  And Verify dashboard
  Then Close the browser

Scenario: Verify Login Unsuccessful
  Given Launch the Browser
  And Navigate to the URL
  When Enter the invalid username and password
  And Click on Login Button
  Then Login should be unsuccessful
  Then Close the browser