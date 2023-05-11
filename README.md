# task-list-api

This repository contains the source code for a backend API developed in Java using the Spring Boot framework. The API is responsible for providing services to manage a task list, allowing the creation, updating, deletion, and retrieval of tasks.

## Key Features

- CRUD (Create, Read, Update, Delete) operations for tasks: The API offers endpoints to create new tasks, retrieve information of existing tasks, update existing tasks, and delete tasks.
- Task status management: Each task can have an associated status such as "pending", "in progress", or "completed". The API allows updating the status of a task.
- Authentication and Authorization: The API implements an authentication and authorization system to ensure that only authenticated users can create, update, or delete tasks. Access to the endpoints is controlled through authentication tokens.
- Data Validation: The API performs validation of input data, ensuring that mandatory fields are present and that the data is in the appropriate format.

## Technologies Used

- Java: The programming language used to develop the API.
- Spring Boot: The Java framework used to facilitate web application development.
- Spring Data JPA: The Spring library used to interact with the database, providing an abstraction layer for CRUD operations.
- Relational Database (e.g. H2 Database in Memory): Stores the information of tasks and application users.
- RESTful API: The API follows REST principles and standards for resource exposure and interactions through HTTP endpoints.
- JSON: The data format used for communication between the API and clients.

## Usage

1. Clone the repository: `git clone https://github.com/your-username/API-ToDoApplication.git`
2. Configure the database connection in the `application.properties` file.
3. Build and run the application using Maven or your preferred IDE.
4. Access the API endpoints using a tool like cURL or a REST client.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your proposed changes.

## License

This project is licensed under the [MIT License](LICENSE).
