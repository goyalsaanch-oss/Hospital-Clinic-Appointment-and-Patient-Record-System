package model;

public class Patient extends Person {

    private int patientId;
    private String disease;

    // Constructor
    public Patient(int patientId, String name, int age, String phone, String disease) {
        super(name, age, phone);
        this.patientId = patientId;
        this.disease = disease;
    }

    // Getter for patient ID
    public int getPatientId() {
        return patientId;
    }

    // Getter for disease
    public String getDisease() {
        return disease;
    }

    // Setter for disease
    public void setDisease(String disease) {
        this.disease = disease;
    }

    // Display patient details
    public void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Disease/Problem: " + disease);
    }
}