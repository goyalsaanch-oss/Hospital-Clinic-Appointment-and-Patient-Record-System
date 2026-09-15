# ACADEMIC PROJECT REPORT
## Hospital & Clinic Appointment & Patient Record Management System

---

### 1. Introduction
The Hospital & Clinic Management System is a modular console-based Java application. It simplifies daily administrative tasks for medical practices by managing patients, doctors, appointments, and medical histories efficiently.

---

### 2. Problem Statement
Manual management in clinics often leads to duplicated records, lost patient histories, and double-booked consultation times. This digital system provides a structured, lightweight alternative.

---

### 3. Functional Requirements
* **Patient Management:** Operations to add, search, view, update, and delete patient records.
* **Doctor & Appointment Management:** Doctor registry, appointment booking, slot cancellation, and listing active bookings.
* **Medical Record Management:** Logging diagnoses, prescribed treatments, and retrieving history per patient.

---

### 4. Non-Functional Requirements
* **Usability:** Simple text-driven user prompts.
* **Reliability:** Error containment to prevent application crashes during invalid inputs.
* **Maintainability:** Clear separation into `model`, `service`, and `exception` packages.
* **Performance:** Fast response time using in-memory Java Collections (`ArrayList`).

---

### 5. Design Decisions & Rationale
* **OOP Core:** Applied Inheritance (`Person` extended by `Patient` and `Doctor`) to reduce redundant code.
* **In-Memory Storage:** `ArrayList` used for flexible dynamic data management without external database overhead.
* **Custom Exception:** Custom `HospitalException` implemented for meaningful error messaging.

---

### 6. Implementation Details
* Built using JDK 8+, VS Code, and Git.
* Modular architecture separating data models (`src/model`), logic services (`src/service`), custom errors (`src/exception`), and entry interface (`src/Main.java`).

---

### 7. Testing Approach
* **Input Validation Test:** Ensured system handles non-numeric inputs gracefully.
* **ID Mapping Test:** Verified appointments cannot be created for invalid Patient or Doctor IDs.

---

### 8. Challenges & Learnings
* Learned how to manage multi-package Java structures without IDE auto-import issues.
* Mastered relational mapping between objects in memory without database foreign keys.

---

### 9. Future Enhancements
* Persistent storage via MySQL/JDBC integration.
* JavaFX graphical dashboard interface.