Feature: This is Demoblaze Login Functionalities

@ElementDisplayed
Scenario: Verify Login Link Displayed In Home Page
Given Launch Application <"URL">
Then Verify Login Link Displayed In Home Page

@ElementDisplayed
Scenario: Verify Login Page Displayed
Given Launch Application <"URL">
Then Click Login Link
Then Verify Login Page Displayed

@ElementDisplayed
Scenario: Verify Login Text Displayed
Given Launch Application <"URL">
Then Click Login Link
Then Verify Login Text Displayed

@ElementDisplayed
Scenario: Verify Username Field Displayed
Given Launch Application <"URL">
Then Click Login Link
Then Verify Username Field Displayed

@ElementDisplayed
Scenario: Verify Password Field Displayed
Given Launch Application <"URL">
Then Click Login Link
Then Verify Password Field Displayed

@ElementDisplayed
Scenario: Verify Login Button Displayed
Given Launch Application <"URL">
Then Click Login Link
Then Verify Login Button Displayed

@closeLoginPage
Scenario: Verify Login Page closes
Given Launch Application <"URL">
Then Click Login Link
Then Click Close Button
Then Verify Login Page closes

@login
Scenario: Verify User Can Login
Given Launch Application <"URL">
Then Click Login Link
Then User Input Credentials <"Username"> <"Password">
Then Click Login Button
Then Verify User Can Login

@invalidCredentials
Scenario: Verify User Redirected To Login Page If Blank Credentials
Given Launch Application <"URL">
Then Click Login Link
Then Click Login Button
Then Handle PopUp
Then Verify User Redirected To Login Page

@invalidCredentials
Scenario: Verify User Redirected To Login Page If Invalid Username 
Given Launch Application <"URL">
Then Click Login Link
Then User Input Invalid CredentialU <"InvalidUsername"> <"Password">
Then Click Login Button
Then Handle PopUp
Then Verify User Redirected To Login Page

@invalidCredentials
Scenario: Verify User Redirected To Login Page If Invalid Password 
Given Launch Application <"URL">
Then Click Login Link
Then User Input Invalid CredentialP <"Username"> <"InvalidPassword">
Then Click Login Button
Then Handle PopUp
Then Verify User Redirected To Login Page

@loginLogout
Scenario: Verify User Can Logout
Given Launch Application <"URL">
Then Click Login Link
Then User Input Credentials <"Username"> <"Password">
Then Click Login Button
Then Click Logout Button
Then Verify User Can Logout