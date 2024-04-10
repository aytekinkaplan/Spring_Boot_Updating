**Project Name:** Spring Boot Grade Submission (placeholder)

**Description:**

This Spring Boot application provides a web interface for managing student grades. Users can create new grades, update existing grades, and view a list of all submitted grades.

**Key Features:**

- **Grade Creation:** Users can submit new grades by entering the student's name, subject, and score.
- **Grade Update:** Existing grades can be edited by clicking the "Update" button next to a grade in the list. This takes the user to a form pre-populated with the current grade information.
- **Grade List:** A table displays all submitted grades, including student name, subject, score, and an "Update" button for each grade.

**Getting Started:**

1. **Prerequisites:**
   - Java 17 or later
   - Maven

2. **Clone the Repository:**

   ```bash
   git clone https://github.com/aytekinkaplan/Spring_Boot_Updating.git
   ```

3. **Install Dependencies:**

   ```bash
   cd Spring_Boot_Updating
   mvn clean install
   ```

4. **Run the Application:**

   ```bash
   mvn spring-boot:run
   ```

   This will start the application on port 8080 by default. You can access the application in your web browser at http://localhost:8080/.

**Project Structure:**

The project is organized into the following core packages:

- `com.updatingworks.springbootupdating`: Contains the main application logic, including classes for grades (`Grade`) and a controller for handling form submissions (`GradeController`).
- `resources`: Holds static resources like CSS stylesheets (`form-stylesheet.css` and `grades-stylesheet.css`).
- `templates`: Contains Thymeleaf templates for the form (`form.html`) and grades list (`grades.html`).

**Usage:**

1. **Access the Form:**
   - Visit http://localhost:8080/ in your web browser.
   - This will display the form for creating a new grade.

2. **Create a New Grade:**
   - Enter the student's name, subject, and score in the respective fields.
   - Click the "Submit" button.

3. **Update an Existing Grade:**
   - In the grades list, click the "Update" button next to the grade you want to modify.
   - This will open the form pre-populated with the current grade information.
   - Make the necessary changes and click "Submit" again.

4. **View Grades List:**
   - The grades list will display all submitted grades, including student name, subject, score, and an "Update" button for each grade.

**Customization:**

- You can customize the application by modifying the Thymeleaf templates (`form.html` and `grades.html`) and CSS stylesheets (`form-stylesheet.css` and `grades-stylesheet.css`).
- The application can be further extended to support additional features, such as user authentication, grade deletion, or data persistence using a database.

**Contribution:**

We welcome contributions to this project! Feel free to fork the repository, make changes, and submit a pull request.

**License:**

This project is licensed under the Apache License 2.0 (see LICENSE file for details).

**Additional Notes:**

- Consider adding a `.gitignore` file to exclude unnecessary files from version control.
- Include unit tests to ensure the application's functionality.
- Explore implementing a more robust error handling mechanism.
- For production deployment, you might explore packaging the application as a JAR or WAR file and using a container like Tomcat or Spring Boot Actuator for monitoring and management.
