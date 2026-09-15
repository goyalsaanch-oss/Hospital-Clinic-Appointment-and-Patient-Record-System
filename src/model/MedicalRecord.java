package model;

public class MedicalRecord {

    private int recordId;
    private Patient patient;
    private String diagnosis;
    private String treatment;
    private String date;

    
    public MedicalRecord(int recordId, Patient patient,
                         String diagnosis, String treatment, String date) {

        this.recordId = recordId;
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.date = date;
    }

    
    public int getRecordId() {
        return recordId;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getDate() {
        return date;
    }

    
    public void displayRecord() {

        System.out.println("Record ID: " + recordId);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Treatment: " + treatment);
        System.out.println("Date: " + date);
        System.out.println("----------------------------");
    }
}
