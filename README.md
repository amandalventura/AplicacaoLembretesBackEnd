# task-list-api
Este repositório contém o código-fonte para uma API de back-end desenvolvida em Java usando o framework Spring Boot. A API é responsável por fornecer serviços para gerenciar uma lista de tarefas, permitindo a criação, atualização, exclusão e recuperação de tarefas.

## Principais Recursos
- Operações CRUD (Criar, Ler, Atualizar, Excluir) para tarefas: A API oferece endpoints para criar novas tarefas, recuperar informações das tarefas existentes, atualizar tarefas existentes e excluir tarefas.
- Gerenciamento do status da tarefa: Cada tarefa pode ter um status associado, como "pendente", "em andamento" ou "concluída". A API permite atualizar o status de uma tarefa.
- Autenticação e Autorização: A API implementa um sistema de autenticação e autorização para garantir que apenas usuários autenticados possam criar, atualizar ou excluir tarefas. O acesso aos endpoints é controlado por meio de tokens de autenticação.
- Validação de Dados: A API realiza a validação dos dados de entrada, garantindo que os campos obrigatórios estejam presentes e que os dados estejam no formato apropriado.
## Tecnologias Utilizadas
Java: A linguagem de programação utilizada para desenvolver a API.
Spring Boot: O framework Java utilizado para facilitar o desenvolvimento de aplicações web.
Spring Data JPA: A biblioteca do Spring utilizada para interagir com o banco de dados, fornecendo uma camada de abstração para operações CRUD.
Banco de Dados Relacional (por exemplo, Banco de Dados H2 em Memória): Armazena as informações das tarefas e dos usuários do aplicativo.
API RESTful: A API segue os princípios e padrões REST para exposição de recursos e interações por meio de endpoints HTTP.
JSON: O formato de dados utilizado para comunicação entre a API e os clientes.
## Uso
1. Clone o repositório: git clone https://github.com/your-username/API-ToDoApplication.git
2. Configure a conexão do banco de dados no arquivo application.properties.
3. Construa e execute o aplicativo usando o Maven ou a sua IDE preferida.
4. Acesse os endpoints da API utilizando uma ferramenta como cURL ou um cliente REST.
## Contribuições
Contribuições são bem-vindas! Por favor, faça um fork do repositório e envie um pull request com as suas alterações propostas.

## Licença
Este projeto está licenciado sob a [MIT License](LICENSE).



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
