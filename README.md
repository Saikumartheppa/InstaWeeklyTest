<h1 align = "center"> Instagram BackEnd </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>
The project is a portal designed to handle different types of relationships, including  one-to-many, many-to-one,  relationships. It provides CRUD operations for four models: User and Post. These models represent entities such as User and Posts, and each model has its own set of attributes and relationships.

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Swagger

<br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

## Data Model

The  data model  has the following attributes:
<br>

* User
```
ID: The unique identifier for the user.
name: The name of the user.
age: The age of the user.
phoneNumber: The phone number of the user.
email : The email of user;
password : The account password

Relationships:
address: A one-to-many relationship with the Post model.
```

* Post
```
ID: The unique identifier for the post.
creationTime : The time of post creation;
updatedTime : The time of updated post;
postData : The data of post (eg : img ,reel ,video)
Relationships:

Post: A many-to-one relationship with the User model.

```



## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>

<br>

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

## Project Summary

The portal allows for the creation, reading, updating, and deletion of records for each model. Users can create new posts, with their respective attributes. They can also retrieve specific details of a record, update the attributes of existing records, and delete records from the system.
Overall, the portal provides a comprehensive solution for managing different types of relationships and performing CRUD operations on the models involved.

## Author

👤 **Saikumar theppa**

* GitHub: [Saikumar theppa](https://gist.github.com/Saikumartheppa)

---

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").
    
---

## Show your support

Give a ⭐️ if this project helped you!
    
---