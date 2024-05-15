
# MONEY TRANSFER API

This project implements a RESTful API for conducting money transfers between accounts. The API is designed for internal system usage, hence it does not include authentication. It is developed using Java with Spring Boot and Maven, and encapsulated within Docker for easy deployment and execution.

DETAILS ABOUT THE CODE

Regarding the code, I chose Java Spring Boot for the robustness of the language and the framework, as well as for the extensive community and support available. To start the project, the first thing I did was define what the goal was and what steps I needed to develop to achieve it. Once I had that clear, I started with the first step: defining a database schema. The one I created was very simple since I think it did not make sense for this test to create something bigger. For this purpose, I created two tables (account and transfer). Once the tables were created, I started the project by going to Spring Initializr where I defined the features of my project (Maven, Java 17, dependencies, etc.). After doing this, I could start to develop the code and all the functionalities, getting familiar with the environment since it was my first or second time using Spring Boot. Once the foundations were laid and after conducting several tests, I developed some simple functionalities such as:
- Displaying accounts
- Creating an account
- Checking if an account exists

After this, I developed the functionality for transferring between accounts. For this, I created a transfer request and a transfer response, and by using Postman calls, I tested that it was performed correctly and was inserted into the table. I would have liked to add some more validations, but due to time constraints, I couldn't.

Additionally, other functionalities I would have liked to include were:
- Sending an email every time a transfer is made (including more tables, user)
- Calling an API to change the currency type in case money is sent in euros to a UK account.



TECHNOLOGIES USED

Java: Programming language.
Spring Boot: Framework to simplify the setup and development of new Spring applications.
Maven: Software project management and comprehension tool.
Docker: Platform for developing, shipping, and running applications in containers.
MySQL: Database management systems.

CONFIGURATION AND PREREQUISITES

Prerequisites

Java JDK 11 or higher
Maven
Docker
PostgreSQL or MySQL
Ubuntu

Installation and Setup Instructions

1. Clone the repository: git clone [url]
2. Clean the project with maven
3. Install the project with maven
4. Docker build: docker build -t albano/transfer_spring_proyect:v1 .
5. Docker compose: docker-compose -f docker_compose.yaml up -d
6. Connection with MySQL
7. Create the tables: CREATE TABLE account (
  `ID` varchar(100) DEFAULT NULL COMMENT 'IDENTIFICADOR DE LA CUENTA',
  `NAME` varchar(50) DEFAULT NULL COMMENT 'NOMBRE DE LA PERSONA',
  `MONEY` int DEFAULT NULL COMMENT 'SALDO EN LA CUENTA'
);


CREATE TABLE transfer (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'IDENTIFICADOR DE LA TRANSACCION',
  `NAMEORIGIN` varchar(50) DEFAULT NULL COMMENT 'NOMBRE DE LA PERSONA DE LA CUENTA DE ORIGEN',
  `NAMEDESTINATION` varchar(50) DEFAULT NULL COMMENT 'NOMBRE DE LA PERSONA DE LA CUENTA DE DESTINO',
  `ACCOUNTORIGIN` varchar(100) DEFAULT NULL COMMENT 'IDENTIFICADOR DE LA CUENTA ORIGEN',
  `ACCOUNTDESTINATION` varchar(100) DEFAULT NULL COMMENT 'IDENTIFICADOR DE LA CUENTA DESTINO',
  `AMOUNT` int DEFAULT NULL COMMENT 'CANTIDAD QUE VAMOS A TRASNFERIR',
  `DATE` timestamp NULL DEFAULT NULL COMMENT 'FECHA DE LA TRANSACCION',
  PRIMARY KEY (`ID`)
);

INSERT INTO account VALUES("ES1212341234121234567890", "JAVIER", 10000), ("ES1212341234121234567891", "PEDRO", 5000);

8. Launch the script shell: 
./transfer_test.sh showAccounts -- to show the accounts
./transfer_test.sh createAccount ES223312131434322234 ALBANO 5443 -- to create a new account 
./transfer_test.sh transfer JAVIER ALBANO ES1212341234121234567890 ES223312131434322234 444  -- to create a new transfer


Albano Gonzalez
