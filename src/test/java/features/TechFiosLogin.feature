@LoginFeature
Feature: Tecfios billing login functionality validation


@Scenario1 @Smoke
Scenario: User should be to login with credentials
               Given User is on techfios login page
               When User enters username as  "demo@techfios.com"
               When User enters password as "abc123"
               When   User clicks on signin button
               Then User should land on Dashboard page
                
 @Scenario2         
   Scenario: User should be to login with credentials
               Given User is on techfios login page
               When User enters username as  "demo@techfios.com"
               When User enters password as "abc123"
               When   User clicks on signin button
               Then User should land on Dashboard page
     