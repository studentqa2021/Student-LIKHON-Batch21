Feature: User able to login with valid username & password

Description: "User login orangenyhrm website & verify title"
 
#Background:   Contain common step     
@SmokeTest                                                
Scenario: User can login with valid username & password and verify the page

#Given User can open any browser
#And User able to enter url
# Above steps in cucumber hooks
Given User enter the userName and password 
When User click on the login button
Then User login successfull & verify the homepage

