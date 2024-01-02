# Project: Social media blog API 

  

## Background  

The SocialMediaBlog API is a powerful tool designed to simplify the development of social media blog applications. It provides a robust backend infrastructure for managing user accounts, messages, and more, allowing developers to focus on creating engaging social media experiences. 

The SocialMediaBlog API is built upon a robust and scalable 3-layer design pattern, incorporating Data Access Objects (DAO) and Service classes to ensure modularity, maintainability, and separation of concerns. 

   

# Features Implemented 

  

## 1: User Registration 

  

Users can create a new account by making a POST request to the endpoint POST localhost:8080/register. 

  

## 2: User Login 

  

Users can verify their login credentials by making a POST request to the endpoint POST localhost:8080/login. 

  

## 3: Message Creation 

  

Users can submit a new post by making a POST request to the endpoint POST localhost:8080/messages. 

  

## 4: Retrieve All Messages 

  

Users can retrieve all messages by making a GET request to the endpoint GET localhost:8080/messages. 

  

## 5: Retrieve Message By ID 

  

Users can retrieve a specific message by its ID with a GET request to the endpoint GET localhost:8080/messages/{message_id}. 

  

## 6: Delete Message By ID 

  

Users can delete a message by its ID with a DELETE request to the endpoint DELETE localhost:8080/messages/{message_id}. 

  

## 7: Update Message Text 

  

Users can update the text of a message by its ID with a PATCH request to the endpoint PATCH localhost:8080/messages/{message_id}. 

  

## 8: Retrieve Messages By User 

  

Users can retrieve all messages written by a particular user by making a GET request to the endpoint GET localhost:8080/accounts/{account_id}/messages. 

  

# Technologies Used 

 

## Java: Backend programming language 

## Javalin: Lightweight Java web framework for building RESTful APIs 

## JDBC (Java Database Connectivity): API for Java to connect and interact with databases 

## Maven: Build automation and project management tool for Java projects 

 

# How to Set Up/Get Started Using It 

 

## Clone the Repository: 

git clone https://github.com/Brianlxm/SocialMediaBlogAPI.git 
cd social-media-blog-api 
 

## Build the Project using Maven: 

mvn clean install 
 

## Configure Database: Set up your database and update the database connection details in the .env file. 

Configure Environment Variables: Create a .env file in the root directory and add necessary configuration values such as database connection details, JWT secret key, etc. 

## Run the Application: 

java -jar target/social-media-blog-api.jar 
 

The API will be available at http://localhost:8080. 

## Access the API: You can use tools like curl or Postman to interact with the API endpoints. 

### Example: Register a new user 

curl -X POST -H "Content-Type: application/json" -d '{"username": "john_doe", "password": "securepassword"}' http://localhost:8080/register 
 

### Example: Log in 

curl -X POST -H "Content-Type: application/json" -d '{"username": "john_doe", "password": "securepassword"}' http://localhost:8080/login 
 

### Example: Create a new message 

curl -X POST -H "Content-Type: application/json" -H "Authorization: Bearer YOUR_JWT_TOKEN" -d '{"text": "Hello, World!"}' http://localhost:8080/messages 
 

Remember to replace YOUR_JWT_TOKEN with the actual JWT token obtained during the login process. 

 

 

# Contributors 

 

Brian Lam (brianjohnlam@gmail.com) 

 

# License Information 

 

This project is licensed under the MIT License. 

Feel free to customize the information and structure based on your project's specific details. 

 
