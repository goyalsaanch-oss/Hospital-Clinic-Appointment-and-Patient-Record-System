package model;

public class Patient extends Person {

    private int patientId;
    private String disease;

    
    public Patient(int patientId, String name, int age, String phone, String disease) {
        super(name, age, phone);
        this.patientId = patientId;
        this.disease = disease;
    }

    
    public int getPatientId() {
        return patientId;
    }

    
    public String getDisease() {
        return disease;
    }

    
    public void setDisease(String disease) {
        this.disease = disease;
    }

    
    public void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Disease/Problem: " + disease);
    }
}
