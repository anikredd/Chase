#Author: kumarqa62@gmail.com
Feature: Verify Install and Screens of Chase Mobile App

  Scenario Outline: Verify Successful App Launch
    Given A Chase Mobile App
    When I launch the app on "<Platform>" and "<Version>" and "<DeviceId>"
    Then I should view the Logon Screen

    Examples: TestData
      | Platform | Version | DeviceId           |
      | Android  |     7.0 | 9889a437344b415a55 |

  Scenario Outline: Verify Enroll Button and Basic Info Screen
    Given A Chase Mobile App
    When I launch the app on "<Platform>" and "<Version>" and "<DeviceId>"
    And I Tap on Enroll Button
    Then I should view the Basic Info Screen

    Examples: TestData
      | Platform | Version | DeviceId           |
      | Android  |     7.0 | 9889a437344b415a55 |
