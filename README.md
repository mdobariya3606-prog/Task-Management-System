# Task Management System API

Backend REST API for managing tasks with structured architecture and status-based filtering.

## Features

- Create task
- Update task
- Delete task
- Get all tasks
- Filter tasks by status
- User-based task management
- Input validation
- Exception handling

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- REST APIs
- Maven

## Task Status

- PENDING
- IN_PROGRESS
- COMPLETED

## API Endpoints

POST /tasks  
GET /tasks  
GET /tasks/status/{status}  
PUT /tasks/{id}  
DELETE /tasks/{id}  

## Architecture

Controller → handles HTTP requests  
Service → business logic  
Repository → database operations  
Entity → database model  

## Future Improvements

- authentication integration
- pagination
- sorting
