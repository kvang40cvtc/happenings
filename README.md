# Happenings – Social Event Planner

## Project Description
Happenings is a full-stack web application that allows users to discover, create, and manage social events. Users can browse events by category, view event details, and interact with event data through a web-based interface. The system is designed to support user-generated events and personalized event organization in a scalable structure. The application is built using Java Servlets, JSP, and MySQL, and is deployed using a local Apache Tomcat server.

## Installation

To set up and run this project, ensure you have the following installed:

- Java 21
- IntelliJ IDEA
- Apache Tomcat 10.0.27
- MySQL Server
- Maven

### Steps:
1. Clone the repository from GitHub.
2. Open the project in IntelliJ IDEA as a Maven project.
3. Ensure the project is configured to use Java 21.
4. Configure Apache Tomcat 10.0.27 as the application server.
5. Set up a MySQL database (future implementation for event storage).
6. Reload Maven dependencies to download required libraries.

## Testing

To validate that the technology stack is working correctly:

1. Run the application using Apache Tomcat in IntelliJ IDEA.
2. Open a web browser and navigate to:

   http://localhost:8080/happenings/test

3. If configured correctly, the page will display:

   "Happenings backend is working!"

This confirms that the Java backend, Servlet configuration, and server deployment are functioning correctly.

## Usage

Once the server is running, access the application using:

http://localhost:8080/happenings/test

This endpoint verifies backend functionality. Future development will expand this into a full event management system with user authentication, event creation, and database integration.
