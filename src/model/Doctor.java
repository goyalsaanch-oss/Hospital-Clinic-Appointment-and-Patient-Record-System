package model;

public class Doctor extends Person {

    private int doctorId;
    private String specialization;

    
    public Doctor(int doctorId, String name, int age, String phone, String specialization) {
        super(name, age, phone);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    
    public int getDoctorId() {
        return doctorId;
    }

    
    public String getSpecialization() {
        return specialization;
    }

    
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    
    public void displayDoctor() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Name: Dr. " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Specialization: " + specialization);
    }
}
