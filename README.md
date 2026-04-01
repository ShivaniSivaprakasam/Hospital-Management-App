# 🏥 Hospital Management System

## 📌 Overview

The **Hospital Management System** is a Spring Boot backend application designed to manage hospital operations including:

- User Authentication (Register & Login)
- Role-based access (Admin / User)
- Patient Management (CRUD Operations)
- JWT Authentication & Authorization
- MySQL Database Integration

This project is built using **Spring Boot**, **Spring Security**, **JWT**, and **MySQL**.

---

# 🚀 Tech Stack

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- JWT Authentication
- Maven
- Postman

---

# 📁 Project Structure
hospitalmanagement
│
├── config
│ ├── SecurityConfig
│ ├── JwtService
│ └── JwtAuthenticationFilter
│
├── controller
│ ├── AuthController
│ └── PatientController
│
├── dto
│ ├── AuthRequest
│ ├── AuthResponse
│ └── PatientDto
│
├── entity
│ ├── User
│ ├── Role
│ └── Patient
│
├── repository
│ ├── UserRepository
│ └── PatientRepository
│
├── service
│ ├── AuthService
│ └── PatientService
│
└── HospitalManagementApplication

---

# ✨ Features

## 🔐 Authentication

- Register User
- Login User
- JWT Token Generation
- Secure APIs using JWT

## 👨‍⚕️ Patient Management

- Add Patient
- Get All Patients
- Get Patient by ID
- Update Patient
- Delete Patient

---
## Author

**Shivani S**
