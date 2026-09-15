package model;

public class Appointment {

    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;

    // Constructor
    public Appointment(int appointmentId, Patient patient, Doctor doctor,
                       String date, String time) {

        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    // Getters
    public int getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    // Display appointment details
    public void displayAppointment() {

        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: Dr. " + doctor.getName());
        System.out.println("Specialization: " + doctor.getSpecialization());
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("----------------------------");
    }
}