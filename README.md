# Hospital & Clinic Appointment & Patient Record Management System

A comprehensive, modular, console-based Java application designed to streamline clinic and hospital administration. This project manages patient profiles, doctor availability, appointment scheduling, and clinical medical records using Object-Oriented Programming (OOP) principles.

---

##  Project Overview

This application serves as an interactive console dashboard for clinic staff and administrators. It enables efficient tracking of patient registration, medical personnel assignment, consultation booking, and diagnosis tracking with robust error handling and structured data architecture.

---

##  Functional Modules & Features

### 1. Patient Management
* **Add Patient:** Register new patient records with contact details and primary symptoms.
* **View All Patients:** Display comprehensive lists of active patients.
* **Search Patient:** Quickly locate specific patients by their unique Patient ID.
* **Update Patient:** Edit diagnosis/problem details for existing patients.
* **Delete Patient:** Remove patient records upon discharge.

### 2. Doctor & Appointment Management
* **Add Doctor:** Register medical specialists and their contact details.
* **View All Doctors:** List all available doctors and their clinical specializations.
* **Search Doctor:** Retrieve specific doctor details using Doctor ID.
* **Book Appointment:** Reserve a consultation slot connecting an existing Patient with an assigned Doctor.
* **View Appointments:** List all active and upcoming appointments.
* **Cancel Appointment:** Remove scheduled consultation slots using Appointment ID.

### 3. Medical Record Management
* **Add Medical Record:** Log diagnosis, prescribed treatments, and visit dates.
* **View Patient History:** Retrieve complete historical medical logs for a specific Patient ID.

---

##  Technical Architecture & Key Design Features

* **Modular Architecture:** Clean separation of concerns into models, services, and custom exceptions.
* **Inheritance & Polymorphism:** Base `Person` class extended by `Patient` and `Doctor` classes.
* **Encapsulation:** Private attributes with public getters and setters ensuring data integrity.
* **Custom Exception Handling:** Centralized exception handling using `HospitalException` alongside standard input validation.
* **Data Collections:** Dynamic data management using Java `ArrayList` structures.

---

##  Project Directory Structure

```text
HospitalManagementSystem/
├── data/
├── src/
│   ├── exception/
│   │   └── HospitalException.java
│   ├── model/
│   │   ├── Person.java
│   │   ├── Patient.java
│   │   ├── Doctor.java
│   │   ├── Appointment.java
│   │   └── MedicalRecord.java
│   ├── service/
│   │   ├── PatientService.java
│   │   ├── DoctorService.java
│   │   ├── AppointmentService.java
│   │   └── MedicalRecordService.java
│   └── Main.java
└── README.md