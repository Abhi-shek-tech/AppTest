# AppTest

*# Testing Together For Her App Login Feature

This automation framework enables to automate the login feature of the Together For Her (TFH) app using Appium and a Google Pixel 6 emulator running Android 13. The framework is built using Maven for project management, TestNG for test management, and Surefire for generating HTML reports.

## Setup Instructions
To clone and execute the tests, please follow these steps:

### Prerequisites
1.Java Development Kit (JDK) installed (20.0.1)
2.Maven build tool installed (Apache Maven 3.8.8)
3.Android Studio and Android SDK installed
4.Appium server installed
5.Google Pixel 6 emulator created in Android Studio(Andriod 13)

### Clone the Repository

1.Open a terminal or command prompt.
2.Run the following command to clone the repository:- git clone <repository_url>

### Configuration

1.Open the project in your preferred Integrated Development Environment (IDE).
2.Start the Appium server with "Allow CORS" flag 
3.Start the Emulator using Android Studio and the Google Pixel 6 emulator with Android 13.

### Execute the Tests
1.Open a terminal or command prompt.
2.Navigate to the project directory.
3.Run the following command to execute the tests:- mvn test
4.This command will trigger the execution of the automated login tests in the Together For Her app.

### Test Results
1.After executing the tests, the results will be displayed in the terminal or command prompt. Additionally, the detailed test reports are available in the target/surefire-reports directory.
