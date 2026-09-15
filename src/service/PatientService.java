package service;

import java.util.ArrayList;
import model.Patient;

public class PatientService {

    private ArrayList<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully!");
    }

    public void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }

        for (Patient patient : patients) {
            patient.displayPatient();
            System.out.println("----------------------------");
        }
    }

    public Patient searchPatient(int patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId() == patientId) {
                return patient;
            }
        }
        return null;
    }

    public boolean updatePatient(int patientId, String disease) {
        Patient patient = searchPatient(patientId);

        if (patient != null) {
            patient.setDisease(disease);
            return true;
        }

        return false;
    }

    public boolean deletePatient(int patientId) {
        Patient patient = searchPatient(patientId);

        if (patient != null) {
            patients.remove(patient);
            return true;
        }

        return false;
    }
}
