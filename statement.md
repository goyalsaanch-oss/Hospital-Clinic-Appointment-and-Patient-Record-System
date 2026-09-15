# Problem Statement & System Requirements

## 1. Problem Statement
Manual management of patient records, doctor availability, and appointment scheduling in small-to-medium clinics often leads to data duplication, lost medical history, and inefficient scheduling. A centralized, lightweight digital system is required to streamline core administrative operations.

---

## 2. Project Scope
The **Hospital & Clinic Appointment & Patient Record Management System** aims to automate daily clinic operations through a console interface. 

### In-Scope:
* Patient CRUD operations (Create, Read, Update, Delete).
* Doctor directory management.
* Appointment booking and cancellation logic with ID validation.
* Patient medical history tracking (diagnoses & treatments).
* Exception handling for invalid inputs and missing records.

### Out-of-Scope (Future Enhancements):
* Graphical User Interface (GUI).
* Persistent Database (SQL/NoSQL) storage.
* Online payment gateway integration.

---

## 3. System Objectives
1. **Modularity:** Separate business logic (`service`), data models (`model`), and exception handling (`exception`).
2. **Usability:** Provide a clean, interactive console menu for administrative staff.
3. **Data Integrity:** Prevent booking appointments for non-existent patients or doctors.