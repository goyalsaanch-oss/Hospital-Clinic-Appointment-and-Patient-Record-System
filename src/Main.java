import java.util.Scanner;
import model.Patient;
import model.Doctor;
import model.Appointment;
import model.MedicalRecord;
import service.PatientService;
import service.DoctorService;
import service.AppointmentService;
import service.MedicalRecordService;
import exception.HospitalException;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PatientService patientService = new PatientService();
        DoctorService doctorService = new DoctorService();
        AppointmentService appointmentService = new AppointmentService();
        MedicalRecordService recordService = new MedicalRecordService();

        int mainChoice = 0;

        while (mainChoice != 5) {
            System.out.println("\n===========================================");
            System.out.println("  HOSPITAL & CLINIC MANAGEMENT SYSTEM");
            System.out.println("===========================================");
            System.out.println("1. Patient Management");
            System.out.println("2. Doctor Management");
            System.out.println("3. Appointment Management");
            System.out.println("4. Medical Record Management");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                mainChoice = Integer.parseInt(scanner.nextLine());

                switch (mainChoice) {
                    case 1:
                        handlePatientMenu(scanner, patientService);
                        break;
                    case 2:
                        handleDoctorMenu(scanner, doctorService);
                        break;
                    case 3:
                        handleAppointmentMenu(scanner, appointmentService, patientService, doctorService);
                        break;
                    case 4:
                        handleMedicalRecordMenu(scanner, recordService, patientService);
                        break;
                    case 5:
                        System.out.println("Thank you for using the system. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice! Please choose between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid numeric choice.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }

    // --- PATIENT MENU ---
    private static void handlePatientMenu(Scanner scanner, PatientService patientService) {
        System.out.println("\n--- Patient Management ---");
        System.out.println("1. Add Patient");
        System.out.println("2. View All Patients");
        System.out.println("3. Search Patient");
        System.out.println("4. Update Patient Disease");
        System.out.println("5. Delete Patient");
        System.out.print("Choose option: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Enter Patient ID: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Phone: ");
                String phone = scanner.nextLine();
                System.out.print("Enter Disease/Problem: ");
                String disease = scanner.nextLine();

                Patient patient = new Patient(id, name, age, phone, disease);
                patientService.addPatient(patient);
                break;

            case 2:
                patientService.viewPatients();
                break;

            case 3:
                System.out.print("Enter Patient ID to search: ");
                int searchId = Integer.parseInt(scanner.nextLine());
                Patient found = patientService.searchPatient(searchId);
                if (found != null) {
                    found.displayPatient();
                } else {
                    System.out.println("Patient not found!");
                }
                break;

            case 4:
                System.out.print("Enter Patient ID to update: ");
                int updateId = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter New Disease/Problem: ");
                String newDisease = scanner.nextLine();
                if (patientService.updatePatient(updateId, newDisease)) {
                    System.out.println("Patient updated successfully!");
                } else {
                    System.out.println("Patient not found!");
                }
                break;

            case 5:
                System.out.print("Enter Patient ID to delete: ");
                int deleteId = Integer.parseInt(scanner.nextLine());
                if (patientService.deletePatient(deleteId)) {
                    System.out.println("Patient deleted successfully!");
                } else {
                    System.out.println("Patient not found!");
                }
                break;

            default:
                System.out.println("Invalid option!");
        }
    }

    // --- DOCTOR MENU ---
    private static void handleDoctorMenu(Scanner scanner, DoctorService doctorService) {
        System.out.println("\n--- Doctor Management ---");
        System.out.println("1. Add Doctor");
        System.out.println("2. View All Doctors");
        System.out.println("3. Search Doctor");
        System.out.print("Choose option: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Enter Doctor ID: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Phone: ");
                String phone = scanner.nextLine();
                System.out.print("Enter Specialization: ");
                String spec = scanner.nextLine();

                Doctor doctor = new Doctor(id, name, age, phone, spec);
                doctorService.addDoctor(doctor);
                break;

            case 2:
                doctorService.viewDoctors();
                break;

            case 3:
                System.out.print("Enter Doctor ID to search: ");
                int searchId = Integer.parseInt(scanner.nextLine());
                Doctor found = doctorService.searchDoctor(searchId);
                if (found != null) {
                    found.displayDoctor();
                } else {
                    System.out.println("Doctor not found!");
                }
                break;

            default:
                System.out.println("Invalid option!");
        }
    }

    // --- APPOINTMENT MENU ---
    private static void handleAppointmentMenu(Scanner scanner, AppointmentService appService,
                                               PatientService patientService, DoctorService doctorService) {
        System.out.println("\n--- Appointment Management ---");
        System.out.println("1. Book Appointment");
        System.out.println("2. View All Appointments");
        System.out.println("3. Cancel Appointment");
        System.out.print("Choose option: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Enter Appointment ID: ");
                int appId = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Patient ID: ");
                int pId = Integer.parseInt(scanner.nextLine());
                Patient p = patientService.searchPatient(pId);
                if (p == null) {
                    System.out.println("Error: Patient ID does not exist!");
                    return;
                }

                System.out.print("Enter Doctor ID: ");
                int dId = Integer.parseInt(scanner.nextLine());
                Doctor d = doctorService.searchDoctor(dId);
                if (d == null) {
                    System.out.println("Error: Doctor ID does not exist!");
                    return;
                }

                System.out.print("Enter Date (e.g., YYYY-MM-DD): ");
                String date = scanner.nextLine();
                System.out.print("Enter Time (e.g., 10:00 AM): ");
                String time = scanner.nextLine();

                Appointment appointment = new Appointment(appId, p, d, date, time);
                appService.bookAppointment(appointment);
                break;

            case 2:
                appService.viewAppointments();
                break;

            case 3:
                System.out.print("Enter Appointment ID to cancel: ");
                int cancelId = Integer.parseInt(scanner.nextLine());
                if (appService.cancelAppointment(cancelId)) {
                    System.out.println("Appointment cancelled successfully!");
                } else {
                    System.out.println("Appointment ID not found!");
                }
                break;

            default:
                System.out.println("Invalid option!");
        }
    }

    // --- MEDICAL RECORD MENU ---
    private static void handleMedicalRecordMenu(Scanner scanner, MedicalRecordService recordService,
                                                PatientService patientService) {
        System.out.println("\n--- Medical Record Management ---");
        System.out.println("1. Add Medical Record");
        System.out.println("2. View Patient Medical History");
        System.out.print("Choose option: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Enter Record ID: ");
                int recId = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Patient ID: ");
                int pId = Integer.parseInt(scanner.nextLine());
                Patient p = patientService.searchPatient(pId);
                if (p == null) {
                    System.out.println("Error: Patient ID does not exist!");
                    return;
                }

                System.out.print("Enter Diagnosis: ");
                String diagnosis = scanner.nextLine();
                System.out.print("Enter Treatment: ");
                String treatment = scanner.nextLine();
                System.out.print("Enter Date: ");
                String date = scanner.nextLine();

                MedicalRecord record = new MedicalRecord(recId, p, diagnosis, treatment, date);
                recordService.addRecord(record);
                break;

            case 2:
                System.out.print("Enter Patient ID to view history: ");
                int historyId = Integer.parseInt(scanner.nextLine());
                recordService.viewPatientHistory(historyId);
                break;

            default:
                System.out.println("Invalid option!");
        }
    }
}