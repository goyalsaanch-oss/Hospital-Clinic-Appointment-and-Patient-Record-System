# System Architecture & Design Diagrams

## 1. Use Case Diagram

                     +---------------------------------------+
                     | Hospital & Clinic Management System   |
                     |                                       |
                     |   (Manage Patients)                   |
                     |   * Add / View / Search Patient       |
                     |   * Update / Delete Patient           |
                     |                                       |
    +-----------+    |   (Manage Doctors)                    |
    |           |--->|   * Add / View / Search Doctor        |
    | Reception |    |                                       |
    |   Staff   |    |   (Manage Appointments)               |
    |           |--->|   * Book Appointment                  |
    |           |    |   * View / Cancel Appointment         |
    +-----------+    |                                       |
                     |   (Manage Medical Records)            |
                     |   * Log Medical Record                |
                     |   * View Patient Medical History      |
                     +---------------------------------------+




 ## 2. Process Workflow Diagram

[Start Application] 
         |
         v
 [Display Main Menu] ---> (1. Patient | 2. Doctor | 3. Appointment | 4. Records | 5. Exit)
         |
         +---> User Selects Option
         |
         +---> Validate Choice & Execute Module Service
         |         |
         |         +---> Success: Update Data & Display Confirmation Message
         |         +---> Failure: Catch HospitalException / Input Error
         |
         v
 [Return to Main Menu Loop] ---> Repeat until Option 5 (Exit) is selected




 
 ## 3. Class Diagram (UML Representation)

 +-------------------+
                  |      Person       |
                  +-------------------+
                  | # name: String    |
                  | # age: int        |
                  | # phone: String   |
                  +-------------------+
                            ^
                            |
            +---------------+---------------+
            |                               |
  +-------------------+           +-------------------+
  |      Patient      |           |      Doctor       |
  +-------------------+           +-------------------+
  | - patientId: int  |           | - doctorId: int   |
  | - disease: String |           | - spec: String    |
  +-------------------+           +-------------------+

  +-------------------+           +-------------------+
  |    Appointment    |           |   MedicalRecord   |
  +-------------------+           +-------------------+
  | - appointmentId   |           | - recordId: int   |
  | - patient: Patient|           | - patient: Patient|
  | - doctor: Doctor  |           | - date, time: Str |
  | - date, time: Str |           | - treatment: Str  |
  +-------------------+           +-------------------+




  ## 4. Sequence Diagram (Booking an Appointment)

  User               Main UI           AppointmentService         Patient/Doctor Service
   |                    |                      |                             |
   |-- 1. Select Book ->|                      |                             |
   |-- 2. Input IDs ---->|                      |                             |
   |                    |-- 3. Validate IDs -------------------------------->|
   |                    |<-- 4. Return Patient/Doctor Objects ---------------+
   |                    |                      |                             |
   |                    |-- 5. Book Slot ----->|                             |
   |                    |                      |-- 6. Add to ArrayList       |
   |<-- 7. Confirmed ---|<-- 8. Success -------|                             |

