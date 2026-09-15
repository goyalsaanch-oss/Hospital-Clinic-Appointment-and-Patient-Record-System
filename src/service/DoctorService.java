package service;

import java.util.ArrayList;
import model.Doctor;

public class DoctorService {

    private ArrayList<Doctor> doctors = new ArrayList<>();

    // Doctor add karne ke liye
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added successfully!");
    }

    // Saare doctors dekhne ke liye
    public void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
            return;
        }

        for (Doctor doctor : doctors) {
            doctor.displayDoctor();
            System.out.println("----------------------------");
        }
    }

    // Doctor ID se dhoondne ke liye
    public Doctor searchDoctor(int doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId() == doctorId) {
                return doctor;
            }
        }
        return null;
    }
}