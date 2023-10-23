# TP_Spring 
- Description:

This project is a Spring Boot application that manages student information. It includes functionalities to perform basic CRUD operations on student records. The application utilizes a MySQL database to persist the data. Additionally, it exposes RESTful web services for querying and managing student data.

- Components:

  - Student Entity:
    Represents the structure of a student entity with attributes such as ID, first name, last name, and date of birth.

  - Student Controller:
    Manages HTTP requests related to students.
    Supports operations like saving a new student, deleting a student by ID, retrieving all students, counting the total number of students, and obtaining student counts by birth year.

  - Student Repository:
    Extends JpaRepository for database interaction.
    Includes a custom query to retrieve the count of students by birth year.

  - Demo Application:
    The main class that initializes the Spring Boot application.
    Contains a simple "Hello World!" endpoint for testing the application.

- Usage:

To save a new student, send a POST request to /students/save with the student details in the request body.
![Capture d’écran (1024)](https://github.com/ZinebTAGHIA/TP_Spring/assets/102872040/4b32b9c4-e888-4dd2-830b-b9779c413149)
![Capture d’écran (1025)](https://github.com/ZinebTAGHIA/TP_Spring/assets/102872040/3d71f957-f3e3-4816-9d48-008ad5265a3c)

To delete a student, send a DELETE request to /students/delete/{id} with the student ID as a path variable.
![Capture d’écran (1029)](https://github.com/ZinebTAGHIA/TP_Spring/assets/102872040/18f6bc64-83f2-44dd-a6d7-9e7795df0402)
![Capture d’écran (1030)](https://github.com/ZinebTAGHIA/TP_Spring/assets/102872040/370cb07a-eed1-4024-8830-5de4e6baa886)

To retrieve all students, send a GET request to /students/all.
![Capture d’écran (1026)](https://github.com/ZinebTAGHIA/TP_Spring/assets/102872040/ac6a0a6e-6941-421a-9158-4cc29f0ea1d4)

To count the total number of students, send a GET request to /students/count.
![Capture d’écran (1027)](https://github.com/ZinebTAGHIA/TP_Spring/assets/102872040/3de2a6a6-bc1d-41a1-9d34-bf8736c01262)

To get the count of students by birth year, send a GET request to /students/byYear.
![Capture d’écran (1028)](https://github.com/ZinebTAGHIA/TP_Spring/assets/102872040/d50b471b-855a-429e-a64f-a7b3f5fbb055)

- Running the Application:

Ensure you have a MySQL database set up.
Configure the database properties in application.properties.
Run the application using SpringApplication.run(DemoApplication.class, args);.
Access the application at http://localhost:8080.
