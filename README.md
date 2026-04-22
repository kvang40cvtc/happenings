# Happenings – Event Finder

## Project Description

Happenings is a full-stack web application designed to help users discover, create, and manage social events. The platform allows users to browse events, view event details, and interact with event data through a web-based interface. This project currently focuses on validating the backend technology stack using Java Servlets deployed on Apache Tomcat. Future development will include database integration, user authentication, and full event management features.

---

## Installation

To set up and run this project, install the following:

* Java JDK 17 or higher
* Apache Maven
* Apache Tomcat (version 10 or compatible)

> Note: A MySQL database is planned for future development but is **not required** to run the current version of this project.

### Steps

1. Clone the repository:

   ```
   git clone https://github.com/kvang40cvtc/happenings.git
   cd happenings
   ```

2. Build the project using Maven:

   ```
   mvn clean package
   ```

3. After building, locate the generated WAR file:

   ```
   target/happenings.war
   ```

4. Deploy the WAR file to Tomcat webapps directory:
   Example (Windows):

   ```
   C:\Program Files\Apache Software Foundation\Tomcat 10\webapps
   ```

   OR use Intellij Tomcat run configuration.

5. Start the Tomcat server.

---

## Testing

To validate the backend is working:

1. Ensure Tomcat is running and the WAR file has been deployed.
2. Open a web browser.
3. Navigate to the following URL:

   ```
   http://localhost:8080/happenings/test
   ```
4. Expected output:

   ```
   Happenings backend is working!
   ```

If this message appears, it confirms that:

* Java Servlets are functioning correctly
* The application builds successfully with Maven
* The project deploys and runs on Tomcat

---

## Usage

Once the server is running, access the application at:

```
http://localhost:8080/happenings/test
```

This endpoint verifies backend functionality. Future versions of the application will expand this into a complete event management system with features such as event creation, user accounts, and database integration.

---

## Release Notes

Version v0.0.0 includes:

* Initial Maven project setup
* Basic servlet implementation (`/test` endpoint)
* Successful deployment to Apache Tomcat
* Validation of the core backend technology stack

---

## Notes

* No database setup is required for this version.
* This release is intended to validate that all core technologies integrate and run successfully.
* The project can be built and run entirely from the command line without requiring an IDE.
