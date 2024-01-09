# Assignment Management System

## Description

The Assignment Management System is a Java application designed to streamline assignment management within educational settings. It offers features such as user authentication, assignment listing, submission management, and basic user profiles. The project utilizes Java, Swing for the user interface, and socket programming for file transfer.

## Features

1. **User Authentication:**
   - Secure login for authorized users.

2. **Assignment Listing:**
   - Displays available assignments for different courses.

3. **Assignment Submission:**
   - Allows students to submit completed assignments.

4. **Submission Management:**
   - Enables instructors to view submitted assignments and download them for evaluation.

5. **Basic User Profile:**
   - Displays basic user information.

## Technology Stack

- Java
- Swing for the user interface
- Socket programming for file transfer

## Project Structure

- **ServerCanvas.java:**
  - Server-side code handling file transfer and communication with clients.

- **DashboardController.java:**
  - Main controller class for the client-side, managing user interactions and navigation.

- **View Classes (DashboardView, CourseView, AccountView, etc.):**
  - Define the visual components and layout of different application pages.

## Installation and Setup

1. Install the Java Development Kit (JDK).
2. Download the project files.
3. Compile the Java code using a suitable IDE or command-line tools.
4. Run `ServerCanvas.java` to start the server.
5. Run `DashboardView.java` (or relevant entry point) to launch the client-side application.

## Usage

1. **Login:**
   - Enter your username and password to access the system.

2. **Dashboard:**
   - View available courses and assignments.

3. **Course View:**
   - Access assignments for a specific course.

4. **Assignment Submission:**
   - Select an assignment and submit your completed work.

5. **Profile View:**
   - View basic user information.

## Additional Notes

- The system currently stores user credentials and assignment files in plain text files. Consider implementing more secure data storage mechanisms for sensitive information.
  
- Potential enhancements include:
  - Instructor-specific views for managing assignments and grading.
  - Notification systems for assignment deadlines and submission status.
  - Comprehensive user profiles with customizable settings.
  - Integration with external learning management systems (LMS).
