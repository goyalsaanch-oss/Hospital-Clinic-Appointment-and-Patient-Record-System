package service;

import java.util.ArrayList;
import model.MedicalRecord;

public class MedicalRecordService {

    private ArrayList<MedicalRecord> records = new ArrayList<>();

    // Medical Record add karne ke liye
    public void addRecord(MedicalRecord record) {
        records.add(record);
        System.out.println("Medical record added successfully!");
    }

    // Specific Patient ki poori medical history dekhne ke liye
    public void viewPatientHistory(int patientId) {
        boolean found = false;
        for (MedicalRecord record : records) {
            if (record.getPatient().getPatientId() == patientId) {
                record.displayRecord();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No medical history found for Patient ID: " + patientId);
        }
    }

    // Record ID se search karne ke liye
    public MedicalRecord searchRecord(int recordId) {
        for (MedicalRecord record : records) {
            if (record.getRecordId() == recordId) {
                return record;
            }
        }
        return null;
    }
}